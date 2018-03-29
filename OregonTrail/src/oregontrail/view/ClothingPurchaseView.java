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
 * @author spencer
 */
public class ClothingPurchaseView extends View {
    public ClothingPurchaseView(){
        super("\n"
    + "\nPlease enter how many sets of clothing you would like to buy."
    + "\nPress Q to go view my other wares"
    + "\n-------------------------------------------------------------");
    }
    @Override
        public boolean doAction(String newAmount) 
        {
                        
            String confirm;
            
            boolean second = false;
            
            int amount = 0; 
            
            try {
                    amount = Integer.parseInt(newAmount);
                } catch (NumberFormatException ex) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
                    
                }
            
            int passedAmount = ItemControl.setCurrentClothes(amount);
            this.console.println("amount is:" + amount);
            
            while (second == false){
                
                String inFile = null;
                try {
                    inFile = this.keyboard.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(ClothingPurchaseView.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.console.println("are you sure you want to purchase this many bundles of clothing? y/n");
                confirm = inFile;
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    this.console.println("Congradulations, You purchased " + amount + " bundles of clothing!");
                    second = true;
                }
                else if (confirmChanged.matches("N"))
                {
                    this.console.println("Very well.");
                    return false;
                }
                else 
                {
                    this.console.println("Please enter a valid value.");
                }
            }
            return true;
    }
}
    

