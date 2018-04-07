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
 * @author spencer
 */
public class GoldPanningControl {
   
    Location location = new Location();
    int locationNumber = location.getLocationNumber();
    Random rand = new Random(); 

public void GoldCalc() {
    int random = rand.nextInt(50) + 1;
    int strength  = rand.nextInt(100)+ 1;
    
    int hunt = random + strength - locationNumber;
    
    if (hunt < 100)
        System.out.println("\nYou hunt and use " + strength  + " strength. Unfortunately you are a poor aim and get nothing" );
    else
        System.out.println("\nYou hunt and use " + strength + " strength. You find food and are able to feed your family!");
    
    

}

}
    

