package oregontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Coby
 */
public class Map implements Serializable {
    
    private Location currentLocation;
    private ArrayList<String> checkpointNames = new ArrayList<String>();
    private ArrayList<Location> checkpoints = new ArrayList<Location>();

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public ArrayList<String> getCheckpointNames() {
        return checkpointNames;
    }

    public void setCheckpointNames(ArrayList<String> checkpointNames) {
        this.checkpointNames = checkpointNames;
    }

    public ArrayList<Location> getCheckpoints() {
        return checkpoints;
    }

    public void setCheckpoints(ArrayList<Location> checkpoints) {
        this.checkpoints = checkpoints;
    }

    public Map(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.currentLocation);
        hash = 29 * hash + Objects.hashCode(this.checkpointNames);
        hash = 29 * hash + Objects.hashCode(this.checkpoints);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Objects.equals(this.checkpointNames, other.checkpointNames)) {
            return false;
        }
        if (!Objects.equals(this.checkpoints, other.checkpoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + ", checkpointNames=" + checkpointNames + ", checkpoints=" + checkpoints + '}';
    }
    
    
}
