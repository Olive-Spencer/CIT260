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
public class ShopMenuView {
    BuyingFoodView buyingFoodView = new BuyingFoodView();
    public void display(){
            boolean endOfView = false;
        do{
            String[] inputs = new String[1];
            inputs[0] = this.getInputs();
            if(inputs[0] == null || inputs[0].equals("Q")){
                return;
            }
            else {
                endOfView = doAction(inputs);   
            }
        }
        while(endOfView != true);
    }
    
    private String getInputs(){
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String newInputs = null;
        System.out.println("Choose which ware you want to purchase:");
        System.out.println("F - Food");
        System.out.println("C - Clothes");
        System.out.println("O - Oxen");
        System.out.println("T - Wagon Tongues");
        System.out.println("W - Wagon Wheels");
        System.out.println("B - Bullets");
        System.out.println("Q - Leave shop"); 
        do
        {
            System.out.println("Please enter what you would like to buy:");
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            newInputs = inputs.trim().toUpperCase();
            if (inputsLength < 1)
            {
                System.out.println("Invalid value entered");
                continue;
            }
            else
            {
                valid = true;
            }
        } 
        while(valid == false);
        return newInputs;
    }
    
        private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        switch (menuItem)
        {
            case "F": buyingFoodView.display();
            break;
            case "C": System.out.println("You are now buying clothes!");
            break;
            case "O": System.out.println("You are now buying Oxen!");
            break;
            case "T": System.out.println("You are now buying Wagon Tongues!");
            break;
            case "W": System.out.println("You are now buying Wagon Wheels!");
            break;
            case "B": System.out.println("You are now buying Bullets!");
            break;
            case "Q": System.out.println("Come back soon!");
                      return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }
}
