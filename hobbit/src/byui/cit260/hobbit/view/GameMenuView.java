
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GameControl;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Location;
import hobbit.Hobbit;


public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Game Menu                                        |"
            + "\n-----------------------------------------------------"
            + "\nI - Inventory"
            + "\nM - Display Map"
            + "\nA - Actors"
            + "\nG - Gold Pouch"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
    
        @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0); 
        
        switch (choice) {
            case 'M':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();
                break;
            case 'G':
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
        //get the map locations from the current game
        Location[][] locations = Hobbit.getCurrentGame().getMap().getLocations();
        
        System.out.println("\n ! MAP !");
        System.out.println("  1 2 3 ");
        System.out.println(" -------");
        for (int i = 0; i < locations.length; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];
                if (location.getVisited()) {
                    System.out.print(location.getScene().getMapSymbol());
                } else {
                    System.out.print("?");
                }
                System.out.print("|");
            }
            System.out.println("\n -------");
        }
            
    }

    private void viewActors() {
        System.out.println("*** viewActors stub fuction called ***");
    }

    private void viewGoldPouch() {
        System.out.println("*** viewGoldPouch stub fuction called ***");
    }
    
}
