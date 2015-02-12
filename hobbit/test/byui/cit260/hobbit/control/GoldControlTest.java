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
    public void testCalculateNewGold() {
        
        //Test Case 1
        System.out.println("calculateNewGold");
        //GoldPouch goldPouch = null;
        GoldPouch goldPouch1 = new GoldPouch();
        goldPouch1.setAmount(1);
        short countCorrect1 = 2;
        int expResult1 = 4;
        int result1 = GoldControl.calculateNewGold(goldPouch1, countCorrect1);
        assertEquals(expResult1, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 2
        System.out.println("calculateNewGold");
        //GoldPouch goldPouch = null;
        GoldPouch goldPouch2 = new GoldPouch();
        goldPouch2.setAmount(-1);
        short countCorrect2 = 3;
        int expResult2 = -1;
        int result2 = GoldControl.calculateNewGold(goldPouch2, countCorrect2);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 3
        System.out.println("calculateNewGold");
        //GoldPouch goldPouch = null;
        GoldPouch goldPouch3 = new GoldPouch();
        goldPouch3.setAmount(3);
        short countCorrect3 = -1;
        int expResult3 = -1;
        int result3 = GoldControl.calculateNewGold(goldPouch3, countCorrect3);
        assertEquals(expResult1, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 4
        System.out.println("calculateNewGold");
        //GoldPouch goldPouch = null;
        GoldPouch goldPouch4 = new GoldPouch();
        goldPouch4.setAmount(-1);
        short countCorrect4 = -1;
        int expResult4 = -1;
        int result4 = GoldControl.calculateNewGold(goldPouch4, countCorrect4);
        assertEquals(expResult4, result4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test Case 5
        System.out.println("calculateNewGold");
        //GoldPouch goldPouch = null;
        GoldPouch goldPouch5 = new GoldPouch();
        goldPouch5.setAmount(0);
        short countCorrect5 = 1;
        int expResult5 = 1;
        int result5 = GoldControl.calculateNewGold(goldPouch5, countCorrect5);
        assertEquals(expResult5, result5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
