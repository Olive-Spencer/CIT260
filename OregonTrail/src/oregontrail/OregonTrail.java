/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import oregontrail.model.Game;
import java.util.ArrayList;
import oregontrail.control.ItemListHelpMenuControl;
import oregontrail.model.Actor;
import oregontrail.model.Location;
import oregontrail.model.Occupation;
import oregontrail.model.Player;
import oregontrail.model.RegularSceneType;
import oregontrail.model.Wagon;
import oregontrail.view.AmmunitionPurchaseView;
import oregontrail.view.BuyingFoodView;
import oregontrail.view.ClothingPurchaseView;
import oregontrail.view.DepartureDateMenuView;
import oregontrail.view.GoldPanningView;
import oregontrail.view.StartProgramView;
import oregontrail.view.MainMenuView;
import oregontrail.view.OccupationsView;
import oregontrail.view.ShopMenuView;
import oregontrail.view.HelpMenuView;
import oregontrail.view.ItemListHelpView;
import oregontrail.view.OxenPurchaseView;
import oregontrail.view.WagonTongueView;
import oregontrail.view.MapView;
import oregontrail.control.MapControl;
import oregontrail.control.GameControl;
import oregontrail.control.RiverControl;
import oregontrail.control.TrailControl;
import oregontrail.view.OccupationsSortView;
import oregontrail.view.RiverView;
import oregontrail.view.TrailView;
import oregontrail.view.LocationPrintView;
import oregontrail.view.OccupationPrintView;


/**
 *
 * @author spencer
 */
public class OregonTrail {
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile= null;
    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        
    
        try{
            
                OregonTrail.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
                OregonTrail.outFile = new PrintWriter(System.out, true);
                logFile = new PrintWriter("logFile.txt");
       
       //TrailView trailView = new TrailView();
       //trailView.display();
       //OccupationsSortView occupationsSortView = new OccupationsSortView();
       //occupationsSortView.display();
        
       //System.out.println("ClothingPurchaseView: ");
       //ClothingPurchaseView clothingPurchaseView = new ClothingPurchaseView();
       //clothingPurchaseView.display();
        
        //RiverView riverView = new RiverView();
        //riverView.display();
       /*Commented out for Angie's Individual Assignement
        Commented out for Spencer Individual Assignement
        System.out.println("Departure Date Menu View: ");
       DepartureDateMenuView departureDateMenuView = new DepartureDateMenuView();
       departureDateMenuView.display();*/
       
       /*System.out.println("startProgramView and MainMenuView: ");*/
       
       //Code to start the game.
       StartProgramView startProgramView = new StartProgramView();
       MainMenuView mainMenuView = new MainMenuView();
       startProgramView.display();
       mainMenuView.display();
       //TrailControl trailControl = new TrailControl();
       //trailControl.randomWeather();
       
       
       //OregonTrail.setPlayer(player);
       
       
       
       //System.out.println("startProgramView and MainMenuView: ");
       //StartProgramView startProgramView = new StartProgramView();
       //MainMenuView mainMenuView = new MainMenuView();
       //startProgramView.display();
       //mainMenuView.display();
       OregonTrail.setPlayer(player);
       /*System.out.println("Occupations View: ");
       OccupationsView occupationsView = new OccupationsView();
       occupationsView.display();
       System.out.println("Gold Panning View: ");
       GoldPanningView goldPanningView = new GoldPanningView();
       goldPanningView.display();
       System.out.println("HelpMenuView: ");*/
       //HelpMenuView helpMenuView = new HelpMenuView();
       //helpMenuView.display();
       /*
       System.out.println("ShopMenuView: ");
       ShopMenuView shopMenuView = new ShopMenuView();
       shopMenuView.display();
       System.out.println("BuyingFoodView: ");
       BuyingFoodView buyingFoodView = new BuyingFoodView();
       buyingFoodView.display();
       System.out.println("OxenPurchaseView: ");
       OxenPurchaseView oxenPurchaseView = new OxenPurchaseView();
       oxenPurchaseView.display();*/
       //System.out.println("AmmunitionPurchaseView: ");
       //AmmunitionPurchaseView ammunitionPurchaseView = new AmmunitionPurchaseView();
       //ammunitionPurchaseView.display();
       //System.out.println("WagonTongueView: ");
       //WagonTongueView wagonTongueView = new WagonTongueView();
       //wagonTongueView.display();
       
        }
        catch(Throwable te){
           System.out.println("you have runtime errors " + te.getMessage());
           te.printStackTrace();
           return;
        }
        
        finally {
            
            try{
            if(OregonTrail.inFile != null)    
                OregonTrail.inFile.close();
            
            if(OregonTrail.outFile != null)
                OregonTrail.outFile.close();
            
            if (logFile != null)
                logFile.close(); 
        } catch (IOException ex) {
          System.out.println("Error closing files");
          return;
        }
        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader infile) {
        OregonTrail.inFile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }
    
    
}
