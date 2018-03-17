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
    
     
    public static String[] SortReverse(String[] array){
         
        String tempStr;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j].compareToIgnoreCase(array[j-1]) > 0) {
                    tempStr = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tempStr;
                }
            }
        }
        
        return array;
    }
    
    public static String[] Sort(String[] array){
         
        String tempStr;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j].compareToIgnoreCase(array[j-1]) < 0) {
                    tempStr = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tempStr;
                }
            }
        }
        
        return array;
    }
}
    
