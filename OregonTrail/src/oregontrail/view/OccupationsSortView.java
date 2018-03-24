/*
 Occupations Sort View
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.OccupationsSortControl;
import oregontrail.exceptions.OccupationsSortControlException;

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
          try {
              switch (inputs)
              {
                  case "A":
                  case "R":OccupationsSortControl.occupationListArray(inputs);
                  break;
              }
              
          } catch (OccupationsSortControlException ex) {
              Logger.getLogger(OccupationsSortView.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
    }
    
}
