/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import java.util.Random;
import oregontrail.model.Location;

/**
 *
 * @author spencer, Angie
 */
public class GoldPanningControl {
   
    Location location = new Location();
    int locationNumber = location.getLocationNumber();
    Random rand = new Random(); 

public void GoldCalc() {
    int random = rand.nextInt(50) + 1;
    int strength  = rand.nextInt(50)+ 1;
    int goldAmount = rand.nextInt(25)+1;
    
    int goldFound = random + strength - locationNumber;
    
    if (goldFound < 10)
        System.out.println("\nYou pan for gold and use " + strength  + " points of your strength. Unfortunately you have bad luck and don't find gold" );
    else
        System.out.println("\nYou pan for gold and use " + strength + " points of your strength. Hooray!! You found " + goldAmount + " ounces of Gold!");
    
    

}

}
    

