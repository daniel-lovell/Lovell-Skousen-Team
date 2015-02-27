/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.GoldPouch;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class GoldControlTest {
    
    public GoldControlTest() {
    }

    /**
     * Test of calculateNewGold method, of class GoldControl.
     */
    @Test
    public void testCalculateEarnedGold() {
        
        //Test Case 1
        System.out.println("calculateEarnedGold1");
        int lastGoldEarned1 = 1;
        int countCorrect1 = 2;
        int expResult1 = 4;
        int result1 = GoldControl.calculateEarnedGold(lastGoldEarned1, countCorrect1);
        assertEquals(expResult1, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 2
        System.out.println("calculateEarnedGold2");
        int lastGoldEarned2 = -1;
        int countCorrect2 = 3;
        int expResult2 = -1;
        int result2 = GoldControl.calculateEarnedGold(lastGoldEarned2, countCorrect2);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 3
        System.out.println("calculateEarnedGold3");
        int lastGoldEarned3 = 3;
        int countCorrect3 = -1;
        int expResult3 = -1;
        int result3 = GoldControl.calculateEarnedGold(lastGoldEarned3, countCorrect3);
        assertEquals(expResult1, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 4
        System.out.println("calculateEarnedGold4");
        int lastGoldEarned4 = -1;
        int countCorrect4 = -1;
        int expResult4 = -1;
        int result4 = GoldControl.calculateEarnedGold(lastGoldEarned4, countCorrect4);
        assertEquals(expResult4, result4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 5
        System.out.println("calculateEarnedGold5");
        int lastGoldEarned5 = 0;
        int countCorrect5 = 1;
        int expResult5 = 1;
        int result5 = GoldControl.calculateEarnedGold(lastGoldEarned5, countCorrect5);
        assertEquals(expResult5, result5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
