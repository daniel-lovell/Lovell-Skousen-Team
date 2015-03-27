
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
        this.console.println("\n*** buildAttack() called");
    }

    private void buildDefense() {
        this.console.println("\n*** buildDefense() called");
    }
    
}
