
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GameControl;
import hobbit.Hobbit;

public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Main Menu                                         |"
            + "\n-----------------------------------------------------"
            + "\nG - Start Game"
            + "\nN - New Game"
            + "\nS - Save game"
            + "\nH - Help"
            + "\nM - Map (Temporary Link to Map)"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
            case 'M':
                this.displayMap();
                break;
            case 'E': // Exit the game
                break;
            default: // create and start a new game'
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(Hobbit.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
   
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayMap() {
        MapView mapView = new MapView();
        mapView.display();
    }

}
