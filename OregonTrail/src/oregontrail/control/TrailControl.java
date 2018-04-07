/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
import java.util.Random;
import oregontrail.exceptions.TrailControlException;



/**
 *
 * @author spencer
 */
public class TrailControl {
    public static Random rand = new Random();
    
    
    public static void randomWeather() throws TrailControlException{
        
        //these items will be passed in depending on the current month and location condition
        int locationC = rand.nextInt(2);
        int month = rand.nextInt(11);
        
        double weatherStatus = calcWeather(locationC, month);
        
        
        
        if (weatherStatus % 1 == 0){
            int weatherInt = (int) Math.round(weatherStatus); 
            switch (weatherInt) {
                case 1: System.out.println("\nIt's snowing! You lose 5 days");
                        break;
                case 2: System.out.println("\nIt's hailing in the desert! Seek shelter. You lose 1 day");
                        break;
                case 3: System.out.println("\nIt's raining making it difficult to move forward. You lose 2 days");
                        break;
                case 6: System.out.println("\nIt rains and makes the rocks slick. You lose 2 days!");
                        break;
                case 7: System.out.println("\nA summer flood hits the desert! You lose 5 days!");
                        break;
                case 8: System.out.println("\nA summer storm inpeads your progress! You lose 2 days!");
                        break;
                case 11: System.out.println("\nA cold mountain storm hits. You lose 5 days!");
                         break;
                case 12: System.out.println("\nIt's unusually hot and you need to rest. Lose 2 days!");
                         break;
                case 13: System.out.println("\nWindy weather tips over the wagon! Lose 3 days to clean up!");
                         break;
                default: break;
        }
        }
    }
    
    
    
    public static double calcWeather(int locationCondition, int month) throws TrailControlException{
        int weatherMonth=0;
        
        if (month < 0 || month > 11){ 
            throw new TrailControlException("The month is invalid.");
        }
        if (locationCondition < 0 || locationCondition > 2){
            throw new TrailControlException("The locationCondition is invalid.");
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
            throw new TrailControlException("The RandomNumber is invalid");
        }
        
        double weatherStatus = locationCondition + weatherMonth + (randomNumber/ 10);

        return weatherStatus;

    }
    
}
