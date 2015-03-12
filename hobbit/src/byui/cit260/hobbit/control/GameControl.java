
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Map;
import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;


public class GameControl {
    public static void createNewGame(Player player){
    

        
        Game game = new Game();
        Hobbit.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    public static InventoryItem[] createInventoryList(){
        
        InventoryItem[] inventory =
              new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(1);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem shield = new InventoryItem();
        shield.setDescription("Shield");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(1);
        inventory[Item.shield.ordinal()] = shield;
        
        return inventory;
    }
   
}
