
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.Map;
import byui.cit260.hobbit.model.Scene;
import byui.cit260.hobbit.model.SceneType;
import hobbit.Hobbit;


public class MapControl {
    
    public static Map createMap() {
        Map map = new Map(3,3);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation() ***");
    }

    private static Scene[] createScenes() {
        
        Game game = Hobbit.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene goldScene = new Scene();
        goldScene.setDescription("\nThe Gold Mines");
        goldScene.setBlocked(false);
        goldScene.setMapSymbol("G");
        scenes[SceneType.goldScene.ordinal()] = goldScene;
        
        Scene skillsScene = new Scene();
        skillsScene.setDescription("\nThe Skills Trainer");
        skillsScene.setBlocked(false);
        skillsScene.setMapSymbol("S");
        scenes[SceneType.skillsScene.ordinal()] = skillsScene;
        
        Scene suppliesScene = new Scene();
        suppliesScene.setDescription("\nThe Merchant");
        suppliesScene.setBlocked(false);
        suppliesScene.setMapSymbol("M");
        scenes[SceneType.suppliesScene.ordinal()] = suppliesScene;
        
        Scene dragonScene = new Scene();
        dragonScene.setDescription("\nThe Dragon's Lair");
        dragonScene.setBlocked(false);
        dragonScene.setMapSymbol("D");
        scenes[SceneType.dragonScene.ordinal()] = dragonScene;
        
        Scene house = new Scene();
        house.setDescription("\nThe Hobbit's Home");
        house.setBlocked(false);
        house.setMapSymbol("H");
        scenes[SceneType.house.ordinal()] = house;
        
        Scene school = new Scene();
        school.setDescription("\nThe Local School for Hobbits");
        school.setBlocked(false);
        school.setMapSymbol("C");
        scenes[SceneType.school.ordinal()] = school;
        
        Scene work = new Scene();
        work.setDescription("\nThe Hobbit's Work");
        work.setBlocked(false);
        work.setMapSymbol("W");
        scenes[SceneType.work.ordinal()] = work;
        
        Scene library = new Scene();
        library.setDescription("\nThe Local Hobbit Library");
        library.setBlocked(false);
        library.setMapSymbol("L");
        scenes[SceneType.library.ordinal()] = work;
        
        Scene forest = new Scene();
        forest.setDescription("\nThe Forest");
        forest.setBlocked(false);
        forest.setMapSymbol("F");
        scenes[SceneType.forest.ordinal()] = forest;
        
        return scenes;
    }
}
