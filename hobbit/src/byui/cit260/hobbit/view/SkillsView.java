
package byui.cit260.hobbit.view;


public class SkillsView extends View{
       
        @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        return true;
    }
    
    public SkillsView(){
    /* private final String MENU = */ super("\n"
        + "\n-----------------------------------------------------"
        + "\n| Attack Points                                   |"
        + "\n| Defense Points                                   |"
        + "\n|          |"
        + "\n-----------------------------------------------------"
        + "\nA - Attack"
        + "\nD - Defense"
        + "\nE - Exit"
        + "\n-----------------------------------------------------");
    }
    private final String MAX = "\n"
        + "\n!!!"
        + "\n!!! Your attack and defense is maxed out. Time to fight the dragon!"
        + "\n!!! "
        + "\n!!!";
    
    /* void displayMenu() {
        
        InventoryItem sword = Hobbit.getSword();
        InventoryItem shield = Hobbit.getShield();
        char selection = ' ';
        do {
            if (SkillsControl.skillMAX(sword)|| SkillsControl.skillMAX(shield)) {
                System.out.println(MAX); //Display the full menu
                selection = 'E';
                break;
            }           
            System.out.println(MENU); //DISPLAY the Gold Menu

            String input = this.getInput(); //GET the user’s selection
            selection = input.charAt(0); //get first character of string

            this.doAction(selection); //Perform the action associated with selection
   
        } while (selection != 'E'); // a selection is not "Exit"
        
    }

    private String getInput() {
                 boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //System.out.println("Enter the player's name below:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (!"A".equals(selection)
                    && !"D".equals(selection)
                    && !"E".equals(selection)){
                System.out.println("Invalid Selection - Try again.");
                continue;
            }
            break;
        }
        return selection;
    }
    */
    private void doAction(String value){
        switch (value) {
            case "A": // create and start a new game
                this.doAttack();
                break;
            case "D": // save the current game
                this.doDefense();
                break;
            case "E": // Leave the Gold Mines
                return;
            default: // 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
    }

    private void doAttack() {
        
    }

    private void doDefense() {
        
    }
}
