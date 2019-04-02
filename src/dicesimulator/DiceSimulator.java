/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicesimulator;

/**
 *
 * @author Khero
 */
public class DiceSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Die myDie = new Die (6);
        
        System.out.println("Die roll = " + myDie.roll());
        
        Dice myDice = new Dice (5,6);
        
        System.out.println("sum of 5 six-sided dice = " + myDice.roll());
        
    }
    
}
