
package byui.cit260.hobbit.view;


public class SkillsView extends View{
    
    public SkillsView(){
        super("\n"
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
   
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        return true;
    }
    
    private void doAction(String value){
        switch (value) {
            case "A": // create and start a new game
                this.buildAttack();
                break;
            case "D": // save the current game
                this.buildDefense();
                break;
            case "E": // Leave the Gold Mines
                return;
            default: // 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
    }

    private void buildAttack() {
        System.out.println("\n*** buildAttack() called");
    }

    private void buildDefense() {
        System.out.println("\n*** buildDefense() called");
    }
    
}
