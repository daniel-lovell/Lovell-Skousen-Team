/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Dragon;
import byui.cit260.hobbit.model.InventoryItem;
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

    public static boolean battleReady(InventoryItem sword, InventoryItem shield) {
        boolean swordReady = (sword.getExperiencePoints()) / 10 >= 1;
        boolean shieldReady = (shield.getExperiencePoints()) / 10 >= 1;
        return swordReady && shieldReady;
    }

    public static void die(InventoryItem sword, InventoryItem shield) {
        sword.setExperiencePoints(3);
        shield.setExperiencePoints(3);
    }

}
