/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit;

import byui.cit260.hobbit.model.Player;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.Dragon;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Location;
import byui.cit260.hobbit.model.Map;
import byui.cit260.hobbit.model.Scene;
import byui.cit260.hobbit.view.StartProgramView;

/**
 *
 * @author Brendan
 */
public class Hobbit {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static GoldPouch goldPouch = null;
    private static InventoryItem sword = null;
    private static InventoryItem shield = null;
   
    public static void main(String[] args) {    
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        
        /*
        //Test Player Class
        Player player = new Player();
        
        player.setName("Bob");
        player.setLifePoints(10);
        
        String playerInfo = player.toString();
        System.out.println(playerInfo);
        
        //Test Game Class
        Game game = new Game();
        
        game.setLastSaved(1422586253);
        game.setCreated(1422586253);
        
        String gameInfo = game.toString();
        System.out.println(gameInfo);
        
        //Test Dragon Class
        Dragon dragon = new Dragon();
        
        dragon.setLifePoints(22);
        
        String dragonInfo = dragon.toString();
        System.out.println(dragonInfo);
        
        //Test ExperienceMedallion Class
        ExperienceMedallion experienceMedallion = new ExperienceMedallion();
        
        experienceMedallion.setAmountAttack(4);
        experienceMedallion.setMaxAmountAttack(8);
        experienceMedallion.setAmountDefend(5);
        experienceMedallion.setMaxAmountDefend(9);
        
        String experienceMedallionInfo = experienceMedallion.toString();
        System.out.println(experienceMedallionInfo);
        
        //Test Location Class
        Location location = new Location();
        
        location.setRowCoordinate(2);
        location.setColumnCoordinate(3);
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
        // Test scene class
        Scene scene = new Scene();
        
        scene.setDescription("Main scene description");
        
        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);
        
        //Test SupplyScene Class
        SupplyScene supplyScene = new SupplyScene();
        
        supplyScene.setDescription("Supply Scene Description");
        
        String supplySceneInfo = supplyScene.toString();
        System.out.println(supplySceneInfo);
        
        //Test DragonScene Class
        DragonScene dragonScene = new DragonScene();
        
        dragonScene.setDescription("Dragon Scene Description");
        
        String dragonSceneInfo = dragonScene.toString();
        System.out.println(dragonSceneInfo);

        //Test GoldScene Class
        GoldScene goldScene = new GoldScene();
        
        goldScene.setDescription("Gold Scene Description");
        
        String goldSceneInfo = goldScene.toString();
        System.out.println(goldSceneInfo);
        
        //Test Map Class
        Map map = new Map();
        
        map.setRowCount(3);
        map.setColumnCount(3);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        //Test GoldPouch Class
        GoldPouch goldPouch = new GoldPouch();
        
        goldPouch.setAmount(2);
        goldPouch.setMaxAmount(10);
        
        String goldPouchInfo = goldPouch.toString();
        System.out.println(goldPouchInfo);
                */
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hobbit.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Hobbit.player = player;
    }

    public static GoldPouch getGoldPouch() {
        return goldPouch;
    }

    public static void setGoldPouch(GoldPouch goldPouch) {
        Hobbit.goldPouch = goldPouch;
    }

    public static InventoryItem getSword() {
        return sword;
    }

    public static void setSword(InventoryItem sword) {
        Hobbit.sword = sword;
    }

    public static InventoryItem getShield() {
        return shield;
    }

    public static void setShield(InventoryItem shield) {
        Hobbit.shield = shield;
    }
    
    
    
    
}
