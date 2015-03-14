/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hobbit.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Location implements Serializable {
    private int rowCoordinate;
    private int columnCoordinate;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;

    public Location() {
    }

    public int getRowCoordinate() {
        return rowCoordinate;
    }

    public void setRowCoordinate(int rowCoordinate) {
        this.rowCoordinate = rowCoordinate;
    }

    public int getColumnCoordinate() {
        return columnCoordinate;
    }

    public void setColumnCoordinate(int columnCoordinate) {
        this.columnCoordinate = columnCoordinate;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    @Override
    public String toString() {
        return "Location{" + "rowCoordinate=" + rowCoordinate + ", columnCoordinate=" + columnCoordinate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.rowCoordinate;
        hash = 89 * hash + this.columnCoordinate;
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
        final Location other = (Location) obj;
        if (this.rowCoordinate != other.rowCoordinate) {
            return false;
        }
        if (this.columnCoordinate != other.columnCoordinate) {
            return false;
        }
        return true;
    }
    
    
}
