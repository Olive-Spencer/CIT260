/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author spencer, angie, coby
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
        
    }
    
    @Override
    public void display() {
        
        boolean endOfView;
        do{
            String inputs = this.getInputs();
            if(inputs.toUpperCase().equals("Q")){
                return;
            }
            else {
                endOfView = this.doAction(inputs);   
            }
        }
        while(endOfView != true);
        
        
}
    
  
    @Override
    public String getInputs() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while(!valid)
        {
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1)
            {
                System.out.println("\n*** You must enter a non-blank value ***");
                continue;
            }
                       
            break;
        }
        value = value.toUpperCase();
        return value;

    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        return true;
    }
    
}

