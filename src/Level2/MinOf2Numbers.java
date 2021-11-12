/*
Methods can be in any order relative to the main method? 
 
Write a function that returns the minimum of two numbers.

Hint:
You need to write the body of the existing min function.

Requirements:
•	The program should display text on the screen.
•	The min method should not display text on the screen.
•	The main method should call the min method three times.
•	The main method should display the result of the min method. Each time, on a new line.
•	The min method must return the minimum of the numbers a and b.
*/
package Level2;

/**
 *
 * @author Cam
 */
public class MinOf2Numbers {
    
         public static int min(int a, int b) {
         int m1;
      if (a < b)
           m1 = a;
      else
         m1 = b;

      return m1;
    }
    
    
    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }

}