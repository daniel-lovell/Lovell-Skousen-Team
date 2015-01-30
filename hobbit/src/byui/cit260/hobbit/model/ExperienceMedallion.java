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
public class ExperienceMedallion extends InventoryItem implements Serializable {
    private int amountAttack;
    private int maxAmountAttack;
    private int amountDefend;
    private int maxAmountDefend;

    public ExperienceMedallion() {
    }

    public int getAmountAttack() {
        return amountAttack;
    }

    public void setAmountAttack(int amountAttack) {
        this.amountAttack = amountAttack;
    }

    public int getMaxAmountAttack() {
        return maxAmountAttack;
    }

    public void setMaxAmountAttack(int maxAmountAttack) {
        this.maxAmountAttack = maxAmountAttack;
    }

    public int getAmountDefend() {
        return amountDefend;
    }

    public void setAmountDefend(int amountDefend) {
        this.amountDefend = amountDefend;
    }

    public int getMaxAmountDefend() {
        return maxAmountDefend;
    }

    public void setMaxAmountDefend(int maxAmountDefend) {
        this.maxAmountDefend = maxAmountDefend;
    }

    @Override
    public String toString() {
        return "ExperienceMedallion{" + "amountAttack=" + amountAttack + ", maxAmountAttack=" + maxAmountAttack + ", amountDefend=" + amountDefend + ", maxAmountDefend=" + maxAmountDefend + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.amountAttack;
        hash = 23 * hash + this.maxAmountAttack;
        hash = 23 * hash + this.amountDefend;
        hash = 23 * hash + this.maxAmountDefend;
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
        final ExperienceMedallion other = (ExperienceMedallion) obj;
        if (this.amountAttack != other.amountAttack) {
            return false;
        }
        if (this.maxAmountAttack != other.maxAmountAttack) {
            return false;
        }
        if (this.amountDefend != other.amountDefend) {
            return false;
        }
        if (this.maxAmountDefend != other.maxAmountDefend) {
            return false;
        }
        return true;
    }

    
}