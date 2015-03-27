
package byui.cit260.hobbit.view;


public class SuppliesView extends View {

    public SuppliesView(){
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Purchase equipment                                      |"
            + "\n-----------------------------------------------------"
            + "\nS - Purchase a sword."
            + "\nD - Purchase a shield."
            + "\nG - Purchase a gold pouch."
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
        this.console.println("*** obtainSword function called ***");    
    }

    private void obtainShield() {
        this.console.println("*** obtainShield function called ***");
    }

    private void obtainGoldPouch() {
        this.console.println("*** obtainGoldPouch function called ***");
    }

}