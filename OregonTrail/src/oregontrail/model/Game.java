/*
 This is the Game class
 */
package oregontrail.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Angie
 */

public class Game {
    //class instance variables
    private String playersName;
    private double currentScore;
    private double actorCount;
    private String location;
    private double[] highScoresList = new double[10];
    private Player player;

    //constructor
    public Game() {
    }

    //getter and setter functions
    
    public String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    public double getActorCount() {
        return actorCount;
    }

    public void setActorCount(double actorCount) {
        this.actorCount = actorCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double[] getHighScores() {
        return highScoresList;
    }

    public void setHighScores(double[] highScores) {
        this.highScoresList = highScores;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.playersName);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.actorCount) ^ (Double.doubleToLongBits(this.actorCount) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Arrays.hashCode(this.highScoresList);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actorCount) != Double.doubleToLongBits(other.actorCount)) {
            return false;
        }
        if (!Objects.equals(this.playersName, other.playersName)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Arrays.equals(this.highScoresList, other.highScoresList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "playersName=" + playersName + ", currentScore=" + currentScore + ", actorCount=" + actorCount + ", location=" + location + ", highScoresList=" + highScoresList + ", player=" + player + '}';
    }
    
    
}

