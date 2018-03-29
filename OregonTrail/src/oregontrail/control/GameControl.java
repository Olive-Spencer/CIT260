/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import oregontrail.exceptions.GameControlException;
import oregontrail.model.Actor;
import oregontrail.model.Game;
import oregontrail.model.Player;
/**
 *
 * @author spencer
 */
public class GameControl {
    private static Game game1 = null;
    private static Actor ma = new Actor("Ma", 100, "None");
    private static Actor pa = new Actor("Pa", 100, "None");
    private static Actor child = new Actor("Edgar", 100, "None");
    private static Actor child2 = new Actor("Rachel", 100, "None");
    private static Actor child3 = new Actor("Reginald III", 100, "None");

    public static int createNewGame(Player player){
        if (player == null)
        {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        game1 = game;
        game.setActor(createActors());
        return 1;
        
    }
    
    public static Actor[] createActors(){
        Actor[] actors = new Actor[5];
        actors[0] = ma;
        actors[1] = pa;
        actors[2] = child;
        actors[3] = child2;
        actors[4] = child3;
        return actors;
    }
    
        public static Player savePlayer(String name){
        if (name == null || name.length() <1){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        return player;
    }
        
        public static void saveGame(Game game, String filePath) throws GameControlException, IOException{
            //if(game == null || filePath == null || filePath.length() < 1 )
                //throw new GameControlException("invald entry");
            
            try (ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(filePath))){
                out.writeObject(game);
            } catch (IOException ex) {
                System.out.println("I/O Error: " + ex.getMessage());
                
            }
             
                
            
        }
}
