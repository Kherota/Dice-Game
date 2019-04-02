
package dicesimulator;

/**
 *
 * @author Khero
 */
public class Dice {
    
    private int numDice;
    private int numSides;
    private Die[] rollArray;
    
    public Dice () {
    numDice = 0;
    numSides = 0;
    rollArray = null; 
 } 

public Dice (int numDice, int numSides){
this.numDice = numDice;
this.numSides = numSides;
this.rollArray = new Die [numDice];

for (int i = 0; i < numDice; i++ ) {
    rollArray[i] = new Die(numSides);
    
   }

}

public int roll() {
    
    int sum = 0; 
    
    for (int i = 0; i < numDice; i++ ) {
   sum = sum + rollDie(i);
}
    
return sum;
}




public int rollDie (int dieNum){
    
return rollArray[dieNum].roll();
}




public int getDieValue (int dieNum){
    
    return rollArray[dieNum].getValue();
}



public int addEmUp(){
    
    
        int sum = 0; 
    
    for (int i = 0; i < numDice; i++ ) {
   sum = sum + getDieValue(i);
}
    
return sum;
    
  }

}
