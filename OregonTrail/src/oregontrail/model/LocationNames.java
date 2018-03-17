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
    StartLocation(0),
    Little_Eagle_Point(80),
    Big_Eagle_Point(150),
    Little_Blue_River(220),
    Independence(340),
    Big_Blue_River(440),
    Courthouse_Rock(490),
    Missouri_River(560),
    Fort_McPhearson(620),
    Chimney_Rock(710),
    Horse_Creek_Treaty_Grounds(790),
    Fort_Laramie(870),
    Fort_Casper(940),
    Independence_Rock(1010),
    Devils_Gate(1070),
    Burnt_Ranch(1130),
    Little_Sandy_Crossing(1210),
    Big_Sandy_Crossing(1290),
    Fort_Bridger(1370),
    Soda_Springs(1430),
    Snake_River(1500),
    Givens_Hot_Springs(1570),
    Fort_Boise(1630),
    Dead_Man_Pass(1740),
    Portland(1860),
    Oregon_City(2000);
    
    private final int miles;
    
    LocationNames(int miles){
        this.miles = miles;
    }
    
    public int getMiles(){
        return this.miles;
    }
}
