/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.GoldPouch;
import hobbit.Hobbit;

/**
 *
 * @author daniel
 */
public class GoldControl {
    
    public static int correctAnswer(int countCorrect, int lastGoldEarned) {
        
        Game game = Hobbit.getCurrentGame();
        GoldPouch goldPouch = game.getGoldPouch();
        
        int newGold = 0;
        int newGoldEarned = 0;
        //Add Calculated Gold to GoldPouch
        newGoldEarned = calculateEarnedGold(lastGoldEarned, countCorrect);
        
        //Update the gold in the pouch
        newGold = goldPouch.getAmount() + newGoldEarned;
        if (newGold < goldPouch.getMaxAmount()) {
            goldPouch.setAmount(newGold);
        } else {
            goldPouch.setAmount(goldPouch.getMaxAmount());
        }
        
        //Return New Gold Earned
        return newGoldEarned;
    }
    
    public static int calculateEarnedGold(int lastGoldEarned, int countCorrect) {
        
        if (lastGoldEarned < 0) {
            return -1;
        }
        
        if (countCorrect < 1) {
            return -1;
        }

        int earnedGold = 0;

        if (countCorrect > 1) {
            earnedGold = (lastGoldEarned + 1) * 2;
        } else {
            earnedGold = lastGoldEarned + 1;
        }
        return earnedGold;
    }

    public static boolean pouchFull() {
        Game game = Hobbit.getCurrentGame();
        GoldPouch goldPouch = game.getGoldPouch();
        return goldPouch.getAmount() / goldPouch.getMaxAmount() >= 1;
    }

    static GoldPouch createPouch() {
        GoldPouch goldPouch = new GoldPouch();
        return goldPouch;
    }
   
}
