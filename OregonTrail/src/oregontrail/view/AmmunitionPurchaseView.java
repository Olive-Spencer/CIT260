/*
 Ammunition Purchase View
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.control.ItemControl;

/**
 *
 * @author Angie
 */
public class AmmunitionPurchaseView extends View {
   public AmmunitionPurchaseView(){
       super("\n"
    + "\nPlease enter the amount of bullets you would like to buy."
    + "\nPress Q to go view my other wares."  
    + "\n----------------------------------------------------------------");
   } 
   @Override
        public boolean doAction(String newAmount) {
            Scanner inFile;
            inFile = new Scanner(System.in);
            
            String confirm;
            
            boolean second = false;
            
            int amount = Integer.parseInt(newAmount);
            
            ItemControl.getCurrentAmmunition();
            ItemControl.setCurrentAmmunition(amount);
            
            while (second == false){
                System.out.println("are you sure you want to purchase this many bullets? y/n");
                confirm = inFile.nextLine();
                String confirmChanged = confirm.trim().toUpperCase();
                if (confirmChanged.matches("Y"))
                {
                    System.out.println("Congradulations, You purchased " + amount + " bullets!");
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