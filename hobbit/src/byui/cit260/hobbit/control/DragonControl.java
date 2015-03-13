/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Dragon;
import byui.cit260.hobbit.model.Player;


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

    public static void initializeBattle(Player player, Dragon dragon) {
        player.setLifePoints(5);
        dragon.setLifePoints(10);
    }

    public static void defenseFailed(Player player) {
        player.setLifePoints(player.getLifePoints() - 1);
    }

    public static boolean alive(Player player, Dragon dragon) {
        if (player.getLifePoints() <= 0 || dragon.getLifePoints() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String winner(Player player, Dragon dragon) {
        if (player.getLifePoints() <= 0) {
            return "dragon";
        } else {
            return "player";
        }
    }

    public static void attackWorked(int attackStrength, Dragon dragon) {
        dragon.setLifePoints(dragon.getLifePoints() - attackStrength);
    }

    static Dragon createDragon() {
        Dragon dragon = new Dragon();
        return dragon;
    }

}
