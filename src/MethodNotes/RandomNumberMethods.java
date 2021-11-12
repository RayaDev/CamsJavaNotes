/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Cam
 */
public class RandomNumberMethods {
    
    public static void main(String[] args) {
	
        usingMathClass();
        usingRandomClass();
        usingThreadLocalClass();
    }
  
    static void usingMathClass() {
	
        double randomDouble = Math.random(); //Generates a number between 0.00 (inclusive) to 1.00 (exculsive)
	randomDouble = randomDouble * 50 + 1; //Multiple and add to correct the range.
	int randomInt = (int) randomDouble; //Cast to int to truncate the double. 
	System.out.println(randomInt);
    }
    
    static void usingRandomClass() {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(50) + 1; //Generates value between 1 and 50..Other wise would be 0 to 49.
	System.out.println("Random number generated is : " + randomInt);
    }
    
    static void usingThreadLocalClass() {
	int randomInt = ThreadLocalRandom.current().nextInt(1, 51); //Allows for a lower and upper limit. Good class for multiThread environment. 
	System.out.println("Random number generated is : " + randomInt);
   }
     
     
}
