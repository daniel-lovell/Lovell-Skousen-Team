
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GameControl;
import hobbit.Hobbit;

public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Main Menu                                         |"
            + "\n-----------------------------------------------------"
            + "\nG - Load Saved Game"
            + "\nN - New Game"
            + "\nS - Save game"
            + "\nR - Return to Game"
            + "\nH - Help"
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
                this.startSavedGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'R': // display the help menu
                this.returnToGame();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the game
                break;
            default: // create and start a new game'
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection - Try again");
                break;
        }
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(Hobbit.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSavedGame() {
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is saved: ");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
   
    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is to be saved: ");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(Hobbit.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void returnToGame() {
        if (Hobbit.getCurrentGame() != null) {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } else {
            this.console.println("\nThere is no game loaded. Start a new game or load a saved one.");
        }
    }

}
