/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.TrailControl;
import oregontrail.exceptions.TrailControlException;

/**
 *
 * @author spencer
 */
public class TrailView extends View {
    
    
    public TrailView(){
        super("You are about to continue on the trail. You may run into inclimate weather."
        + "\npress 1 to continue"
        + "\npress 2 if you changed your mind");
    }
        
        
    @Override
        public boolean doAction(String inputs){
            
            int inputInt;
            try{
            inputInt = Integer.parseInt(inputs);
            }
            catch(NumberFormatException ex){
            ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
            return true;
            }
       
        if(inputInt == 1){
        try {
            TrailControl.randomWeather();
        } catch (TrailControlException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
        }
    this.console.println("You continue on the trail!");
        }
        else
            this.console.println("you changed your mind.");
        
        return true;
    
    }
}
