/*
Write the checkInterval method. The method should check whether an integer is in the range from 50 to 100  and display the result on the screen as follows: "The number a is not in the interval." or "The number a is in the interval.", where a is the method argument.
 */
package Level4;

/**
 *
 * @author Cam
 */
public class LuckyNumber7 {
     
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (a > 50 && a < 112) {
            System.out.println("The number " + a + " is in the interval.");
            }
            else {
            System.out.println("The number " + a + " is not in the interval.");
             }
        }
    }   

