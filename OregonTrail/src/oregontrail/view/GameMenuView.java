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
public class GameMenuView extends View{
    private MapView map = new MapView();
    private RestView rest = new RestView();
    private HuntingView hunting = new HuntingView();
    private LocationNames[] locations = LocationNames.values();
    private int locationNumber = 0;
    public GameMenuView(){
        super("\n"
    + "\n-------------------------------------------------------------"
    + "\n| Game Menu                                                 |"
    + "\n-------------------------------------------------------------"
    + "\nR - Rest"
    + "\nM - View Map"
    + "\nH - Go hunting"
    + "\nN - Go to next location"
    + "\nQ - Quit"
    + "\n-------------------------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String inputs) {
            String menuItem = inputs.toUpperCase();
            switch (menuItem)
            {
                case "R": rest();
                break;
                case "M": map.display();
                break;
                case "H": goHunting();
                break;
                case "N": locationNumber++;
                return nextLocation();
                case "Q": return true;
                default: System.out.println("Invalid menu item");                
            }
            return false;
        }
    
    public void rest(){
        rest.display();
    }
    
    public void goHunting(){
        hunting.display();
    }
    
    public boolean nextLocation(){
        if (locationNumber == 26)
        {
            System.out.println("YOU WIN THE GAME QUIT TRYING TO MOVE FORWARD OR YOU WILL DROWN. SIR.");
            return true;
        }
            map.setMiles(locations[locationNumber].getMiles());
            System.out.println("You have arrived at " + locations[locationNumber]);
            return false;
        
    }
    
    public boolean checkLocation(int location){
        if (locationNumber == 26)
        {

        }
        return false;
    }
}
