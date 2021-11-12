/* Man or woman? COMPLETE!

1. Change the printName method so that it runs for both man and woman.
2. The printName method should have a single implementation.

Requirements:
•	The Solution class should only implement a single printName method.
•	The printName method must have one Human parameter.
•	The Man class must be a descendant of the Human class.
•	The Woman class must be a descendant of the Human class.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_09 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human person) {
        
        if (person instanceof Man)
        {
            System.out.println("I am a man");
        }
        else if (person instanceof Woman)
        {
            System.out.println("I am a woman");
        }
        else
        {
            System.out.println("Not a human");
        }
    }
    public abstract static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
