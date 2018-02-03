/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import oregontrail.model.Game;
import oregontrail.model.Location;
import oregontrail.model.Occupation;
import oregontrail.model.Player;
import oregontrail.model.RegularSceneType;
import oregontrail.model.Wagon;

/**
 *
 * @author spencer
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Occupation.Banker.toString());
       System.out.println(Occupation.Farmer.toString());
       
       Wagon wagon = new Wagon();
       wagon.setItem("test wagon item");
       wagon.setStatus("test wagon status");
       
       System.out.println(wagon.toString());
       
       RegularSceneType regularSceneType = new RegularSceneType();
       
       regularSceneType.setScene("test RegularSceneType Scene");
       
       System.out.println(regularSceneType.toString());
       
       Location location = new Location();
       location.setName("test location name");
       
       System.out.println(location.toString());
       
       Player playerOne = new Player();
       playerOne.setName("Jim Bean");
       playerOne.setHighScore(15);
      
       System.out.println(playerOne.toString());
       
       Game testGame = new Game();
       testGame.setActorCount(5);
       testGame.setLocation("test Location");
       testGame.setPlayersName("Micky Mouse");
       
       System.out.println(testGame.toString());
       
    }
    
}
