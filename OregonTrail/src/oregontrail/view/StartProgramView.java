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
public class StartProgramView {
    public StartProgramView(){
    }

    public void display() {
        boolean endOfView = false;
        do{
            String[] inputs = new String[1];
            inputs[0] = this.getInputs();
            if(inputs[0] == null || inputs[0].equals("Q")){
                return;
            }
            else {
                endOfView = doAction(inputs);   
            }
        }
        while(endOfView != true);
}

    private String getInputs() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String newInputs = null;
        System.out.println("Welcome to the Oregon Trail! This was created by Spencer Olive, Angie Coates, and Coby Carter");
        System.out.println("Your job is to get at least one person to Oregon.");
        while(valid == false)
        {
            System.out.println("Please enter your name:");
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            if (inputsLength < 1)
            {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            else
            {
                valid = true;
                newInputs = inputs.trim().toUpperCase();
                
            }
        }
        return newInputs;

    }

    private boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if(player == null){
            System.out.println("Could not create the player." + "Enter a different name.");
            return false;
        }
        else{
            System.out.println("===============================================");
            System.out.println("Welcome to the game " + playersName);
            System.out.println("We hope you have a lot of fun!");
            System.out.println("===============================================");
        }
        
        return true;
    }
}
