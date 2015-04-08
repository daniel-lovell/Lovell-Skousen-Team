/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.control;

import byui.cit260.hobbit.model.InventoryItem;

/**
 *
 * @author daniel
 */
public class SkillsControl {

    public static boolean skillMax(InventoryItem item) {
        
        return (item.getExperiencePoints() / 10) >= 1;
        
    }
    
}
