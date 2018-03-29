/*
 Gold Panning View
 */
package oregontrail.view;

import java.util.Scanner;


/**
 *
 * @author Angie
 */
public class GoldPanningView extends View {
    public GoldPanningView(){
        super("\nYou are going to pan for Gold. It takes 3 days to pan in this area."
        + "\nWould you like to pan? Y/N"
        + "\nPress Q to go back to main menu");
    }
   
        
    @Override
    public boolean doAction(String inputs) {
        String panChoice = inputs.toUpperCase();
        
        switch (panChoice)
        {
            case "Y": this.console.println("Congradulations, you panned for gold and found some! You sold this gold for 100 dollars!");
            break;
            case "N": this.console.println("Very well. Back to travel menu.");
            break;
            case "Q": return true;
            default: this.console.println("Invalid menu item");
        }
       
        return false;
    
    }
}   

