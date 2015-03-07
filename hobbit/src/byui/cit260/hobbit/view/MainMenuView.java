
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
            + "\nD - Dragon"
            + "\nO - Gold"
            + "\nB - Store"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start and existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "B": // save the current game
                this.displayStore();
                break;
            case "D": // save the current game
                this.displayDragon();
                break;
            case "O": // save the current game
                this.displayGold();
                break;
            case "E": // Exit the game
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

    private void displayStore() {
        SuppliesView suppliesStore = new SuppliesView();
        suppliesStore.display();
    }
    
    private void displaySkills(){
        SkillsView skillsView = new SkillsView();
        skillsView.display();
    }

    private void displayDragon() {
        DragonView dragonView = new DragonView();
        dragonView.display();
    }

    private void displayGold() {
        GoldView goldView = new GoldView();
        goldView.displayMenu();
    }
    
}
