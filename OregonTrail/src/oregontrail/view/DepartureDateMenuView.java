/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author spencer
 */

public class DepartureDateMenuView extends View {
    public DepartureDateMenuView(){
        super("\n"
    + "\n-------------------------------------------------------------"
    + "\n|When To leave                                              |"
    + "\n-------------------------------------------------------------"
    + "\nNThe time of year you choose to leave is very important!"
    + "\nChoose wisely!"
    + "\n1 - March"
    + "\n2 - April"
    + "\n3 - May"
    + "\n4 - June"
    + "\n5 - July"
    + "\nQ - Quit to main menu"
    + "\nPlease enter your choice:");
    }
    @Override
        public boolean doAction(String inputs) {
        String menuItem = inputs;
        
        switch (menuItem)
        {
            case "1": System.out.println("You have chosen to leave in March!");
            break;
            case "2": System.out.println("You have chosen to leave in April!");
            break;
            case "3": System.out.println("You have chosen to leave in May!");
            break;
            case "4": System.out.println("You have chosen to leave in June!");
            break;
            case "5": System.out.println("You have chosen to leave in July!");
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        System.out.println("are you ok with leaving at this time? y/n");
        Scanner inFile;
        inFile = new Scanner(System.in);
        String confirmation = inFile.nextLine();
        String adjustConfirm;
        adjustConfirm = confirmation.trim().toUpperCase();
                
        switch (adjustConfirm)
        {
            case "Y": return true;
            case "N": return false;
            default: break;
                               
    }
        return false;
        
       
    }
}
    

