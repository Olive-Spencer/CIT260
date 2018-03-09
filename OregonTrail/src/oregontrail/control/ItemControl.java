/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

/**
 *
 * @author spencer
 */
public class ItemControl {
    public static void getCurrentClothes(){
        System.out.println("Called getCurrentClothes in ItemControl");
    }
    public static void setCurrentClothes(int amount){
        System.out.println("Called setCurrentClothes() in ItemControl");
        System.out.println("amount is:" + amount);
    }
    public static void getCurrentOxen(){
        System.out.println("Called getCurrentOxen in ItemControl");
    }
    public static void setCurrentOxen(int amount){
        System.out.println("Called setCurrentOxen() in ItemControl");
        System.out.println("amount is:" + amount);
    }
 
 
}