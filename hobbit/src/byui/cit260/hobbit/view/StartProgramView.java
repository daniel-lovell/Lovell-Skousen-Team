
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.ProgramControl;
import byui.cit260.hobbit.model.Player;
import java.util.Scanner;


public class StartProgramView {

    private void displayBanner() {
        System.out.println("\n\n*********************************************************"); 
        System.out.println("*                                                       *"
                + "\n* This game is called Hobbit                            *"
                + "\n* In this game, you will accompany a little hobbit      *"
                + "\n* on his journey in order to defeat the evil dragon.    *");

        System.out.println("*                                                       *"
                + "\n* Through your jounrey, you will dig for gold, in order *"
                + "\n* to afford armour and weapons to defeat the dragon.    *");
        System.out.println("*                                                       *"
                + "\n* Go forth adventurers and conquer the dragon!          *"
                + "\n*                                                       *");

        System.out.println("*********************************************************");
      
    }
        
public void startProgram() {
    this.displayBanner();
//Display the banner screen
//DISPLAY a customized welcome message
//DISPLAY the main menu 
    String playersName = this.getPlayersName();
    
    Player player = ProgramControl.createPlayer(playersName);
   
    this.displayWelcomeMessage(player);
           
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.displayMenu();
    
    
}

    private String getPlayersName() {
        boolean valid = false;              /*indicates if the name has been retrieved*/
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Enter the player's name below:");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length()<2){
                System.out.println("Invalid name - player name must be longer than one character");
                continue;
            }
            break;
        }
        return playersName;    
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n======================");
        System.out.println("\t Welcome to the Hobbit game " + player.getName());
        System.out.println("\t Let your adventure begin!");
        System.out.println("====================");
    }

}
