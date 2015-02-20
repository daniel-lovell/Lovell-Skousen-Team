/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class DragonControlTest {
    
    public DragonControlTest() {
    }

    /**
     * Test of calculateAttackStrength method, of class DragonControl.
     */
    @Test
    public void testCalculateAttackStrength() {
        
        //Test Case 1
        System.out.println("calculateAttackStrength");
        int lastAttackStrength1 = 0;
        int countCorrect1 = 1;
        int expResult1 = 1;
        int result1 = DragonControl.calculateAttackStrength(lastAttackStrength1, countCorrect1);
        assertEquals(expResult1, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 2
        System.out.println("calculateAttackStrength");
        int lastAttackStrength2 = 1;
        int countCorrect2 = 2;
        int expResult2 = 4;
        int result2 = DragonControl.calculateAttackStrength(lastAttackStrength2, countCorrect2);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 3
        System.out.println("calculateAttackStrength");
        int lastAttackStrength3 = -1;
        int countCorrect3 = 1;
        int expResult3 = -1;
        int result3 = DragonControl.calculateAttackStrength(lastAttackStrength3, countCorrect3);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 4
        System.out.println("calculateAttackStrength");
        int lastAttackStrength4 = 0;
        int countCorrect4 = 0;
        int expResult4 = -1;
        int result4 = DragonControl.calculateAttackStrength(lastAttackStrength4, countCorrect4);
        assertEquals(expResult4, result4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 5
        System.out.println("calculateAttackStrength");
        int lastAttackStrength5 = -1;
        int countCorrect5 = 0;
        int expResult5 = -1;
        int result5 = DragonControl.calculateAttackStrength(lastAttackStrength5, countCorrect5);
        assertEquals(expResult5, result5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
