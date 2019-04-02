/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicesimulator;

import java.util.Random;

/**
 *
 * @author Khero
 */
class Die {
    public Die (){
        numSides = 0;
        value = 0;
        
    }
            public Die (int sides){
                
                numSides = sides;
                value = 0;
                
            }
            
            public int roll (){
                
                Random rand = new Random();
                value = rand.nextInt(numSides) + 1;
                return value;
                
            }
            
            private int numSides;
            private int value;
            
            public int getValue(){
                return value;  
            }
            
             public int getNumSides(){
                return numSides;
             }
          
              public void setNumSides(int numSide){
                this.numSides = numSides;
              }
}



