/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;



/**
 *
 * @author spencer
 */
public class ItemListHelpMenuControl {
    
    
 
    public static void helpArray(String input){
        String[] array = {"Oxen - No Weight to Wagon","Food - 1 lb. each","Wheel - 20 lb. each","Axle - 20 lb. each","Ammuniton - 3 lb. for a 20 pack","Clothing - 3 lb. per set","Money - No Weight to Wagon"};
        
        
       if ("A".equals(input)){
           String[] array3 = Sort(array);
            for(String i:array3){
            System.out.println(i);
            
            
            }
        }
            else if ("R".equals(input)){
            String[] array2 = SortReverse(array);
            for(String i:array2){
            System.out.println(i);
            
            
        }
        }
    }
    
     
    public static String[] SortReverse(String[] input){
         
        String temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j].compareToIgnoreCase(input[j-1]) > 0) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        
        return input;
    }
    
    public static String[] Sort(String[] input){
         
        String temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j].compareToIgnoreCase(input[j-1]) < 0) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        
        return input;
    }
}
    
