
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.exceptions.GameControlException;
import byui.cit260.hobbit.exceptions.MapControlException;
import byui.cit260.hobbit.model.Actor;
import byui.cit260.hobbit.model.Constants;
import byui.cit260.hobbit.model.Dragon;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Item;
import byui.cit260.hobbit.model.Location;
import byui.cit260.hobbit.model.Map;
import byui.cit260.hobbit.model.Player;
import byui.cit260.hobbit.model.Scene;
import byui.cit260.hobbit.model.SceneType;
import hobbit.Hobbit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


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
        
        try {
            MapControl.moveActorsToStartingLocation(map);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
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

    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList = 
               Hobbit.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getInventoryType().
                        compareToIgnoreCase(inventoryList[j + 1].getInventoryType()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
    
        public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.house.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.school.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.work.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.library.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.goldScene.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.suppliesScene.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.skillsScene.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.dragonScene.ordinal()]);
        
    }
              
    public static Actor[] getSortedActorList() {
        Actor[] originalActorList = 
                Hobbit.getCurrentGame().getNpc();
        
        Actor[] actorsList = originalActorList.clone();
        
        Actor tempActor;
        for (int i = 0; i < actorsList.length-1; i++) {
            for (int j = 0; j < actorsList.length-1-i; j++) {
                if (actorsList[j].getNpc().
                        compareToIgnoreCase(actorsList[j + 1].getNpc()) > 0) {
                    tempActor = actorsList[j];
                    actorsList[j] = actorsList[j + 1];
                    actorsList[j + 1] = tempActor;
                }
            }
        }
        return actorsList;
    }

    public static void saveGame(Game game, String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        
        Game game = null;
        
        try (FileInputStream fops = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fops);
            
            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        Hobbit.setCurrentGame(game);
        
    }

}