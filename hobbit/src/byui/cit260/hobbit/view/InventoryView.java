
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;


public class InventoryView extends View {

    private static void viewInventory(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public InventoryView(){
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Open Inventory                                      |"
            + "\n-----------------------------------------------------"
            + "\nS - Sword."
            + "\nD - Shield."
            + "\nE - Exit inventory."
            + "\n-----------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'I': //view inventory;
                this.viewInventory();
                break;
            case 'E': // Exit the store
                break;
            default: 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
            }
        return true;
    }
     private void Inventory() {
        InventoryView.viewInventory(Hobbit.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    public static void main(String args[]){
        inventoryItem<String> item = new inventoryItem<String>();
            item.add("sword");
            item.add("shield");
            
            for(String I:item){
                System.out.println(I);
            }
    }
    InventoryItem[] items = Hobbit.getCurrentGame().getInventory();
        inventoryItem itemList = new inventoryItem();

    private void viewInventory() {
        System.out.println("*** viewInventory function called ***");  
    }

    private static class inventoryItem {

        public inventoryItem() {
        }
    }
        
        
}

