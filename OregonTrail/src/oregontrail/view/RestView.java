/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

/**
 *
 * @author Spencer
 */
public class RestView extends View {
   
    public RestView(){
        super("\nWould you like to rest for the day? Y/N"
             + "\nPress Q to go back to travel menu");
    }
   
        
    @Override
    public boolean doAction(String inputs) {
        String panChoice = inputs.toUpperCase();
        
        switch (panChoice)
        {
            case "Y": this.console.println("You decide to rest for the day. You wake up feeling refreshed and ready to continue!");
            break;
            case "N": this.console.println("Very well. Back to travel menu.");
            break;
            case "Q": return true;
            default: this.console.println("Invalid menu item");
        }
       
        return false;
    
    }
}
