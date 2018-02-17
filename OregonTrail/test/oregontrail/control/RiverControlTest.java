/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spencer
 */
public class RiverControlTest {
    
    public RiverControlTest() {
    }

    /**
     * Test of calcWidth method, of class RiverControl.
     */
    @Test
    public void testCalcWidth() {
        System.out.println("calcWidth");
        
        System.out.println("\tTest Case Valid 1");
        int month = 10;
        int locationCondition = 2;
        int expResult = 400;
        int result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case invalid 1");
        month = -1;
        locationCondition = 2;
        expResult = -1;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case invalid 2");
        month = 12;
        locationCondition = 2;
        expResult = -1;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case invalid 3");
        month = 1;
        locationCondition = -1;
        expResult = -1;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case invalid 4");
        month = 1;
        locationCondition = 3;
        expResult = -1;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case boundry 1");
        month = 2;
        locationCondition = 2;
        expResult = 600;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case boundry 2");
        month = 5;
        locationCondition = 2;
        expResult = 120;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case boundry 3");
        month = 11;
        locationCondition = 1;
        expResult = 100;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case invalid 1");
        month = 11;
        locationCondition = 0;
        expResult = 300;
        result = RiverControl.calcWidth(month, locationCondition);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of calcDepth method, of class RiverControl.
     */
    @Test
    public void testCalcDepth() {
    System.out.println("calcDepth");
    
        System.out.println("valid test case 1");
        int month = 5;
        int previousRiverDepth = 2;
        double expResult = 13;
        double result = RiverControl.calcDepth(month, previousRiverDepth);
        assertEquals(expResult, result, 0.0);
        
       System.out.println("invalid test case 1");
       month = 12;
       previousRiverDepth = 1;
       expResult = -1;
       result = RiverControl.calcDepth(month, previousRiverDepth);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("invalid test case 2");
       month = 5;
       previousRiverDepth = 8;
       expResult = -1;
       result = RiverControl.calcDepth(month, previousRiverDepth);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("invalid test case 3");
       month = 14;
       previousRiverDepth = 6;
       expResult = -1;
       result = RiverControl.calcDepth(month, previousRiverDepth);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("Boundry test case 1");
       month = 0;
       previousRiverDepth = 0;
       expResult = 2 ;
       result = RiverControl.calcDepth(month, previousRiverDepth);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("Boundry test case 2");
       month = 4;
       previousRiverDepth = 2;
       expResult = 6;
       result = RiverControl.calcDepth(month, previousRiverDepth);
       assertEquals(expResult, result, 0.0);
       
       System.out.println("Boundry test case 3");
       month = 5;
       previousRiverDepth = 2;
       expResult = 13;
       result = RiverControl.calcDepth(month, previousRiverDepth);
       assertEquals(expResult, result, 0.0);
       
      
    }
    
}
