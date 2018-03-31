/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.model.LocationNames;


/**
 *
 * @author spencer
 */
public class LocationPrintView extends View {
    
    public LocationPrintView(){
    super("\nPlease enter the file path where you would like to save the game:");
}
 
    @Override
    public boolean doAction(String inputs) {
        
        
        try
        {
         printFile(inputs);
         
        }
        catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error calling printFile " + ex.getMessage());
                return false;}
        
        
        
        return true;
    }
    
    public void printFile(String inputs) throws IOException{
    
        try (PrintWriter out = new PrintWriter(inputs)) {
            out.println("\n\n             Location List                      ");
            out.printf("%n%-30s%10s%10s", "Location", "Miles in", "Type");
            out.printf("%n%-30s%10s%10s", "--------", "--------", "----");
            
            for(LocationNames locationNames : LocationNames.values()){
                int i = 0; 
                out.printf("%n%-30s%7d%13s", locationNames
                                             , locationNames.getMiles()
                                             , locationNames.getType());}
                out.flush();
                this.console.println("\nSuccess. The file has been saved @ " + inputs);
                
            }
            
         catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error writing file " + ex.getMessage());
        }
        
    }
        
    
}
