/*
 Occupations View 
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class OccupationsView extends View {
   public OccupationsView(){
        super("Many different kinds of people made the trip to Oregon. You may: "
        + "\n1 - Be a banker from Boston"
        + "\n2 - Be a carpenter from Ohio"
        + "\n3 - Be a farmer from Illinois"
        + "\n4 - Be a blacksmith from Missouri"
        + "\n5 - Be a doctor from Kentucky"
        + "\n6 - Be a Bandit from Kentucky"
        + "\n7 - Be a Trapper from Kentucky"
        + "\nQ - Quit to main menu"
        + "\nPlease enter your choice here:");
    }
        @Override
        public boolean doAction(String inputs) {
        String menuItem = inputs;
        
        switch (menuItem)
        {
            case "1": this.console.println("You have chosen to be a Banker from Boston!");
            break;
            case "2": this.console.println("You have chosen to be a Carpenter from Ohio!");
            break;
            case "3": this.console.println("You have chosen to be a Farmer from Illinois!");
            break;
            case "4": this.console.println("You have chosen to be a Blacksmith from Missouri!");
            break;
            case "5": this.console.println("You have chosen to be a Doctor from Kentucky!");
            break;
            case "6": this.console.println("You have chosen to be a Bandit!");
            break;
            case "7": this.console.println("You have chosen to be a Trapper!");
            break;
            case "Q": return true;
            default: this.console.println("Invalid menu item");
           
        }
       
        return true;
        
       
    }
}
    



    

