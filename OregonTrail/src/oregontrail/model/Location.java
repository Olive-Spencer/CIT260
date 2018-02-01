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
    private String junk;
    private String otherjunk;
    private String name; 

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + '}';
    }
    
    

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