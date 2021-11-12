/*
The simplest code: part 3
COMPLETED

Simplify the code:
- remove everything that will be generated automatically by the compiler
- remove all class inheritance that will be added automatically by the compiler
- remove all constructors that will be automatically created and added.

Requirements:
•	The Car class should not have explicit no-argument constructors.
•	The Machine class should not have explicit no-argument constructors.
•	The Car class must be a descendant of the Machine class.
•	The code should not have explicit inheritance involving the Object class (extends Object).
•	The Car class should not explicitly inherit the Runnable interface.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_13 {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine /*extends Object */ implements Runnable {
       /* public Machine() {
           super();
        }*/
    }

    public class Car extends Machine /*implements Runnable*/ {
       /* public Car() {
            super();
        }*/
    }   
}
