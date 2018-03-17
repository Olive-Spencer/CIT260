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
public class ItemListHelpMenuControlTest {
    
    public ItemListHelpMenuControlTest() {
    }

    /**
     * Test of helpArray method, of class ItemListHelpMenuControl.
     */
    @Test
    public void testHelpArrayvalid() {
        System.out.println("helpArrayAResults");
        String input = "A";
        ItemListHelpMenuControl.helpArray(input);
    }
    
    public void testHelpArrayvalid2() {
        System.out.println("helpArrayRResults");
        String input = "R";
        ItemListHelpMenuControl.helpArray(input);
    }
      
}
