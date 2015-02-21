
package byui.cit260.hobbit.view;

import java.util.Scanner;


public class HelpMenuView {
    private final String HELP = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Help Menu                                        |"
            + "\n-----------------------------------------------------"
            + "\nG - Display game objective"
            + "\nD - How to obtain gold"
            + "\nS - How to purchase supplies"
            + "\nT - How to gain experience"
            + "\nF - How to fight the dragon"
            + "\nE - Exit the help menu"
            + "\n-----------------------------------------------------";
    private final String OBJECTIVE = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Game Objective                                        |"
            + "\n-----------------------------------------------------"
            + "\n The object of the game, is to get gold, gather supplies,"
            + "\n develop experience and defeat the dragon."
            + "\n-----------------------------------------------------";
        private final String GOLD = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Obtaining Gold                                        |"
            + "\n-----------------------------------------------------"
            + "\n Look for gold mines and complete math problems to obtain gold."
            + "\n-----------------------------------------------------";
            private final String SUPPLIES = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Supplies                                       |"
            + "\n-----------------------------------------------------"
            + "\n After you obtain gold, visit the merchant to purchase supplies"
            + "\n for your adventure, such as a gold pouch, sword and shield."
            + "\n-----------------------------------------------------";
                private final String EXPERIENCE = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Gaining Experience                                        |"
            + "\n-----------------------------------------------------"
            + "\n Go to the trainer and answer math problems to gain experience to"
            + "\n increase your attack and defense."
            + "\n-----------------------------------------------------";
                private final String COMBAT = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Combat                                      |"
            + "\n-----------------------------------------------------"
            + "\n Answer math problems to defend yourself and to attack the dragon."
            + "\n-----------------------------------------------------";
    void displayHelp() {
            char selection = ' ';
            do {
                System.out.println(HELP); //DISPLAY the Main Menu

                String input = this.getInput(); //Get the user’s selection
                selection = input.charAt(0); //get first character of string

                this.doAction(selection); //Perform the action associated with selection

            } while (selection != 'E'); // a selection is not "Exit"
        
    }
     private String getInput() {
        boolean valid = false;              /*indicates if the name has been retrieved*/
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //System.out.println("Enter the player's name below:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (!"G".equals(selection)
                    && !"G".equals(selection)
                    && !"D".equals(selection)
                    && !"S".equals(selection)
                    && !"T".equals(selection)
                    && !"F".equals(selection)
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
            case 'G': // get objective
                System.out.println(OBJECTIVE);
                break;
            case 'D': // obtaining gold
                System.out.println(GOLD);
                break;
            case 'S': // obtaining supplies
                System.out.println(SUPPLIES);
                break;
            case 'T': // develop experience
                System.out.println(EXPERIENCE);
                break;
            case 'F': // combat for fighting the dragon
                System.out.println(COMBAT);
            case 'E': // Exit the help menu
                return;
            default: 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
    }
}
