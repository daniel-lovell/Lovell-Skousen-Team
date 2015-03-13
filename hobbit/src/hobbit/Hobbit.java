/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit;

import byui.cit260.hobbit.model.Player;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.view.StartProgramView;

/**
 *
 * @author Brendan
 */
public class Hobbit {
    
    private static Game currentGame = null;
    private static Player player = null;
   
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
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

}
