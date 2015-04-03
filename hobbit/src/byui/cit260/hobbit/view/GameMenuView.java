
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GameControl;
import byui.cit260.hobbit.model.Actor;
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
        
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t" +
                           "Required" + "\t" + 
                           "In Stock");
        
        for (InventoryItem inventoryItem : inventory) {
            
            this.console.println(inventoryItem.getInventoryType() + "\t     " +
                               inventoryItem.getRequiredAmount() + "\t  " +
                               inventoryItem.getQuantityInStock());
        }
    }
     

    private void displayMap() {
        //get the map locations from the current game
        Location[][] locations = Hobbit.getCurrentGame().getMap().getLocations();
        
        this.console.println("\n ! MAP !");
        this.console.println("  1 2 3 ");
        this.console.println(" -------");
        for (int i = 0; i < locations.length; i++) {
            this.console.print(i + 1 + "|");
            for (int j = 0; j < locations[i].length; j++) {
                Location location = locations[i][j];
                if (location.getVisited()) {
                    this.console.print(location.getScene().getMapSymbol());
                } else {
                    this.console.print("?");
                }
                this.console.print("|");
            }
            this.console.println("\n -------");
        }
            
    }

    private void viewActors() {
        //this.console.println("*** viewActors stub fuction called ***");
                Actor[] actors = GameControl.getSortedActorList();
        
        this.console.println("\nView Actor Locations");
        this.console.println("Name" + "\t" +
                            "Location" + "\t" );
        
        for (Actor actors : actor) {
            
            this.console.println(Actors.getActors() + "\t     " +
                               actors.getDescription() + "\t  " +
                               actors.getCoordinates());
        }
    }

    private void viewGoldPouch() {
        this.console.println("*** viewGoldPouch stub fuction called ***");
    }
    
}
