/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

/**
 *
 * @author daniel
 */
public class DragonControl {
    public static int calculateAttackStrength(int lastAttackStrength, int countCorrect) {
        
        if (lastAttackStrength < 0) {
            return -1;
        }
        
        if (countCorrect < 1) {
            return -1;
        }

        int newAttackStrength = 0;
        
        if (countCorrect > 1) {
            newAttackStrength = (lastAttackStrength + 1) * 2;
        } else {
            newAttackStrength = lastAttackStrength + 1;
        }

        return newAttackStrength;
        
    }
}
