/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.control.FoodControl;

/**
 *
 * @author Coby
 */
public class BuyingFoodView {
    
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
        String newInputs = null;
        System.out.println("Please enter how much food you would like to buy.");
        System.out.println("Press Q to go view my other wares.");
        while(valid == false)
        {
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            if (inputsLength < 1)
            {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else
            {
                valid = true;
                newInputs = inputs.trim().toUpperCase();
                
            }
        }
        return newInputs;

    }
        private boolean doAction(String[] inputs) {
            Scanner inFile;
            inFile = new Scanner(System.in);
            String newAgain = null;
            boolean second = false;
            int amount = Integer.parseInt(inputs[0]);
            FoodControl.getCurrentFood();
            FoodControl.setCurrentFood(amount);
            while (second == false){
            System.out.println("Do you want to buy more? y/n");
            String again = inFile.nextLine();
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
