/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.model;

import java.io.Serializable;

/**
 *
 * @author daniel
 */
public class Game implements Serializable {
    private long lastSaved; //timestamp of when game was last saved
    private long created; //timestamp of when the game was created

    public Game() {
    }
    
    public long getLastSaved() {
        return lastSaved;
    }

    public void setLastSaved(long lastSaved) {
        this.lastSaved = lastSaved;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Game{" + "lastSaved=" + lastSaved + ", created=" + created + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (this.lastSaved ^ (this.lastSaved >>> 32));
        hash = 71 * hash + (int) (this.created ^ (this.created >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.lastSaved != other.lastSaved) {
            return false;
        }
        if (this.created != other.created) {
            return false;
        }
        return true;
    }
    
    
}
