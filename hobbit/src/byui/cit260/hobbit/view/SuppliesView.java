
package byui.cit260.hobbit.view;

import java.util.Scanner;


public class SuppliesView {
    private final String STORE = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Purchase equipment                                      |"
            + "\n-----------------------------------------------------"
            + "\nS - Purchase a sword."
            + "\nD - Purchase a shield."
            + "\nG - Purchase a gold pouch."
            + "\nE - Exit store."
            + "\n-----------------------------------------------------";
    private final String SWORD = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Sword                                        |"
            + "\n-----------------------------------------------------"
            + "\n Purchase a sword to increase your attack and fight the dragon."
            + "\n-----------------------------------------------------";
        private final String SHIELD = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Shield                                        |"
            + "\n-----------------------------------------------------"
            + "\n Purchase a shield to increase your defense."
            + "\n-----------------------------------------------------";
            private final String GOLDPOUCH = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Gold Pouch                                     |"
            + "\n-----------------------------------------------------"
            + "\n Buy a pouch to store more gold."
            + "\n-----------------------------------------------------";
            
            void displayStore() {
            char selection = ' ';
            do {
                System.out.println(STORE); //DISPLAY the Main Menu

                String input = this.getInput();
                selection = input.charAt(0); 

                this.doAction(selection);

            } while (selection != 'E'); 
        

}
       private String getInput() {
        boolean valid = false;       
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (!"S".equals(selection)
                    && !"S".equals(selection)
                    && !"D".equals(selection)
                    && !"G".equals(selection)
                    && !"E".equals(selection)){
                System.out.println("Invalid Selection - Try again.");
                continue;
            }
            break;
        }
        return selection;
       }
       
       private void doAction(char choice) {
        switch (choice) {
            case 'S': // obtain sword.
                System.out.println(SWORD);
                break;
            case 'D': // obtain shield
                System.out.println(SHIELD);
                break;
            case 'G': // obtain gold pouch
                System.out.println(GOLDPOUCH);
                break;
            case 'E': // Exit the store
                return;
            default: 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
            }
   
    }
}