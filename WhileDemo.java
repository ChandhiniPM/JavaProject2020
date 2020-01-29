/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codecademy;

/**
 *
 * @author USER1
 */

    import java.util.Random;

class WhileDemo {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;
while(dieRoll!=5)
    // Repeat while roll isn't 5
{
  System.out.println(dieRoll);
  dieRoll=4;
  dieRoll--;
}
    
  }
  

    
}
