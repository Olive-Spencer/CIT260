/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Coby
 */
public class RiverSuccessTest {
    
    public RiverSuccessTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcSuccess method, of class RiverSuccess.
     */
    @Test
    public void testCalcSuccess() {
        System.out.println("All Valid Values");
        int width = 30;
        int depth = 11;
        int month = 2;
        int choice = 1;
        int expResult = 7;
        int result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Invalid Width Test");
        width = -3;
        depth = 11;
        month = 2;
        choice = 1;
        expResult = -1;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Invalid Depth Test");
        width = 15;
        depth = -11;
        month = 2;
        choice = 1;
        expResult = -1;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Invalid Month Test");
        width = 10;
        depth = 11;
        month = 25;
        choice = 1;
        expResult = -1;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Invalid Choice Test");
        width = 10;
        depth = 11;
        month = 2;
        choice = 8;
        expResult = -1;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Width Boundary Test");
        width = 20;
        depth = 8;
        month = 1;
        choice = 1;
        expResult = 3;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Depth Boundary Test");
        width = 51;
        depth = 10;
        month = 1;
        choice = 1;
        expResult = 5;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Month Boundary Test");
        width = 21;
        depth = 11;
        month = 10;
        choice = 2;
        expResult = 8;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
        System.out.println("Choice Boundary Test");
        width = 8;
        depth = 8;
        month = 2;
        choice = 0;
        expResult = 1;
        result = RiverSuccess.calcSuccess(width, depth, month, choice);
        assertEquals(expResult, result);
        
    }
    
    
    
}
