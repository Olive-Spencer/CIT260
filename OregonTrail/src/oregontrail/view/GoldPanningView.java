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
        System.out.println("You are going to pan for Gold. It takes 3 days to pan in this area, would you like to pan? Y/N");
        System.out.println("Press Q to Quit to main menu.");
        while(valid == false)
        {
          String answer = inFile.nextLine();
            int inputsLength = answer.length();
            if (inputsLength < 1)
            {
                System.out.println("You must enter a valid value");
            }
            else
            {
                valid = true;
                panInputs = answer.trim().toUpperCase();
            }
        }
        return panInputs;
    }

    private boolean doAction(String[] panInputs) {
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        
        boolean panDecision = false;
        String answer = null;
        
        while (panDecision == false){
          
            if (answer.matches("Y"))
            {
                System.out.println("Congradulations, you panned for gold and found some! You sold this gold for 100 dollars!");
               panDecision = true;
            }
            else if (answer.matches("N"))
            {
                System.out.println("Very well. Back to travel menu.");
                panDecision = true;
            }
            else 
                {
                    System.out.println("Please enter a valid value.");
                }
        } 
         return true;
    }
}   

