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
        System.out.println("getCurrentClothes() called.");
    }
    public static void setCurrentClothes(int amount){
        System.out.println("setCurrentClothes() called.");
        System.out.println("amount variable value is:" + amount);
    }
    
}
