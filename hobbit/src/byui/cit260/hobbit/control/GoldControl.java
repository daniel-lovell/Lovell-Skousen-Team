/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.GoldPouch;

/**
 *
 * @author daniel
 */
public class GoldControl {
    public static int calculateNewGold(GoldPouch goldPouch, short countCorrect) {
        
        if (goldPouch.getAmount() < 0) {
            return -1;
        }
        
        if (countCorrect < 1) {
            return -1;
        }

        int gold = goldPouch.getAmount();
        int newGold = 0;

        if (countCorrect > 1) {
            newGold = (gold + 1) * 2;
        } else {
            newGold = gold + 1;
        }
        return newGold;
    }

    public static boolean pouchFull(GoldPouch goldPouch) {
        
        return goldPouch.getAmount() / goldPouch.getMaxAmount() >= 1;
    }
}
