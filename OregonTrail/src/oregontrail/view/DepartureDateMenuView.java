/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author spencer
 */

public class DepartureDateMenuView {
        public void display(){
            boolean endOfView;
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
        String adjustedInputs = null;
        System.out.println("The year time of year you choose to leave is very important! Choose wisely!");
        System.out.println("1 - March");
        System.out.println("2 - April");
        System.out.println("3 - May");
        System.out.println("4 - June");
        System.out.println("5 - July");
        System.out.println("Q - Quit to main menu");
        while(valid == false)
        {
            System.out.println("Please enter your choice:");
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            if (inputsLength < 1)
            {
                System.out.println("Invalid value entered");
                
            }
            else
            {
                valid = true;
                adjustedInputs = inputs.trim().toUpperCase();
                
            }
        }
        return adjustedInputs;

    
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        
        switch (menuItem)
        {
            case "1": System.out.println("You have chosen to leave in March!");
            break;
            case "2": System.out.println("You have chosen to leave in April!");
            break;
            case "3": System.out.println("You have chosen to leave in May!");
            break;
            case "4": System.out.println("You have chosen to leave in June!");
            break;
            case "5": System.out.println("You have chosen to leave in July!");
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        System.out.println("are you ok with leaving at this time? y/n");
        Scanner inFile;
        inFile = new Scanner(System.in);
        String confirmation = inFile.nextLine();
        String adjustConfirm;
        adjustConfirm = confirmation.trim().toUpperCase();
                
        switch (adjustConfirm)
        {
            case "Y": return true;
            case "N": return false;
            default: break;
                               
    }
        return false;
        
       
    }
}
    

