/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

/**
 *
 * @author Coby
 */
public enum LocationNames {
    StartLocation(0, "start"),
    Little_Eagle_Point(80, "landmark"),
    Big_Eagle_Point(150, "landmark"),
    Little_Blue_River(220, "river"),
    Independence(340, "settlement"),
    Big_Blue_River(440, "river"),
    Courthouse_Rock(490, "landmark"),
    Missouri_River(560, "river"),
    Fort_McPhearson(620, "fort"),
    Chimney_Rock(710, "landmark"),
    Horse_Creek_Treaty_Grounds(790, "landmark"),
    Fort_Laramie(870, "fort"),
    Fort_Casper(940, "fort"),
    Independence_Rock(1010, "landmark"),
    Devils_Gate(1070, "landmark"),
    Burnt_Ranch(1130, "settlement"),
    Little_Sandy_Crossing(1210, "river"),
    Big_Sandy_Crossing(1290, "river"),
    Fort_Bridger(1370, "fort"),
    Soda_Springs(1430, "settlement"),
    Snake_River(1500, "river"),
    Givens_Hot_Springs(1570, "landmark"),
    Fort_Boise(1630, "fort"),
    Dead_Man_Pass(1740, "landmark"),
    Portland(1860, "city"),
    Oregon_City(2000, "city");
    
    public final int miles;
    public final String type; 
    
    LocationNames(int miles, String type){
        this.miles = miles;
        this.type = type;
    }
    
    public int getMiles(){
        return this.miles;
    }
    
    public String getType(){
        return this.type;
    }
}
