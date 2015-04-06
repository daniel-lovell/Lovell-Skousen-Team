
package byui.cit260.hobbit.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;


public enum Actor implements Serializable {
    
    Merchant("Sells equipment for Hobbits adventure."),
    Wizard("Blocks entrance to Dragon's lair."),
    Dwarf("Gold mine digger.");
    
    private final String description;
    private final Point coordinates;

    
    public static Actor getMerchant() {
        return Merchant;
    }

    public static Actor getWizard() {
        return Wizard;
    }

    public static Actor getDwarf() {
        return Dwarf;
    }
    
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

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + '}';
    }

    public String getNpc() {
  
        return npc;
    } 
    
    String npc = null;
    public void setNpc(String npc) {
        this.npc = npc;
    }


}