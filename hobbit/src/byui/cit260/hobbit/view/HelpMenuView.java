
package byui.cit260.hobbit.view;


public class HelpMenuView extends View {
    public HelpMenuView() {
        super("\n"
            + "\n-----------------------------------------------------"
            + "\n| Help Menu                                        |"
            + "\n-----------------------------------------------------"
            + "\nG - Display game objective"
            + "\nD - How to obtain gold"
            + "\nS - How to purchase supplies"
            + "\nT - How to gain experience"
            + "\nF - How to fight the dragon"
            + "\nE - Exit the help menu"
            + "\n-----------------------------------------------------");
    }
    
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

    @Override
    public boolean doAction(Object obj){
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'G': // get objective.
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
                break;
            default: 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
        return true;
    }
}
