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
public enum ItemType {
    food(1),
    clothes(3),
    bullets(2),
    oxen(0),
    wheels(25),
    tongues(35),
    money(0),
    axels(50);
    
    private final double weight;
    
    ItemType(int weight){
        this.weight = weight;
    }
    
    public double getWeight(){
        return this.weight;
    }
}
