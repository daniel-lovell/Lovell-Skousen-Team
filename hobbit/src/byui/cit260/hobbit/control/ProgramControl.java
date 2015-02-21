
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;


public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        Hobbit.setPlayer(player);
        
        return player;
    }
}
