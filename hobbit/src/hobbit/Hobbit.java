/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit;

import byui.cit260.hobbit.model.Player;

/**
 *
 * @author Brendan
 */
public class Hobbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Player player = new Player();
        
        player.setName("Bob");
        player.setLifePoints(10);
        
        String playerInfo = player.toString();
        System.out.println(playerInfo);
    }
    
}
