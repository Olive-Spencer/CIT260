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
public class FoodControl {
    public FoodControl(int inputs) {
    }
    public static void getCurrentFood(){
        System.out.println("getCurrentFood() called.");
    }
    public static void setCurrentFood(int amount){
        System.out.println("setCurrentFood() called.");
        System.out.println("amount variable value is:" + amount);
    }
    
}
