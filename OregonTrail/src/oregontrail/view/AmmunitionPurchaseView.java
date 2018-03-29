/*
 Ammunition Purchase View
 */
package oregontrail.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.ItemControl;



/**
 *
 * @author Angie
 */


public class AmmunitionPurchaseView extends View {
   public AmmunitionPurchaseView(){
       super("\n"
    + "\nPlease enter the amount of bullets you would like to buy."
    + "\n You can purchase the following boxes of bullets:"
    + "\n Choose 20 to buy a box of 20 bullets." 
    + "\n Choose 50 to buy a box of 50 bullets."
    + "\n Choose 100 to buy a box of 100 bullets." 
    + "\nPress Q to go view my other wares."  
    + "\n----------------------------------------------------------------");
   } 
   @Override
        public boolean doAction(String amount) {
            
            String inFile = null;
       try {
           inFile = this.keyboard.readLine();
       } catch (IOException ex) {
           Logger.getLogger(AmmunitionPurchaseView.class.getName()).log(Level.SEVERE, null, ex);
       }
            
            String confirm;
            
            boolean second = false;
            
            ItemControl.getCurrentAmmunition();
            
            
            int intAmount = 0; 
              try {
                   intAmount = Integer.parseInt(amount);
                } catch (NumberFormatException ex) {
                    ErrorView.display(this.getClass().getName(),"you entered an invalid number " + ex.getMessage());
                    
                }  
            
             int passedAmount = ItemControl.setCurrentAmmunition(intAmount);
            this.console.println("amount is:" + passedAmount);
            
            while (second == false){
                this.console.println("are you sure you want to purchase this many bullets? y/n");
                confirm = inFile;
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    this.console.println("Congradulations, You purchased " + amount + " bullets!");
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
