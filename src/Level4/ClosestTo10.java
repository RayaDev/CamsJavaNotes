/*
Write the displayClosestToTen method. The method should display the argument that is nearest to 10.
For example, given the numbers 8 and 11, 11 is closest to ten. If both numbers are equally close to 10, then display either of them.

Hint:
use the public static int abs(int a) method, which returns the absolute value of a number.

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print().
•	The main method should call the displayClosestToTen method.
•	The displayClosestToTen method should call the abs method.
•	The displayClosestToTen method should display a number on the screen in accordance with the task conditions.

 */
package Level4;

/**
 *
 * @author Cam
 */
public class ClosestTo10 {
  public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
       int c = 10 - a;
       int d = 10 - b;
       c = abs(c);
       d = abs(d);
       
       if (c < d) {
       System.out.println(a);
       }
       else { 
       System.out.println(b);
       }
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }   
}
