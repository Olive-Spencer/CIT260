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
    public static int setCurrentClothes(String amount)
    throws NumberFormatException{
        int newAmount = 0;
        try {
                    newAmount = Integer.parseInt(amount);
                } catch (NumberFormatException ex) {
                    System.out.println("you entered an invalid number " + ex.getMessage());
                    
                }
                    
        
        System.out.println("Called setCurrentClothes() in ItemControl");
        
        return newAmount;
    }
    public static void getCurrentOxen(){
        System.out.println("Called getCurrentOxen in ItemControl");
    }
    public static void setCurrentOxen(int amount){
        System.out.println("Called setCurrentOxen() in ItemControl");
        System.out.println("amount is:" + amount);
    }
  public static void getCurrentAmmunition(){
        System.out.println("Called getCurrentOxen in ItemControl");
    }
    public static void setCurrentAmmunition(int amount){
        System.out.println("Called setCurrentOxen() in ItemControl");
        System.out.println("amount is:" + amount);
    }
    public static void getCurrentTongues(){
        System.out.println("Called GetCurrentTongues in ItemControl.");
    }
    public static void setCurrentTongues(int amount){
        System.out.println("amount is: " + amount);
    }
 
}