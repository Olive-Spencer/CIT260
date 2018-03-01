/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
import java.util.Random;



/**
 *
 * @author spencer
 */
public class TrailControl {
    public static Random rand = new Random();
    
    
    
    public static double calcWeather(int locationCondition, int month){
        int weatherMonth=0;
        
        if (month < 0 || month > 11){ 
            return -1;
        }
        if (locationCondition < 0 || locationCondition > 2){
            return -1;
        }
        if (month == 10 || month == 11 || month == 0 || month == 1){
            weatherMonth = 0;
        }
        else if (month == 5 || month == 6 || month == 7)
        {
            weatherMonth = 5;
        }
        else{
            weatherMonth = 10;
        }
        double randomNumber = rand.nextInt(10);

        if (randomNumber < 0 || randomNumber > 10){
            return -1;
        }
//the random number has been replaced with the first 10 below for test purposes.        
        double weatherStatus = locationCondition + weatherMonth + (10/ 10);

        return weatherStatus;

    }
    
}