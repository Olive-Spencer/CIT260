/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.ItemControl;

/**
 *
 * @author Coby
 */
public class WagonTongueView extends View{
    public WagonTongueView(){
        super("\nHow many tongues would you like to buy?");
    }
    
       @Override
        public boolean doAction(String newAmount) {
            String inFile = null;
        try {
            inFile = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(WagonTongueView.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            String confirm;
            
            boolean second = false;
            
            int amount = Integer.parseInt(newAmount);
            

            
            while (second == false){
                this.console.println("Are you sure you want to purchase this many wagon tongues? y/n");
                confirm = inFile;
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    this.console.println("You purchased " + amount + " wagon tongues.");
                    ItemControl.getCurrentTongues();
                    ItemControl.setCurrentTongues(amount);
                    second = true;
                }
                else if (confirmChanged.matches("N"))
                {
                    this.console.println("Very well. Back to my other wares.");
                    second = true;
                }
                else 
                {
                    this.console.println("Please enter a valid value.");
                }
            }
              return true;
        }
}
