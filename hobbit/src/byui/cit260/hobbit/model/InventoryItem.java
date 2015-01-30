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
public class InventoryItem implements Serializable {
    
    private char inventoryType;
    private int requiredCost;

    public InventoryItem() {
    }

    public char getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(char inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getRequiredCost() {
        return requiredCost;
    }

    public void setRequiredCost(int requiredCost) {
        this.requiredCost = requiredCost;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", requiredCost=" + requiredCost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.inventoryType;
        hash = 89 * hash + this.requiredCost;
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
        if (this.inventoryType != other.inventoryType) {
            return false;
        }
        if (this.requiredCost != other.requiredCost) {
            return false;
        }
        return true;
    }
    
    
}
