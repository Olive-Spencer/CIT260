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
            
            int inputInt=0;
            try{
            inputInt = Integer.parseInt(inputs);
            }
            catch(NumberFormatException ex){
            System.out.println(ex.getMessage() + "you must enter a number" );
            return false;
            }
       
        if(inputInt == 1){
        try {
            TrailControl.randomWeather();
        } catch (TrailControlException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(TrailView.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("You continue on the trail!");
        }
        else
            System.out.println("you changed your mind.");
        
        return true;
    
    }
}
