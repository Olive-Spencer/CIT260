/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

/**
 *
 * @author Coby
 */
public class MapControl {
    public double calcDots(){
        double dots = 2000/200;
        return dots;
    }
    
    public void createMap(long milesTravelled){
        double position = milesTravelled/calcDots();
        for(int i = 0; i < position; i++)
        {
            System.out.print(" ");
        }
    }
}
