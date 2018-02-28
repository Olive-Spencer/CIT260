/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.OregonTrail;
import oregontrail.control.GameControl;

/**
 *
 * @author Coby
 */
public class MainMenuView {

    private static void startNewGame() {
        GameControl.createNewGame(OregonTrail.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private static void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }

    private static void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        GameControl.createNewGame(OregonTrail.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
    private static void shopMenu(){
        ShopMenuView shopMenuView = new ShopMenuView();
        shopMenuView.display();
    }
    
    public void display(){
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
            System.out.println("N - Start new game");
            System.out.println("R - Restart existing game");
            System.out.println("H - Get help on how to play the game");
            System.out.println("S - Shop menu test");
            System.out.println("Q - Quit");
            while(valid == false)
            {
            System.out.println("Please enter your choice:");
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            if (inputsLength < 1)
            {
                System.out.println("Invalid value entered");
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
        private static boolean doAction(String[] inputs) {
            String menuItem = inputs[0];
            switch (menuItem)
            {
                case "N": startNewGame();
                break;
                case "R": restartGame();
                break;
                case "H": getHelp();
                break;
                case "S": shopMenu();
                case "Q": return true;
                default: System.out.println("Invalid menu item");                
            }
            return false;
        }
}
