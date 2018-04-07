/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

import java.util.Objects;

/**
 *
 * @author Coby, Spencer
 */
public class Location {

    private int locationNumber; 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.locationNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.locationNumber != other.locationNumber) {
            return false;
        }
        return true;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }

   
    
    
}
