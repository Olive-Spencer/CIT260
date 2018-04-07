/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static oregontrail.OregonTrail.getCurrentGame;
import oregontrail.control.GameControl;
import oregontrail.exceptions.GameControlException;
import oregontrail.model.Game;
import oregontrail.model.Location;

/**
 *
 * @author spencer
 */
public class SaveGameView extends View {
    public int location = 0; 
    public SaveGameView(){
    super("\nSaving the game will save your location on the trail"
            + "\nPlease enter the file path where you would like to save the game:");
        
}
 
    @Override
    public boolean doAction(String inputs) {
        
        location = GameMenuView.locationNumber;
        
        
        try
        {
            GameControl.saveGame(location, inputs);
        }
        catch (IOException | GameControlException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
                return false;}
        
        
        this.console.println("\nSuccess. The file has been saved @ " + inputs);
        return true;
    }
        
        
        
        
        
    }


