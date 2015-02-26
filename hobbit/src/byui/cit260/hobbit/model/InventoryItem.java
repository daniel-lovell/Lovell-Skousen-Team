/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class InventoryItem implements Serializable {
    
    private String inventoryType;
    private int requiredCost;
    private int experiencePoints;

    public InventoryItem() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getRequiredCost() {
        return requiredCost;
    }

    public void setRequiredCost(int requiredCost) {
        this.requiredCost = requiredCost;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", requiredCost=" + requiredCost + ", experiencePoints=" + experiencePoints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.inventoryType);
        hash = 31 * hash + this.requiredCost;
        hash = 31 * hash + this.experiencePoints;
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (this.requiredCost != other.requiredCost) {
            return false;
        }
        if (this.experiencePoints != other.experiencePoints) {
            return false;
        }
        return true;
    }


}
