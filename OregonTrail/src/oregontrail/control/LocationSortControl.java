/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.model.LocationNames;

/**
 *
 * @author Coby
 */
public class LocationSortControl {
    private LocationNames[] locations = LocationNames.values();
    public double calcAverageMiles(){
                int total = 0;
        for (int i = 1; i <= 25; i++)
        {
            int miles;
            int j = i-1;
            miles = locations[i].getMiles() - locations [j].getMiles();
            total = total + miles;
        }
        double average = total/26;
        return average;
    }
}
