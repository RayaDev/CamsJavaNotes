/*
 Arrange the brackets correctly (differently) so that the number 382 is displayed on the screen.

Requirements:
•	The program must not read data from the keyboard.
•	The main method must contain only one call to System.out.println.
•	The sequence of digits and arithmetic operations can not be changed.
•	The final expression should have 2 opening and 2 closing parentheses.
•	The main method should display the number 382.
 */
package Level3;

//Orignal code
/*  public class BrainTeaser {
   
    public static void main(String[] args) {
        System.out.println((2 * 3) + 4 * 5 + (6 * 7));
    }
} */
 
// 382 FActors 2 and 191
// In the future trying intializing an array and pulling numbers out to find the solution!
public class BrainTeaser {
    public static void main(String[] args) {
        System.out.println(     2 *(3 + 4 * (5 + 6 * 7))     );
    }
}
