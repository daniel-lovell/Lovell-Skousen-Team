
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.ProgramControl;
import byui.cit260.hobbit.model.Actor;
import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class StartProgramView {
    
    BufferedReader keyboard = Hobbit.getInFile();
    PrintWriter console = Hobbit.getOutFile();
    
    //Function that controls the start of the program
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        // Create the actors

        //Create a new player object
        String playersName = null;
        try {
            playersName = this.getPlayersName();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                                    "Error reading input: " + ex.getMessage());
        }
        Player player = ProgramControl.createPlayer(playersName);
        
        //Display a customized welcome message
        this.displayWelcomeMessage(player);
        
        //DISPLAY the main menu
        //Why are we calling the main menu here?
        //We don't need this object after the welcome screen.
        //Can we just add the next lines to the main function and let this object die? -DL
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    //Displays the welcome banner when program is started
    private void displayBanner() {
        this.console.println("\n\n*********************************************************"); 
        this.console.println("*                                                       *"
                + "\n* Welcome to Hobbit!                                    *"
                + "\n* In this game, you will accompany a little hobbit      *"
                + "\n* on his journey in order to defeat the evil dragon.    *");
        this.console.println("*                                                       *"
                + "\n* Through your journey, you will dig for gold, in order *"
                + "\n* to buy a shield and weapons to defeat the dragon.     *");
        this.console.println("*                                                       *"
                + "\n* Go forth adventurers and conquer the dragon!          *"
                + "\n*                                                       *");
        this.console.println("*********************************************************");
    }
        
    //gets and returns the player's name
    private String getPlayersName() throws IOException {
        boolean valid = false;      //indicates if the name has been retrieved
        String playersName = null;  //holds player's name
        
        while(!valid) { //Why check valid? It isn't modified anywhere. See comments below. -DL
            this.console.println("Enter the player's name below:");
            
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();
            
            if (playersName.length()<2){
                ErrorView.display(this.getClass().getName(),"\nInvalid name - player name must be longer than one character");
                continue; //Could we use valid = true instead? -DL
            }
            break; //If we used valid = true in the if statement above, would we need this? -DL
        }
        return playersName;    
    }

    //Display customized welcome message
    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n=========================================");
        this.console.println("\t Welcome " + player.getName() + ".");
        this.console.println("\t Let your adventure begin!");
        this.console.println("=========================================");
    }

}
