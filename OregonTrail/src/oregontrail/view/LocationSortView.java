/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;
import oregontrail.model.LocationNames;
/**
 *
 * @author Coby
 */
public class LocationSortView extends View{
    private LocationNames[] locations = LocationNames.values();
    @Override
            public void display(){
    System.out.println("\n"
    + "\nWhile on the trail, you will visit many different locations. They are "
    + "listed below, along with the average distance between each location."
    + "\nHere are all of the locations you're going to visit in the game:");
        for (LocationNames location : locations){
            System.out.println(location);
        }
        int total = 0;
        for (int i = 1; i <= 25; i++)
        {
            int miles;
            int j = i-1;
            miles = locations[i].getMiles() - locations [j].getMiles();
            total = total + miles;
        }
        double average = total/26;
        System.out.println("\nYou will travel a total of 2000 miles on the "
                + "trail, but the average distance between each location is "
                + average + " miles.");
    }
            @Override
            public boolean doAction(String inputs)
            {
                return true;
            }
}
