/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Constants;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Item;
import hobbit.Hobbit;

/**
 *
 * @author daniel
 */
public class SuppliesControl {
    
    public static void getSword() {
        InventoryItem[] inventory = Hobbit.getCurrentGame().getInventory();
        inventory[Item.sword.ordinal()].setQuantityInStock(1);
    }

    public static void getShield() {
        InventoryItem[] inventory = Hobbit.getCurrentGame().getInventory();
        inventory[Item.shield.ordinal()].setQuantityInStock(1);
    }

    public static void increasePouchCapacity() {
        GoldPouch pouch = Hobbit.getCurrentGame().getGoldPouch();
        pouch.setMaxAmount(Constants.MAX_GOLD_POUCH);
    }
    
}
