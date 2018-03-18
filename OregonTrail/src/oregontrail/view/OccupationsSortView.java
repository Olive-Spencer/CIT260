/*
 Occupations Sort View
 */
package oregontrail.view;

import oregontrail.control.OccupationsSortControl;

/**
 *
 * @author Angie
 */
public class OccupationsSortView extends View{
    
      public OccupationsSortView(){
    super("Here you can look at the Occupations with thier associated starting money."
    + "\nPlease enter A to see them in alphabetical order press R to see them in reverse order."
    + "\nPress Q to Quit.");
    
}
    
    @Override
    public boolean doAction(String inputs){
        switch (inputs)
        {
            case "A":
            case "R":OccupationsSortControl.occupationListArray(inputs);
            break;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }
    
}
