
package byui.cit260.hobbit.model;

import java.io.Serializable;


public class Game implements Serializable {
    
    private InventoryItem[] inventory;
    private Player player;
    private String[] actors;
    private Map map;
    private Dragon dragon;
    private GoldPouch goldPouch;
            
    private long lastSaved; //timestamp of when game was last saved
    private long created; //timestamp of when the game was created

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public GoldPouch getGoldPouch() {
        return goldPouch;
    }

    public void setGoldPouch(GoldPouch goldPouch) {
        this.goldPouch = goldPouch;
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
