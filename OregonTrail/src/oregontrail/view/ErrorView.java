/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author spencer
 */
public class ErrorView {
    private static PrintWriter console = OregonTrail.getOutFile();
    private static PrintWriter log = OregonTrail.getLogFile(); 
    


public static void display(String className, String errorMessage) {

    console.println(
        "\n--- ERROR --------------------------------------------------------"
     +  "\n" + errorMessage
     +  "\n------------------------------------------------------------------");
     
    log.printf("%n%n%s", className + " - " + errorMessage);
     
    }
}
