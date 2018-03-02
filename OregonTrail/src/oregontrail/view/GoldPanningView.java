/*
 Gold Panning View
 */
package oregontrail.view;

import java.util.Scanner;


/**
 *
 * @author Angie
 */
public class GoldPanningView {
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
        
    private String getInputs() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String panInputs = null;        
        System.out.println("You are going to pan for Gold. It takes 3 days to pan in this area.");
        System.out.println("Would you like to pan? Y/N");
        System.out.println("press Q to Quit.");
        while(valid == false)
        {
          String newInputs = inFile.nextLine();
            int inputsLength = newInputs.length();
            if (inputsLength < 1)
            {
                System.out.println("You must enter a valid value");
            }
            else
            {
                valid = true;
                panInputs = newInputs.trim().toUpperCase();
            }
        }
        return panInputs;
    }

    private boolean doAction(String[] inputs) {
        String panChoice = inputs[0];
        
        switch (panChoice)
        {
            case "Y": System.out.println("Congradulations, you panned for gold and found some! You sold this gold for 100 dollars!");
            break;
            case "N": System.out.println("Very well. Back to travel menu.");
            break;
            case "Q": return true;
            default: System.out.println("Invalid menu item");
        }
       
        return false;
    
    }
}   

