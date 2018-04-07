/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.control.HuntingControl;

/**
 *
 * @author Spencer
 */
public class HuntingView extends View {
    
    HuntingControl hunt = new HuntingControl();
    
    public HuntingView(){
        super("\nYou are going to hunt. It takes 1 day to hunt."
        + "\nWould you like to hunt? Y/N"
        + "\nPress Q to go back to main menu");
    }
   
        
    @Override
    public boolean doAction(String inputs) {
        String choice = inputs.toUpperCase();
        
        switch (choice)
        {
            case "Y": hunt.HuntingCalc();
            break;
            case "N": this.console.println("Very well. Back to travel menu.");
            return true;
            case "Q": return true;
            default: this.console.println("Invalid menu item");
        }
       
        return false;
    
    }
    
}

    