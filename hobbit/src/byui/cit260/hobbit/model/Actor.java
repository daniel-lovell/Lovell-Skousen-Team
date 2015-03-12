
package byui.cit260.hobbit.model;

import java.awt.Point;
import java.io.Serializable;


public enum Actor implements Serializable {
    
    Merchant("Sells equipment for Hobbits adventure."),
    Wizard("Blocks entrance to Dragon's lair."),
    Dwarf("Gold mine digger.");
    
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
        
    public String getDescription(){
        return description;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }

}


