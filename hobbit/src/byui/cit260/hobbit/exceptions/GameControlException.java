/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.exceptions;

/**
 *
 * @author daniel
 */
public class GameControlException extends Exception {

    /**
     * Creates a new instance of <code>GameControlException</code> without
     * detail message.
     */
    public GameControlException() {
    }

    /**
     * Constructs an instance of <code>GameControlException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GameControlException(String msg) {
        super(msg);
    }
    
    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControlException(Throwable cause) {
        super(cause);
    }

    public GameControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
