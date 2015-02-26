
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;


public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        player.setLifePoints(10);
        
        Hobbit.setPlayer(player);
        
        return player;
    }
    
    public static GoldPouch createSmallPouch() {
        
        GoldPouch goldPouch = new GoldPouch();
        goldPouch.setMaxAmount(2);
        
        Hobbit.setGoldPouch(goldPouch);
        
        return goldPouch;
    }
}
