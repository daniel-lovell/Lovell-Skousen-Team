
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Constants;
import byui.cit260.hobbit.model.Dragon;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Item;
import byui.cit260.hobbit.model.Map;
import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;


public class GameControl {
    
    public static void createNewGame(Player player){ //Where does the player come from? -DL
        
        Game game = new Game();
        Hobbit.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Dragon dragon = DragonControl.createDragon();
        game.setDragon(dragon);
        
        GoldPouch goldPouch = GoldControl.createPouch();
        game.setGoldPouch(goldPouch);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static InventoryItem[] createInventoryList(){
        
        InventoryItem[] inventory =
              new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem sword = new InventoryItem();
        sword.setInventoryType("Sword");
        sword.setExperiencePoints(0);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem shield = new InventoryItem();
        shield.setInventoryType("Shield");
        shield.setExperiencePoints(0);
        inventory[Item.shield.ordinal()] = shield;
        
        return inventory;
        
    }
   
}
