/*
Implement the print3 method. The method should display the passed string 3 times.
Each time, on a new line.

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The print3 method should display the text on the screen.
•	The main method should call the print3 method only once.
•	The print3 method should display the string 3 times. Each time, on a new line.
 */
package Level2;

/**
 *
 * @author Cam
 */
public class RepitionIs {
    
    public static void print3(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
