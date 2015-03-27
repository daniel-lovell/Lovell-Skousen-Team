
package byui.cit260.hobbit.view;

import hobbit.Hobbit;
import java.io.PrintWriter;

public class ErrorView {
    
    private static final PrintWriter errorFile = Hobbit.getOutFile();
    private static final PrintWriter logFile = Hobbit.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println("_________________________________________________"
                + "\n- ERROR - " + errorMessage
                + "\n_________________________________________________");
        
        logFile.println(className + " - " + errorMessage);
    }
    
}
