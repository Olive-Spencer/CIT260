/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.model.Player;

/**
 *
 * @author spencer
 */
public class GameControl {
    public static Player savePlayer(String name){
        if (name == null || name.length() < 1){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        return player;
    }
    
    public static void createNewGame(Player player){
        System.out.println("createNewGame() called");
    }
}
