/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import oregontrail.control.GameControl;
import oregontrail.exceptions.GameControlException;

/**
 *
 * @author Coby
 */
class StartExistingGameView extends View{
        public StartExistingGameView(){
    super("\nLoading the game will Load your location on the trail"
            + "\nPlease enter the file path where you would like to load the game:");
}
 
    @Override
    public boolean doAction(String inputs) {
        
        
        try
        {
            GameControl.loadGame(inputs);
        }
        catch (IOException | GameControlException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
                return false;}
        
        
        this.console.println("\nSuccess. The file has been saved @ " + inputs);
        return true;
    }
        
    }

