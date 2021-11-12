/*  Something superfluous: COMPLETE! 

1. The program should display the following:
This is a double
This is an Object
This is a double
This is an Integer
This is a double

2. Remove all unnecessary methods

Requirements:
•	The Solution class must retain a print method with one Integer parameter.
•	The Solution class must retain a print method with one Object parameter.
•	The Solution class must retain a print method with one double parameter.
•	The screen output must match the task conditions.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_06 {
 public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("This is an Integer");
    } 

   /* public static void print(int i) {
        System.out.println("This is an Integer");
    } */

    public static void print(Short i) {
        System.out.println("This is an Object");
    }

    public static void print(Object i) {
        System.out.println("This is an Object");
    }

    public static void print(double i) {
        System.out.println("This is a double");
    }

    public static void print(Double i) {
        System.out.println("This is a double");
    }

    /*public static void print(float i) {
        System.out.println("This is a Double");
    }  */
}
