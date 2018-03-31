/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.control.ItemListHelpMenuControl;

/**
 *
 * @author spencer
 */
public class ItemListHelpView extends View {
    public ItemListHelpView(){
    super("You are about to look at the list of items and their weight. "
    + "\nPlease enter A to see them in alphabetical order press R to see them in reverse order."
    + "\nPress F to print a list of items to a file."
    + "\nPress Q to Quit.");
    
}
    
    @Override
    public boolean doAction(String inputs){
        switch (inputs)
        {
            case "A":
            case "R":ItemListHelpMenuControl.helpArray(inputs);
            break;
            default: this.console.println("Invalid menu item");
        }
        return false;
    }
}
