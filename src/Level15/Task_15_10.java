/* COMPLETE!
In the main method, remove the superfluous lines for which the add method is not implemented.

Requirements:
•	There must be three add() methods implemented in the Solution class.
•	You need to remove the extra lines in the main() method.
•	All of the Solution class's methods must be static.
•	All of the Solution class's methods must be public.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_10 {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        //add("1", 2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }   
}
