/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.TrailControl;
import oregontrail.exceptions.TrailControlException;
import oregontrail.model.Location;
import oregontrail.model.LocationNames;

/**
 *
 * @author Coby, Spencer
 */
public class GameMenuView extends View{
    private MapView map = new MapView();
    private RestView rest = new RestView();
    private HuntingView hunting = new HuntingView();
    private LocationNames[] locations = LocationNames.values();
    private GoldPanningView mining = new GoldPanningView(); 
    private TrailControl trailControl = new TrailControl();
    private Location location = new Location();
    public static int locationNumber = 0;
    public GameMenuView(){
        super("\n"
    + "\n-------------------------------------------------------------"
    + "\n| Game Menu                                                 |"
    + "\n-------------------------------------------------------------"
    + "\nG - Save the game"
    + "\nL - Load an existing game"
    + "\nM - View Map"
    + "\nR - Rest"
    + "\nH - Go hunting"
    + "\nS - Search for gold"
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
                case "G":saveGame();
                break;
                case "L":loadGame();
                break;
                case "M": map.display();
                break;
                case "H": goHunting();
                break;
                case "S": goMining();
                break;
                case "N": locationNumber++;
                location.setLocationNumber(locationNumber);
            {
                try {
                    weather();
                } catch (TrailControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                return nextLocation();
                case "Q": return true;
                default: this.console.println("Invalid menu item");                
            }
            return false;
        }
    
    public void rest(){
        rest.display();
    }
    
    
    
    public void goMining(){
        mining.display();
    }
    
    public void goHunting(){
        hunting.display();
    }
    
    public void weather() throws TrailControlException{
        trailControl.randomWeather();
    }
    
    public boolean nextLocation(){
        if (locationNumber == 26)
        {
            this.console.println("YOU WIN THE GAME QUIT TRYING TO MOVE FORWARD OR YOU WILL DROWN. SIR.");
            this.console.println("\nThanks for playing!");
            return true;
        }
            map.setMiles(locations[locationNumber].getMiles());
            this.console.println("\nYou have arrived at " + locations[locationNumber]);
            return false;
        
    }
    
    public boolean checkLocation(int location){
        if (locationNumber == 26)
        {

        }
        return false;
    }
    
    public void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
        
    }
    
    public void loadGame() {
        StartExistingGameView load = new StartExistingGameView();
        load.display();
    }
}
