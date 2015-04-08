
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GameControl;
import byui.cit260.hobbit.model.Actor;
import byui.cit260.hobbit.model.GoldPouch;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Location;
import hobbit.Hobbit;
import java.util.ArrayList;


public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Game Menu                                        |"
            + "\n-----------------------------------------------------"
            + "\nM - Explore Map"
            + "\nG - Gold Pouch"
            + "\nI - Inventory"
            + "\nA - Actors"
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
        this.console.println("Description\tIn Stock/Required\tExerience Points");

        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getInventoryType() + "\t\t"
                    + inventoryItem.getQuantityInStock() + "/" + inventoryItem.getRequiredAmount() + "\t\t\t"
                    + inventoryItem.getExperiencePoints());
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
            
        MapView map = new MapView();
        map.display();
        
    }
    
    private void viewActors() {
        //this.console.println("*** viewActors stub fuction called ***");
                Actor[] actors = GameControl.getSortedActorList();
        
        this.console.println("\nView Actor Locations");
        this.console.println("Name" + "\t" +
                            "Location" + "\t" );
        
        
        ArrayList<String> ArrayList = new ArrayList<String>(3);{
            ArrayList.add(0, "dwarf");
            ArrayList.add(1, "merchant");
            ArrayList.add(2, "wizard");
            ArrayList.get(0);
            ArrayList.get(1);
            ArrayList.get(2);
    }
        Iterable<Actor> actor = null;  //I don't think this is actually correct
        
        for (Actor npcs : actor) {
            
            this.console.println(Actors.getActors() + "\t     " +
                               npcs.getDescription() + "\t  " +
                               npcs.getCoordinates());
        }
    }

    private void viewGoldPouch() {
        GoldPouch pouch = Hobbit.getCurrentGame().getGoldPouch();

        this.console.println("\nYour Gold Pouch:");
        this.console.println("Capacity" + "\t" + "Current Amount");
        this.console.println(pouch.getMaxAmount() + "\t\t"
                + pouch.getAmount());
    }

    private static class Actors {

        private static String getActors() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Actors() {
        }
    }

}
