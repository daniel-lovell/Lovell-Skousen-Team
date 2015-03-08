
package byui.cit260.hobbit.view;

import byui.cit260.hobbit.control.DragonControl;
import byui.cit260.hobbit.control.MathControl;
import byui.cit260.hobbit.model.Dragon;
import byui.cit260.hobbit.model.Player;
import hobbit.Hobbit;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class DragonView {
    
    public DragonView() {
    }
    
    private final String DEFEND = "\n"
            + "\n!!!"
            + "\n!!! The dragon is attacking! Defend yourself with math!"
            + "\n!!!";
            
    private final String ATTACK = "\n"
            + "\n!!!"
            + "\n!!! The dragon is weak. Attack him with math!"
            + "\n!!!";
            
    private final String DIE = "\n"
            + "\n!!!"
            + "\n!!! I regret to inform you that your math skills"
            + "\n!!! were not sufficient to slay the dragon."
            + "\n!!! Unfortunately, you are now dead."
            + "\n!!!"
            + "\n!!! Luckily this is only a game and you can try again."
            + "\n!!!";
            
    private final String WIN = "\n"
            + "\n!!!"
            + "\n!!! It pleases me to inform you that your math skills"
            + "\n!!! were sufficient to slay the dragon."
            + "\n!!! Yipee!"
            + "\n!!!"
            + "\n!!! Unfortunately, this was the only dragon in the game and"
            + "\n!!! and the game is now over."
            + "\n!!!"
            + "\n!!! Credits: Kelsey Baker, Daniel Lovell, and Brendan Skousen";
    
    private final String NOT_READY = "\n"
            + "\n!!!"
            + "\n!!! You are not ready for battle."
            + "\n!!! You must have a shield with 10 points,"
            + "\n!!! and a sword with 10 points."
            + "\n!!!";
    
    public void display() {
        //Sword sword = Hobbit.getSword();
        //Shield shield = Hobbit.getShield();
        Player player = Hobbit.getPlayer();
        Dragon dragon = new Dragon();
        DragonControl.initializeBattle(player, dragon);
        //if (DragonControl.battleReady(sword, shield)) {
            
            while (DragonControl.alive(player, dragon)) {
                this.doAction(player, dragon);
            }
            
            if ("dragon".equals(DragonControl.winner(player, dragon))) {
                System.out.println(DIE);
                //DragonControl.die();
            } else {
                System.out.println(WIN);
                //DragonControl.win();
            }
            
            
        //} else {
        //    System.out.println(NOT_READY);
        //}
        
    }

    private void doAction(Player player, Dragon dragon) {
        MathControl math = new MathControl();
        if (DragonControl.alive(player, dragon)) { //Defend
            //Display story
            System.out.println(DEFEND);
            //Show math problem
            System.out.println(math.makeMathRandom());
            
            //Get answer
            String userAnswer = this.getInput();
            
            //Verify Answer
            if (!math.verifyMath(userAnswer)) {
                this.doActionDefenseFailed(player);
            }
            
        }
        if (DragonControl.alive(player, dragon)) { //Attack
            int countCorrect = 0;
            int lastAttackStrength = 0;
            do {
                //Display story
                System.out.println(ATTACK);
                //Show math problem
                System.out.println(math.makeMathRandom());

                //Get answer
                String userAnswer = this.getInput();

                //Verify Answer
                if (math.verifyMath(userAnswer)) {
                    countCorrect++;
                    lastAttackStrength = this.doActionAttackWorked(lastAttackStrength, countCorrect, dragon);
                    
                } else {
                    this.doActionAttackFailed();
                    countCorrect = 0;
                    lastAttackStrength = 0;
                }
                
            } while (countCorrect > 0 && DragonControl.alive(player, dragon));
        }
    }

    public String getInput() {
        boolean valid = false;              /*indicates if the name has been retrieved*/
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

    private void doActionDefenseFailed(Player player) {
        DragonControl.defenseFailed(player);
        System.out.println("Defense Failed");
    }

    private int doActionAttackWorked(int lastAttackStrength, int countCorrect, Dragon dragon) {
        int attackStrength = DragonControl.calculateAttackStrength(lastAttackStrength, countCorrect);
        DragonControl.attackWorked(attackStrength, dragon);
        System.out.println("Attack Succeeded!");
        
        return attackStrength;
    }

    private void doActionAttackFailed() {
        System.out.println("Attack Failed");
    }


}
