/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.RiverControl;
import oregontrail.exceptions.RiverControlException;

/**
 *
 * @author spencer
 */
public class RiverView extends View {
    public RiverView (){
        super("\n"
    + "\nYou have come to a river."
    + "\nAre you prepared to cross? Y/N"
    + "\n-------------------------------------------------------------");
    }
    @Override
        public boolean doAction(String inputs) {
                   
            inputs = inputs.trim().toUpperCase();
            
            boolean second = false;
            
                    
          
            
          
                if (inputs.matches("Y"))
                {
                    int width= 0;
                    double depth= 0.0;
                try {
                    width = RiverControl.calcWidth(1, 1);
                } catch (RiverControlException ex) {
                    Logger.getLogger(RiverView.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    depth = RiverControl.calcDepth(1, 1);
                } catch (RiverControlException ex) {
                    Logger.getLogger(RiverView.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                System.out.println(width);
                System.out.println(depth);
                
                
                    
                    second = true;
                }
                else if (inputs.matches("N"))
                {
                    System.out.println("Very well. you won't cross yet.");
                    second = true;
                }
                else 
                {
                    System.out.println("Please enter a valid value.");
                }
            
            return true;
    }
    
}
