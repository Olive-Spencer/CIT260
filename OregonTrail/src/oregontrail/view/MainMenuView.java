/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;


import oregontrail.OregonTrail;
import oregontrail.control.GameControl;

/**
 *
 * @author Coby
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
    + "\n-------------------------------------------------------------"
    + "\n| Main Menu                                                 |"
    + "\n-------------------------------------------------------------"
    + "\nN - Start new game"
    + "\nR - Restart existing game"
    + "\nH - Get help on how to play the game"
    + "\nS - Shop menu test"
    + "\nQ - Quit"
    + "\n-------------------------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String inputs) {
            String menuItem = inputs.toUpperCase();
            switch (menuItem)
            {
                case "N": startNewGame();
                break;
                case "R": restartGame();
                break;
                case "H": getHelp();
                break;
                case "S": shopMenu();
                break;
                case "Q": return true;
                default: System.out.println("Invalid menu item");                
            }
            return false;
        }
    
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
    }
    
    private static void shopMenu(){
        ShopMenuView shopMenuView = new ShopMenuView();
        shopMenuView.display();
    }
}
