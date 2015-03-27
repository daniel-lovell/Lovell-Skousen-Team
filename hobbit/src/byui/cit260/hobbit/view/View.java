
package byui.cit260.hobbit.view;

import hobbit.Hobbit;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;


public abstract class View implements ViewInterface{
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = Hobbit.getInFile();
    protected final PrintWriter console = Hobbit.getOutFile();
    
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        
        do {
            System.out.println(this.promptMessage);
            value = this.getInput();
            this.doAction(value);
        } while (!value.equals("E"));
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
    
        while (!valid) {
            System.out.println("\t\nEnter your selection below:");
            
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if(selection.length() < 1){ //blank value entered
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
            }
            break;
        }
        return selection;
    }
}