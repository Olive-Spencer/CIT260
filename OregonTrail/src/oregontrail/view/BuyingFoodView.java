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
import oregontrail.control.FoodControl;

/**
 *
 * @author Coby
 */
public class BuyingFoodView extends View {
    public BuyingFoodView(){
        super("\nPlease enter how much food you would like to buy."
        +"\nPress Q to go view my other wares.");
    }
    
        
        @Override
        public boolean doAction(String inputs) {
            String inFile = null;
        try {
            inFile = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(BuyingFoodView.class.getName()).log(Level.SEVERE, null, ex);
        }
            String newAgain;
            boolean second = false;
            int amount = Integer.parseInt(inputs);
            FoodControl.getCurrentFood();
            FoodControl.setCurrentFood(amount);
            while (second == false){
            this.console.println("Do you want to buy more? y/n");
            String again = inFile;
            newAgain = again.trim().toUpperCase();
            if (newAgain.matches("Y"))
            {
                amount = Integer.parseInt(getInputs());
                if(amount != (int)amount)
                FoodControl.getCurrentFood();
                FoodControl.setCurrentFood(amount);
            }
            else if (newAgain.matches("N"))
            {
                this.console.println("Very well. Back to my other wares.");
                second = true;
            }
            else 
            {
                this.console.println("Please enter a valid value.");
                continue;
            }
            }
            return true;
    }
}
