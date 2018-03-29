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

/**
 *
 * @author spencer
 */
public class SaveGameView extends View {
    
    public SaveGameView(){
    super("\nPlease enter the file path where you would like to save the game:");
}
 
    @Override
    public boolean doAction(String inputs) {
        Game game = getCurrentGame();
        
        try
        {
            GameControl.saveGame(game, inputs);
        }
        catch (IOException | GameControlException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
                return false;}
        
        
        this.console.println("\nSuccess. The file has been saved @ " + inputs);
        return true;
    }
        
        
        
        
        
    }


