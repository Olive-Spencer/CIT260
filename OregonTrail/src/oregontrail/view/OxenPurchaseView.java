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
public class OxenPurchaseView extends View {
    public OxenPurchaseView(){
        super("\n"
    + "\nPlease enter how many oxen you would like to buy."
    + "\nPress Q to go view my other wares"
    + "\n-------------------------------------------------------------");
    }
    @Override
        public boolean doAction(String newAmount) {
            String inFile = null;
        try {
            inFile = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(OxenPurchaseView.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            String confirm;
            
            boolean second = false;
            
            int amount = Integer.parseInt(newAmount);
            
            ItemControl.getCurrentOxen();
            ItemControl.setCurrentOxen(amount);
            
            while (second == false){
                this.console.println("are you sure you want to purchase this many Oxen? y/n");
                confirm = inFile;
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    this.console.println("Congradulations, You purchased " + amount + " oxen!");
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
    