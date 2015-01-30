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
public class Dragon implements Serializable{
    private int lifePoints;

    public Dragon() {
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    @Override
    public String toString() {
        return "Dragon{" + "lifePoints=" + lifePoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.lifePoints;
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
        final Dragon other = (Dragon) obj;
        if (this.lifePoints != other.lifePoints) {
            return false;
        }
        return true;
    }
    
    
}
