/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.GoldControl;
import byui.cit260.hobbit.control.MathControl;
import byui.cit260.hobbit.model.GoldPouch;
import hobbit.Hobbit;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class GoldView {
    
    private final String MENU = "\n"
        + "\n-----------------------------------------------------"
        + "\n| Gold Mines Menu                                   |"
        + "\n| Dig for gold by answering math problems.          |"
        + "\n-----------------------------------------------------"
        + "\nA - Addition is worth 1 piece of Gold"
        + "\nS - Subtraction is worth 2 pieces of Gold"
        + "\nM - Multiplication is worth 3 pieces of Gold"
        + "\nD - Division is worth 4 pieces of Gold"
        + "\nE - Exit"
        + "\n-----------------------------------------------------";
    
    private final String FULL = "\n"
        + "\n!!!"
        + "\n!!! You can't hold any more Gold."
        + "\n!!! Either spend some gold or buy a gold pouch."
        + "\n!!!";
    
    void displayMenu() {
        
        GoldPouch goldPouch = Hobbit.getGoldPouch();
        char selection = ' ';
        do {
            if (GoldControl.pouchFull(goldPouch)) {
                System.out.println(FULL); //Display the full menu
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
                    && !"S".equals(selection)
                    && !"M".equals(selection)
                    && !"D".equals(selection)
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
            case 'A': // create and start a new game
                this.doMath("+");
                break;
            case 'S': // get and start and existing game
                this.doMath("-");
                break;
            case 'M': // display the help menu
                this.doMath("*");
                break;
            case 'D': // save the current game
                this.doMath("/");
                break;
            case 'E': // Leave the Gold Mines
                return;
            default: // 
                System.out.println("\n*** Invalid Selection - Try again");
                break;
        }
    }

    private void doMath(String operator) {

        int countCorrect = 0;
        int lastGoldEarned = 0;
        boolean userContinue = false;
        
        do {
            //Display Math
            MathControl math = new MathControl();
            System.out.println(math.makeMath(operator));

            //Get Input
            String userAnswer = this.getMathInput();

            //Do Action
            if (math.verifyMath(userAnswer)) {
                countCorrect++;
                lastGoldEarned = GoldControl.correctAnswer(countCorrect, lastGoldEarned);
            } else {
                System.out.println("\nWrong Answer");
                countCorrect = 0;
                lastGoldEarned = 0;
            }

            //Does user want to continue?
            userContinue = this.getContinueInput();

        } while (userContinue);
    }
    
    private String getMathInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //System.out.println("Enter the player's name below:");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            break;
        }
        return selection;
    }

    private boolean getContinueInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Do you want to continue? (Y/N)");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (!"Y".equals(selection) && !"N".equals(selection)){
                System.out.println("Invalid Selection - Try again.");
                continue;
            }
            break;
        }
        return "Y".equals(selection);
    }
        
        
    

}
