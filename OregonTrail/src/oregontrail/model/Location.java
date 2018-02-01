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
public class Location {
    private String junk;
    private String otherjunk;

    public String getJunk() {
        return junk;
    }

    public void setJunk(String junk) {
        this.junk = junk;
    }

    public String getOtherjunk() {
        return otherjunk;
    }

    public void setOtherjunk(String otherjunk) {
        this.otherjunk = "Test to see if it works";
        this.junk = "This is also a test to see if it works";
    }
    
    
}
