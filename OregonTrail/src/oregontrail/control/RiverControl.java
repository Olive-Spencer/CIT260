/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
import java.util.Random;

/**
 *
 * @author Spencer
 */
public class RiverControl {
    public static Random rand = new Random();
    
    // @author Spencer
    public static int calcWidth (int month, int locationCondition){
        
        int widthMonth;
        int locationWidth;
        
        if (month < 0 || month > 11){
            return -1;
        }
        
        if (locationCondition < 0 || locationCondition > 2){
            return -1;
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

        
}
    
    

