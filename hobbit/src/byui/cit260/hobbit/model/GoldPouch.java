/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.model;

import java.io.Serializable;

/**
 *
 * @author Brendan
 */
public class GoldPouch implements Serializable {
    
    private int amount;
    private int maxAmount;

    public GoldPouch() {
        this.amount = 0;
        this.maxAmount = Constants.INITIAL_MAX_GOLD;
    }
    
    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    public String toString() {
        return "GoldPouch{" + "amount=" + amount + ", maxAmount=" + maxAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.amount;
        hash = 97 * hash + this.maxAmount;
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
        final GoldPouch other = (GoldPouch) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (this.maxAmount != other.maxAmount) {
            return false;
        }
        return true;
    }
    
    
    
}
