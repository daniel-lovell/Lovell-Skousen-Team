
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.ProgramControl;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.Player;
import java.util.Scanner;


public class StartProgramView {
    
    //Function that controls the start of the program
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        
        //Create a new player object
        String playersName = this.getPlayersName();
        Player player = ProgramControl.createPlayer(playersName);
        
        //Create a default pouch size
        GoldPouch goldPouch = ProgramControl.createSmallPouch();
        
        //Display a customized welcome message
        this.displayWelcomeMessage(player);
        
        //DISPLAY the main menu
        //Why are we calling the main menu here?
        //We don't need this object after the welcome screen.
        //Can we just add the next lines to the main function and let this object die?
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }
    
    //Displays the welcome banner when program is started
    private void displayBanner() {
        System.out.println("\n\n*********************************************************"); 
        System.out.println("*                                                       *"
                + "\n* Welcome to Hobbit!                                    *"
                + "\n* In this game, you will accompany a little hobbit      *"
                + "\n* on his journey in order to defeat the evil dragon.    *");
        System.out.println("*                                                       *"
                + "\n* Through your jounrey, you will dig for gold, in order *"
                + "\n* to buy a shield and weapons to defeat the dragon.     *");
        System.out.println("*                                                       *"
                + "\n* Go forth adventurers and conquer the dragon!          *"
                + "\n*                                                       *");
        System.out.println("*********************************************************");
    }
        
    //gets and returns the player's name
    private String getPlayersName() {
        boolean valid = false;      //indicates if the name has been retrieved
        String playersName = null;  //holds player's name
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) { //Why check valid? It isn't modified anywhere. See comments below. -DL
            System.out.println("Enter the player's name below:");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length()<2){
                System.out.println("Invalid name - player name must be longer than one character");
                continue; //Could we use valid = true instead? -DL
            }
            break; //If we used valid = true in the if statement above, would we need this? -DL
        }
        return playersName;    
    }

    //Display customized welcome message
    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n======================");
        System.out.println("\t Welcome to Hobbit " + player.getName());
        System.out.println("\t Let your adventure begin!");
        System.out.println("====================");
    }

}
