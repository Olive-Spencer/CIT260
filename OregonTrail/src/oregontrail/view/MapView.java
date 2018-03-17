/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.control.MapControl;
/**
 *
 * @author Coby
 */
public class MapView extends View{
    MapControl mapControl = new MapControl();
    private int miles = 0;
    @Override
    public String getInputs() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while(!valid)
        {
            System.out.println("\n|.......|......|......|...........|.........|....|......|.....|........|.......|.......|......|......|.....|.....|.......|.......|.......|.....|......|......|.....|..........|...........|............|\n");
            mapControl.createMap(miles);
            System.out.println("^");
            System.out.println("Press Q to return to the trail.");
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1)
            {
                System.out.println("\n*** You must enter a non-blank value ***");
                continue;
            }
           
            break;
        }
        return value;

    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
