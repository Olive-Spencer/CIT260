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
            Scanner inFile;
            inFile = new Scanner(System.in);
            
            String confirm;
            
            boolean second = false;
            
            
            
            ItemControl.getCurrentClothes();
            
            int amount = ItemControl.setCurrentClothes(newAmount);
            System.out.println("amount is:" + amount);
            
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
                    System.out.println("Very well.");
                    return false;
                }
                else 
                {
                    System.out.println("Please enter a valid value.");
                }
            }
            return true;
    }
}
    

