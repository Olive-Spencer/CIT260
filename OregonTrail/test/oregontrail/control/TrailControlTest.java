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
 * @author Spencer, Angie, Coby
 */
public class TrailControlTest {
    
    public TrailControlTest() {
    }

    /**
     * Test of calcWeather method, of class TrailControl.
     */
    @Test
    public void testCalcWeather() {
        System.out.println("calcWeather");
        
        System.out.println("\tTest case boundry 1");
        int locationCondition = 0;
        int month = 0;
        double expResult = 1.0;
        double result = TrailControl.calcWeather(locationCondition, month);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case valid 1");
        locationCondition = 1;
        month = 10;
        expResult = 2.0;
        result = TrailControl.calcWeather(locationCondition, month);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case boundry 2");
        locationCondition = 2;
        month = 11;
        expResult = 3.0;
        result = TrailControl.calcWeather(locationCondition, month);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case invalid 1");
        locationCondition = -1;
        month = 0;
        expResult = -1.0;
        result = TrailControl.calcWeather(locationCondition, month);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\tTest case invalid 2");
        locationCondition = 1;
        month = 13;
        expResult = -1.0;
        result = TrailControl.calcWeather(locationCondition, month);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
