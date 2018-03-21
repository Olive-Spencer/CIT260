/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
import java.util.Random;
import oregontrail.exceptions.RiverControlException;


/**
 *
 * @author Spencer
 */
public class RiverControl {
    public static Random rand = new Random();
    
    // @author Spencer
    public static int calcWidth (int month, int locationCondition)
        throws RiverControlException {
         
        int widthMonth;
        int locationWidth;
        
        if (month < 0 || month > 11){
            throw new RiverControlException("The month is invalid.");
            
        }
        
        if (locationCondition < 0 || locationCondition > 2){
            throw new RiverControlException("The location Condition is invalid.");
        }
        
        switch (month){
            case 2:
            case 3:
            case 4: 
                widthMonth = 15;
                break;
            case 5:
            case 6:
            case 7:
                widthMonth = 3;
                break;
            default:
                widthMonth = 10;
                break;
        }
                
        
        int randomNumber = rand.nextInt(40);
        
        //a 30 has replaced the randomNumber for test purposes.
        int riverWidth= widthMonth * (10 + 30);
        
        if (riverWidth > 300 && locationCondition == 0){
            riverWidth = 300;
        }
        
        if (riverWidth > 100 && locationCondition == 1 && widthMonth < 15){
            riverWidth = 100;
        }
        
        return riverWidth;
    }
// @author Angie
// This is the method to calculate river depth.
    
    public static double calcDepth( int month, int previousRiverDepth)
        throws RiverControlException{
       
        if (month < 0 || month > 11){
           throw new RiverControlException("The month is invalid.");
        }
        
        if (previousRiverDepth < 0 || previousRiverDepth > 2){
            throw new RiverControlException("The previousRiverDepth is invalid.");
        }
        /*case 1-4 months with moderate snow melt, case 5-6 are months with heavy snow melt and any other are no snow melt */
       int snowMelt;
       
       switch (month){
           case 1:
           case 2:
           case 3:
           case 4:
               snowMelt = 3;
               break;
           case 5:
           case 6:
               snowMelt = 10;
               break;
           default: snowMelt= 1;
           break;          
       }
       int randomNumber = rand.nextInt(50); 
       
       int riverDepth = snowMelt + previousRiverDepth + (10/10);
       
       return riverDepth;
    }
       
}     
    

