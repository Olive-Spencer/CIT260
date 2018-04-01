/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import java.io.PrintWriter;
import oregontrail.model.Occupation;

/**
 *
 * @author Angie
 */
public class OccupationPrintView extends View{

    public OccupationPrintView(){
         super("\nPlease enter the file path that you would like to print the list of occupations:");
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
            out.println("\n\n             Occupations List        ");
            out.printf("%n%-20s%300s%10s", "Occupation", "Description", "Salary");
            out.printf("%n%-25s%300s%10s", "--------", "--------" , "--------");
            
            for(Occupation occupation : Occupation.values()){
                int i = 0; 
                out.printf("%n%-30s%300s%10s", occupation.getName()
                                             , occupation.getDescription()
                                             , occupation.getSalary());}
                out.flush();
                this.console.println("\nSuccess. The file has been saved @ " + inputs);
                
            }
            
         catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error writing file " + ex.getMessage());
            }
        
    
    }
    
}
