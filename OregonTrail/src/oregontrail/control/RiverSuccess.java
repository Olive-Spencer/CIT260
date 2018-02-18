/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import java.util.Random;

/**
 *
 * @author Coby
 */
public class RiverSuccess {
    public static int success = 0;
    public static Random rand = new Random();
    public static int calcSuccess (int width, int depth, int month, int choice)
    {
        int widthNumber = 0;
        int depthNumber = 0;
        int weatherNumber = 0;
        int riverConditions = 0;
        if (width < 1 || depth < 1 || month < 0 || month > 11 || choice < 0 || choice > 3)
        {
            success = -1;
            return success;
        }
        if (width <= 20)
        {
            widthNumber = 0;//Will need random int here
        }
        else
        {
            widthNumber = 2;//Will need random int here
        }
        if (depth <= 10)
        {
            depthNumber = 0; //Will need random int here
        }
        else
        {
            depthNumber = 2; //Will need random int here
        }
        if (month >= 10 || month <= 3)
        {
            weatherNumber = 2; //Will need random int here
        }
        riverConditions = widthNumber + depthNumber + weatherNumber;
        if (riverConditions < 0 || riverConditions > 6)
        {
            success = -1;
            return success;
        }
        success = riverConditions + choice;
        if (success < 3)
        {
        return 1;
        }
        else
        {
            return success;//May need to adjust this to return a 2 so I don't have to calculate a lot.
        }
        }
}
