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
public class HuntingControl {
    Location location = new Location();
    int locationNumber = location.getLocationNumber();
    Random rand = new Random(); 

public void HuntingCalc() {
    int random = rand.nextInt(50) + 1;
    int ammo  = rand.nextInt(100)+ 1;
    
    int hunt = random + ammo - locationNumber;
    
    if (hunt < 100)
        System.out.println("\nYou hunt and use " + ammo + " bullets. Unfortunately you are a poor aim and get nothing" );
    else
        System.out.println("\nYou hunt and use " + ammo + " bullets. You find food and are able to feed your family!");
    
    

}

}