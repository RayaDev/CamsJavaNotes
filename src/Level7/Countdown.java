/*
Write a program that counts down from 30 to 0 and then displays "Boom!".
The program should advance the countdown 10 times per second. To add a delay to the program, use:
Thread.sleep(100); // Delay for one tenth of a second.
 */
package Level7;

/**
 *
 * @author Cam
 */
public class Countdown {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            Thread.sleep(100); //Intresting method call right there. Delay. 
        }
        

        System.out.println("Boom!");
    }
}
    

