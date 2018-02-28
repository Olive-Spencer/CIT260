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
class HelpMenuView {
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
        System.out.println("G - What is the goal of the game?");
        System.out.println("E - Estimate amount of resources needed");
        System.out.println("O - List of Occupations");
        System.out.println("Q - Quit to main menu");
        while(valid == false)
        {
            System.out.println("Please enter your choice:");
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            if (inputsLength < 1)
            {
                System.out.println("Invalid value entered");
                continue;
            }
            else
            {
                valid = true;
                newInputs = inputs.trim().toUpperCase();
                
            }
        }
        return newInputs;

    
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        switch (menuItem)
        {
            case "G": System.out.println("The goal of the game is to get at least one person to Oregon.");
            break;
            case "E": System.out.println("More on resource estimates coming soon.");
            break;
            case "O": System.out.println("More on the different occupations coming soon.");
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
        return false;
    }
}