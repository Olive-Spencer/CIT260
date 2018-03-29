/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;
import oregontrail.model.LocationNames;
import oregontrail.control.LocationSortControl;
/**
 *
 * @author Coby
 */
public class LocationSortView extends View{
    private LocationNames[] locations = LocationNames.values();
    private LocationSortControl calcLocation = new LocationSortControl();
    @Override
            public void display(){
    this.console.println("\n"
    + "\nWhile on the trail, you will visit many different locations. They are "
    + "listed below, along with the average distance between each location."
    + "\nHere are all of the locations you're going to visit in the game:");
        for (LocationNames location : locations){
            this.console.println(location);
        }

        this.console.println("\nYou will travel a total of 2000 miles on the "
                + "trail, but the average distance between each location is "
                + calcLocation.calcAverageMiles() + " miles.");
    }
            @Override
            public boolean doAction(String inputs)
            {
                return true;
            }
}
