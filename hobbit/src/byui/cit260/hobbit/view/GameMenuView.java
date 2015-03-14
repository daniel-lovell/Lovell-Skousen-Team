
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GameControl;
import byui.cit260.hobbit.model.InventoryItem;


public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Game Menu                                        |"
            + "\n-----------------------------------------------------"
            + "\nG - Inventory"
            + "\nN - Display Map"
            + "\nS - Actors"
            + "\nH - Gold Pouch"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
    
        @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0); 
        
        switch (choice) {
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();
                break;
            case 'S':
                this.viewGoldPouch();
                break;
            case 'E':
                break;
        }
            return true;
    }
    public void viewInventory() {
        
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                           "Required" + "\t" + 
                           "In Stock");
        
        for (InventoryItem inventoryItem : inventory) {
            
            System.out.println(inventoryItem.getInventoryType() + "\t     " +
                               inventoryItem.getRequiredAmount() + "\t  " +
                               inventoryItem.getQuantityInStock());
        }
    }

    private void displayMap() {
        System.out.println("*** displayMap stub fuction called ***");
    }

    private void viewActors() {
        System.out.println("*** viewActors stub fuction called ***");
    }

    private void viewGoldPouch() {
        System.out.println("*** viewGoldPouch stub fuction called ***");
    }
    
}
