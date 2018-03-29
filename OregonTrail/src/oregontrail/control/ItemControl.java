/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.view.ErrorView;


/**
 *
 * @author spencer
 */
public class ItemControl {
    public static void getCurrentClothes(){
        System.out.println("Called getCurrentClothes in ItemControl");
    }
    public static int setCurrentClothes(int amount)
    throws NumberFormatException{
        
                       
        
        System.out.println("Called setCurrentClothes() in ItemControl");
        
        return amount;
    }
    public static void getCurrentOxen(){
        System.out.println("Called getCurrentOxen in ItemControl");
    }
    public static void setCurrentOxen(int amount){
        System.out.println("Called setCurrentOxen() in ItemControl");
        System.out.println("amount is:" + amount);
    }
    
    /*Author Angie*/
  public static void getCurrentAmmunition(){
        System.out.println("Called getCurrentAmmunition in ItemControl");
    }
    public static int setCurrentAmmunition(int amount)
    throws NumberFormatException{
        int newAmount = 0;
               
        
        System.out.println("Called setCurrentAmmunition() in ItemControl");
        
        return newAmount;
    }
     /*end of Angies assignment*/   
    public static void getCurrentTongues(){
        System.out.println("Called GetCurrentTongues in ItemControl.");
    }
    public static void setCurrentTongues(int amount){
        System.out.println("amount is: " + amount);
    }
 
}