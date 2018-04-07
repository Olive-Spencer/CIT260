/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String inFile = null;
     
        boolean valid = false;
        String value = null;
        
        while(!valid)
        {
            this.console.println("\n|.......|......|......|...........|.........|....|......|.....|........|.......|.......|......|......|.....|.....|.......|.......|.......|.....|......|......|.....|..........|...........|............|\n");
            mapControl.createMap(miles);
            this.console.println("^");
            this.console.println("Press Q to return to the trail.");
            try {
            inFile = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
        }
            value = inFile;
            value = value.trim();
            if (value.length() < 1)
            {
                this.console.println("\n*** You must enter a non-blank value ***");
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
