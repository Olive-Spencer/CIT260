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
 * @author Coby
 */
public class WagonTongueView extends View{
    public WagonTongueView(){
        super("\nHow many tongues would you like to buy?");
    }
    
       @Override
        public boolean doAction(String newAmount) {
            Scanner inFile;
            inFile = new Scanner(System.in);
            
            String confirm;
            
            boolean second = false;
            
            int amount = Integer.parseInt(newAmount);
            

            
            while (second == false){
                System.out.println("Are you sure you want to purchase this many wagon tongues? y/n");
                confirm = inFile.nextLine();
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    System.out.println("You purchased " + amount + " wagon tongues.");
                    ItemControl.getCurrentTongues();
                    ItemControl.setCurrentTongues(amount);
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
                }
            }
              return true;
        }
}
