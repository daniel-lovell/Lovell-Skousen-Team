/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.view;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Main Menu                                         |"
            + "\n-----------------------------------------------------"
            + "\nG - Start Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n-----------------------------------------------------";
    
    void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); //DISPLAY the Main Menu
            
            String input = this.getInput(); //GET the user’s selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //Perform the action associated with selection
   
        } while (selection != 'E'); // a selection is not "Exit"
        
    }

    private String getInput() {
        boolean valid = false;              /*indicates if the name has been retrieved*/
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //System.out.println("Enter the player's name below:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (!"G".equals(selection)
                    && !"H".equals(selection)
                    && !"S".equals(selection)
                    && !"E".equals(selection)){
                System.out.println("Invalid Selection - Try again.");
                continue;
            }
            break;
        }
        return selection;
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start and existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the game
                return;
            default: // create and start a new game'
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");    }
    
}
