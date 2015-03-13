
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GoldControl;
import byui.cit260.hobbit.control.SkillsControl;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Item;
import hobbit.Hobbit;

public class MapView extends View {
    
    Game game = Hobbit.getCurrentGame();
    
    public MapView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Map Menu                                         |"
            + "\n-----------------------------------------------------"
            + "\nH - Help"
            + "\nD - Dragon"
            + "\nO - Gold"
            + "\nB - Store"
            + "\nS - Skills"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice) {
            case 'H':
                this.displayHelpMenu();
                break;
            case 'B':
                this.displayStore();
                break;
            case 'D':
                this.displayDragon();
                break;
            case 'O':
                this.displayGold();
                break;
            case 'S':
                this.displaySkills();
                break;
            case 'E': // Exit the game
                break;
            default: // create and start a new game'
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
        return true;
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void displayStore() {
        SuppliesView suppliesStore = new SuppliesView();
        suppliesStore.display();
    }
    
    private void displaySkills(){
        InventoryItem[] inventoryItems = game.getInventory();
        InventoryItem sword = inventoryItems[Item.shield.ordinal()];
        InventoryItem shield = inventoryItems[Item.shield.ordinal()];
        
        if (SkillsControl.skillMax(sword)|| SkillsControl.skillMax(shield)) {
            System.out.println("\n"
                + "\n!!!"
                + "\n!!! Your attack and defense is maxed out. Time to fight the dragon!"
                + "\n!!!");
        } else {
            SkillsView skillsView = new SkillsView();
            skillsView.display();
        }
    }

    private void displayDragon() {
        DragonView dragonView = new DragonView();
        dragonView.display();
    }

    private void displayGold() {
        GoldPouch goldPouch = game.getGoldPouch();
        if (GoldControl.pouchFull(goldPouch)) {
            System.out.println("\n"
                + "\n!!!"
                + "\n!!! You can't hold any more Gold."
                + "\n!!! Either spend some gold or buy a gold pouch."
                + "\n!!!");
        } else {
            GoldView goldView = new GoldView();
            goldView.display();
        }
    }
    
}
