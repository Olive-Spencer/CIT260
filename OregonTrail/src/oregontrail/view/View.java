/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author spencer, angie, coby
 */
public abstract class View implements ViewInterface {
    
    private String displayMessage;
    
    
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
    
    public View() {
    }
    
    public View(String message) {
        displayMessage = message;
        
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
        String inFile = null;
        
       
        boolean valid = false;
        String value = null;
        
        this.console.println(displayMessage);
        
        while(!valid)
        {
            
            
             try {
            inFile = this.keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            value = inFile;
            value = value.trim();
            if (value.length() < 1)
            {
                this.console.println("\n*** You must enter a non-blank value ***");
                
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

