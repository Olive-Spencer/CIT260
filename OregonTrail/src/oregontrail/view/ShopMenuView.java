/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Coby
 */
public class ShopMenuView extends View {
    BuyingFoodView buyingFoodView = new BuyingFoodView();
    WagonTongueView wagonTongueView = new WagonTongueView();
    AmmunitionPurchaseView ammunitionPurchaseView = new AmmunitionPurchaseView();
    OxenPurchaseView oxenPurchaseView = new OxenPurchaseView();
    public ShopMenuView(){
        super("\nChoose which ware you want to purchase:"
        + "\nF - Food"
        +"\nC - Clothes"
        +"\nO - Oxen"
        +"\nT - Wagon Tongues"
        +"\nW - Wagon Wheels"
        +"\nB - Bullets"
        +"\nQ - Leave shop"
        +"\nPlease enter what you would like to buy:");
    }
        @Override
        public boolean doAction(String inputs) {
        String menuItem = inputs.toUpperCase();
        switch (menuItem)
        {
            case "F": buyingFoodView.display();
            break;
            case "C": this.console.println("You are now buying clothes!");
            break;
            case "O": oxenPurchaseView.display();
            break;
            case "T": wagonTongueView.display();
            break;
            case "W": this.console.println("You are now buying Wagon Wheels!");
            break;
            case "B": ammunitionPurchaseView.display();
            break;
            case "Q": this.console.println("Come back soon!");
                      return true;
            default: this.console.println("Invalid menu item");
        }
        return false;
    }
}
