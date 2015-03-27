/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit;

import byui.cit260.hobbit.model.Player;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Brendan
 */
public class Hobbit {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
   
    public static void main(String[] args) {
        try {
            // open character stream files for input and output
            Hobbit.inFile = new BufferedReader(new InputStreamReader(System.in));
            Hobbit.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            Hobbit.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            
        } catch (Throwable te) {
            System.out.println("Exception: " + te.toString() + 
                                "\nCause: " + te.getCause() +
                                "\nMessage: " + te.getMessage());
            te.printStackTrace();
        }
        
        finally {
            try {
                if (Hobbit.inFile != null) Hobbit.inFile.close();
                if (Hobbit.outFile != null) Hobbit.outFile.close();
                if (Hobbit.logFile != null) Hobbit.logFile.close();
            } catch (IOException ex){
                System.out.println("Error closing files");
                return;
            }
        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hobbit.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Hobbit.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Hobbit.logFile = logFile;
    }

}
