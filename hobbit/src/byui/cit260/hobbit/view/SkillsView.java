
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.InventoryItem;
import byui.cit260.hobbit.model.Item;
import hobbit.Hobbit;
import java.io.IOException;


public class SkillsView extends View{
    
    Game game = Hobbit.getCurrentGame();
    InventoryItem[] inventory = game.getInventory();
    InventoryItem sword = inventory[Item.sword.ordinal()];
    InventoryItem shield = inventory[Item.shield.ordinal()];
    
    public SkillsView(){
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Develop Skills                                    |"
            + "\n-----------------------------------------------------"
            + "\nA - Attack Skills"
            + "\nD - Defense Skills"
            + "\nE - Exit"
            + "\n-----------------------------------------------------");
    }
   
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'A': 
                this.buildAttack();
                break;
            case 'D': 
                this.buildDefense();
                break;
            case 'E': 
                break;
            default: // 
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection - Try again");
                break;
        }
        return true;
    }

    private void buildAttack() {
        String selection = null;
        do {
            this.console.println("1 + 1 = ");
            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                                        "Error reading input: " + ex.getMessage());
            }

            selection = selection.trim();

            if (selection.length() < 1) { //blank value entered
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
            }
        } while (!"2".equals(selection));
        sword.setExperiencePoints(10);
    }

    private void buildDefense() {
        String selection = null;
        do {
            this.console.println("1 + 1 = ");
            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                                        "Error reading input: " + ex.getMessage());
            }

            selection = selection.trim();

            if (selection.length() < 1) { //blank value entered
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
            }
            
        } while (!"2".equals(selection));
        shield.setExperiencePoints(10);
    }
    
}
