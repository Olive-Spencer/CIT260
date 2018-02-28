/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.control.ItemControl;

/**
 *
 * @author spencer
 */
public class ClothingPurchaseView {
    
        
        public void display() {
        boolean endOfView = false;
        do{
            String[] inputs = new String[1];
            inputs[0] = this.getInputs();
            if(inputs[0] == null || inputs[0].equals("Q")){
                return;
            }
            else {
                endOfView = doAction(inputs);   
            }
        }
        while(endOfView != true);
    }
        
    private String getInputs() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String newAmount = null;        
        System.out.println("Please enter how man sets of clothing you would like to buy.");
        System.out.println("Press Q to go view my other wares.");
        while(valid == false)
        {
            
            String amount = inFile.nextLine();
            int inputsLength = amount.length();
            if (inputsLength < 1)
            {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else
            {
                valid = true;
                newAmount = amount.trim().toUpperCase();
                
            }
        }
        return newAmount;

    }
        private boolean doAction(String[] newAmount) {
            Scanner inFile;
            inFile = new Scanner(System.in);
            
            String confirm;
            
            boolean second = false;
            
            int amount = Integer.parseInt(newAmount[0]);
            
            ItemControl.getCurrentClothes();
            ItemControl.setCurrentClothes(amount);
            
            while (second == false){
                System.out.println("are you sure you want to purchase this many bundles of clothing? y/n");
                confirm = inFile.nextLine();
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    System.out.println("Congradulations, You purchased " + amount + " bundles of clothing!");
                    second = true;
                }
                else if (confirmChanged.matches("N"))
                {
                    System.out.println("Very well. Back to my other wares.");
                    second = true;
                }
                else 
                {
                    System.out.println("Please enter a valid value.");
                    continue;
                }
            }
            return true;
    }
}
    

