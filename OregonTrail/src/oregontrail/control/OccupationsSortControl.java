/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.exceptions.OccupationsSortControlException;

/**
 *
 * @author Angie
 */
public class OccupationsSortControl {
    
   public static void occupationListArray(String input)
   throws OccupationsSortControlException {
        String[] occupationsArray = {"Banker - $1600.00", "Farmer- $400.00", "Blacksmith - $800.00", "Carpenter - $800.00", "Doctor - $1200.00", "Bandit - $0", "Trapper - $600.00"};
          
       if ("A".equals(input)){
           String[] alpha = Sort(occupationsArray);
            for(String i:alpha){
            System.out.println(i);
            }
        }
       else if ("R".equals(input)){
            String[] reverse = SortReverse(occupationsArray);
                for(String i:reverse){
                System.out.println(i);
            }    
        }
       else {throw new OccupationsSortControlException("Please enter a valid menu item. ");
       }
       
       
           
    }
    
     
    public static String[] SortReverse(String[] occupationsArray){
         
        String tempStr;
        for (int i = 1; i < occupationsArray.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(occupationsArray[j].compareToIgnoreCase(occupationsArray[j-1]) > 0) {
                    tempStr = occupationsArray[j];
                    occupationsArray[j] = occupationsArray[j-1];
                    occupationsArray[j-1] = tempStr;
                }
            }
        }
        
        return occupationsArray;
    }
    
    public static String[] Sort(String[] occupationsArray){
         
        String tempStr;
        for (int i = 1; i < occupationsArray.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(occupationsArray[j].compareToIgnoreCase(occupationsArray[j-1]) < 0) {
                    tempStr = occupationsArray[j];
                    occupationsArray[j] = occupationsArray[j-1];
                    occupationsArray[j-1] = tempStr;
                }
            }
        }
        
        return occupationsArray;
    }
}