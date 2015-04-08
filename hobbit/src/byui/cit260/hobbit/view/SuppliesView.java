
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.SuppliesControl;
import byui.cit260.hobbit.model.Constants;
import byui.cit260.hobbit.model.Game;
import byui.cit260.hobbit.model.GoldPouch;
import hobbit.Hobbit;


public class SuppliesView extends View {
    
    Game game = Hobbit.getCurrentGame();
    GoldPouch goldPouch = game.getGoldPouch();

    public SuppliesView(){
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Purchase equipment                                      |"
            + "\n-----------------------------------------------------"
            + "\nG - Purchase a gold pouch: " + Constants.COST_OF_GOLD_POUCH + " gold."
            + "\nS - Purchase a sword: " + Constants.COST_OF_SWORD + " gold."
            + "\nD - Purchase a shield: " + Constants.COST_OF_SHIELD + " gold."
            + "\nE - Exit store."
            + "\n-----------------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'S': // obtain sword.
                this.obtainSword();
                break;
            case 'D': // obtain shield
                this.obtainShield();
                break;
            case 'G': // obtain gold pouch
                this.obtainGoldPouch();
                break;
            case 'E': // Exit the store
                break;
            default: 
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection - Try again");
                break;
            }
        return true;
    }

    private void obtainSword() {
        if (goldPouch.getAmount() >= Constants.COST_OF_SWORD) {
            SuppliesControl.getSword();
            goldPouch.setAmount(goldPouch.getAmount() - Constants.COST_OF_SWORD);
        } else {
            this.console.println("\nYou don't have enough gold.");
        }
    }

    private void obtainShield() {
        if (goldPouch.getAmount() >= Constants.COST_OF_SHIELD) {
            SuppliesControl.getShield();
            goldPouch.setAmount(goldPouch.getAmount() - Constants.COST_OF_SHIELD);
        } else {
            this.console.println("\nYou don't have enough gold.");
        }
    }

    private void obtainGoldPouch() {
        if (goldPouch.getAmount() >= Constants.COST_OF_GOLD_POUCH) {
            SuppliesControl.increasePouchCapacity();
            goldPouch.setAmount(goldPouch.getAmount() - Constants.COST_OF_GOLD_POUCH);
        } else {
            this.console.println("\nYou don't have enough gold.");
        }
    }

}