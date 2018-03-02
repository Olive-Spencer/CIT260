/*
 Occupations View 
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class OccupationsView {
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
        String occupationInput = null;
        System.out.println("Many different kinds of people made the trip to Oregon. You may: ");
        System.out.println("1 - Be a banker from Boston");
        System.out.println("2 - Be a carpenter from Ohio");
        System.out.println("3 - Be a farmer from Illinois");
        System.out.println("4 - Be a blacksmith from Missouri");
        System.out.println("5 - Be a doctor from Kentucky");
        System.out.println("6 - Be a Bandit from Kentucky");
        System.out.println("7 - Be a Trapper from Kentucky");
        System.out.println("Q - Quit to main menu");
        while(valid == false)
        {
            System.out.println("Please enter your choice here:");
            String inputs = inFile.nextLine();
            int inputsLength = inputs.length();
            if (inputsLength < 1)
            {
                System.out.println("Invalid value entered");  
            }
            else
            {
                valid = true;
               occupationInput = inputs.trim().toUpperCase();          
            }
        }
        return occupationInput;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        
        switch (menuItem)
        {
            case "1": System.out.println("You have chosen to be a Banker from Boston!");
            break;
            case "2": System.out.println("You have chosen to be a Carpenter from Ohio!");
            break;
            case "3": System.out.println("You have chosen to be a Farmer from Illinois!");
            break;
            case "4": System.out.println("You have chosen to be a Blacksmith from Missouri!");
            break;
            case "5": System.out.println("You have chosen to be a Doctor from Kentucky!");
            break;
            case "6": System.out.println("You have chosen to be a Bandit!");
            break;
            case "7": System.out.println("You have chosen to be a Trapper!");
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
           
        }
       
        return false;
        
       
    }
}
    



    

