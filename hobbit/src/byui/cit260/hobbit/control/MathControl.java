
package byui.cit260.hobbit.control;

import java.util.Random;

/**
 *
 * @author daniel
 * 
 * makeMath() creates a new problem based on the argument used and returns a
 * String that contains the problem.
 * 
 * verifyMath() takes the user's answer and compares it to the correct answer.
 * 
 * Note: Every time that makeMath() is run it will create a problem.
 * verifyMath() will verify against the last time makeMath() was run.
 * 
 * Future Changes:
 *  Remove setters
 *  Turn makeMath() and makeMathRandom() into constructors
 *      Make makeMath() and makeMathRandom() private
 *      Change calls for makeMath() and makeMathRandom() into calls for getProblem()
 * 
 */
public class MathControl {

    private int operand1;
    private int operand2;
    private char operator;
    private String answer;
    private String problem;

    public MathControl() {
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    //I think everything in the makeMath function except the String return
    //should go in the constructor, but I didn't know how to validate inside a
    //constructor because constructors don't return anything. Then I would
    //replace this function with getProblem() that would return the String. -Daniel
    public String makeMath(String type) {
        char op = type.charAt(0);
        
        //Validates arguments
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            this.problem = "Bad Operator";
            return this.problem;
        }
        
        //Updates operation type
        this.operator = op;
        
        //Decides which type of operation to make
        switch (this.operator) {
            case '+': makeAdd(); break;
            case '-': makeSubtract(); break;
            case '*': makeMultiply(); break;
            case '/': makeDivide(); break;
        }
        
        //Return created problem as String
        this.problem = this.operand1 + " " + this.operator + " " + this.operand2 + " = ?";
        return this.problem;
    }
    
    public String makeMathRandom() {
        //Randomly select operator
        char[] ops = {'+', '-', '*', '/'};
        Random rand = new Random();
        char op = ops[rand.nextInt(4)];
        
        //Updates operation type
        this.operator = op;
        
        //Decides which type of operation to make
        switch (this.operator) {
            case '+': makeAdd(); break;
            case '-': makeSubtract(); break;
            case '*': makeMultiply(); break;
            case '/': makeDivide(); break;
        }
        
        //Return created problem as String
        this.problem = this.operand1 + " " + this.operator + " " + this.operand2 + " = ?";
        return this.problem;
    }
    
    public boolean verifyMath(String userAnswer) {
        
        return userAnswer.equals(this.answer);
        
    }

    private void makeAdd() {
        Random random = new Random();
        this.operand1 = random.nextInt(40);
        this.operand2 = random.nextInt(40);
        this.answer = String.valueOf(this.operand1 + this.operand2);
    }

    private void makeSubtract() {
        Random random = new Random();
        this.operand1 = random.nextInt(20);
        this.operand2 = random.nextInt(20);
        this.answer = String.valueOf(this.operand1 - this.operand2);
    }

    private void makeMultiply() {
        Random random = new Random();
        this.operand1 = random.nextInt(11);
        this.operand2 = random.nextInt(11);
        this.answer = String.valueOf(this.operand1 * this.operand2);
    }

    private void makeDivide() {
        Random random = new Random();
        //This loop is to ensure that the answer is always an integer.
        do {
            this.operand1 = random.nextInt(100);
            this.operand2 = random.nextInt(9) + 1;
        } while (this.operand1 % this.operand2 != 0);
        this.answer = String.valueOf(this.operand1 / this.operand2);
    }
    
}
