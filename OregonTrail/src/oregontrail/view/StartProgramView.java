/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.control.GameControl;
import oregontrail.model.Player;

/**
 *
 * @author Coby Carter (The typey one), Angie Coates (The smarty one), and Spencer Olive (The handsome one)
 */
public class StartProgramView extends View {
    public StartProgramView(){
        super("\nWelcome to the Oregon Trail! This was game created by Spencer Olive, Angie Coates, and Coby Carter."
        +"\nA project for CIT 260"
        +"\nYou will travel the Oregon Trail. The journey will be trecherous!"
        +"\nThe object of the game is to reach Oregon with as many family members as possible."
        +"\nIf everyone dies the game is over! Good luck!"
        +"\nPlease enter your name:");
    }
        @Override
        public boolean doAction(String inputs) {
        String playersName = inputs;
        Player player = GameControl.savePlayer(playersName);
        if(player == null){
            this.console.println("Could not create the player." + "Enter a different name.");
            return false;
        }
        else{
            this.console.println("===============================================");
            this.console.println("Welcome to the game " + playersName);
            this.console.println("We hope you have a lot of fun!");
            this.console.println("===============================================");
        }
        
        return true;
    }
}
