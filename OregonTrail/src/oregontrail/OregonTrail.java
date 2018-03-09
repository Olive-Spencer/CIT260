/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import oregontrail.model.Game;
import java.util.ArrayList;
import oregontrail.model.Actor;
import oregontrail.model.Location;
import oregontrail.model.Map;
import oregontrail.model.Occupation;
import oregontrail.model.Player;
import oregontrail.model.RegularSceneType;
import oregontrail.model.Wagon;
import oregontrail.view.BuyingFoodView;
import oregontrail.view.ClothingPurchaseView;
import oregontrail.view.DepartureDateMenuView;
import oregontrail.view.GoldPanningView;
import oregontrail.view.StartProgramView;
import oregontrail.view.MainMenuView;
import oregontrail.view.OccupationsView;
import oregontrail.view.ShopMenuView;
import oregontrail.view.HelpMenuView;

/**
 *
 * @author spencer
 */
public class OregonTrail {
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
       
      
       System.out.println("Departure Date Menu View: ");
       DepartureDateMenuView departureDateMenuView = new DepartureDateMenuView();
       departureDateMenuView.display();
       System.out.println("ClothingPurchaseView: ");
       ClothingPurchaseView clothingPurchaseView = new ClothingPurchaseView();
       clothingPurchaseView.display();
       System.out.println("startProgramView and MainMenuView: ");
       StartProgramView startProgramView = new StartProgramView();
       MainMenuView mainMenuView = new MainMenuView();
       startProgramView.display();
       mainMenuView.display();
       OregonTrail.setPlayer(player);
       System.out.println("Occupations View: ");
       OccupationsView occupationsView = new OccupationsView();
       occupationsView.display();
       System.out.println("Gold Panning View: ");
       GoldPanningView goldPanningView = new GoldPanningView();
       goldPanningView.display();
       System.out.println("HelpMenuView: ");
       HelpMenuView helpMenuView = new HelpMenuView();
       helpMenuView.display();
       System.out.println("ShopMenuView: ");
       ShopMenuView shopMenuView = new ShopMenuView();
       shopMenuView.display();
       System.out.println("BuyingFoodView: ");
       BuyingFoodView buyingFoodView = new BuyingFoodView();
       buyingFoodView.display();
       
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }
    
}
