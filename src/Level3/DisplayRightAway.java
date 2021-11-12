/*
Add the public static void printString(String s) method, and write code that will make it display the passed string.

Requirements:
•	Add a printString method that takes a String argument.
•	The printString method must be void.
•	The printString method must be static.
•	The printString method must be public.
•	The printString method must display the passed text.
•	The program should display "Hello, Amigo!".
 */
package Level3;

public class DisplayRightAway {
    // write your code here

    public static void main(String[] args) {
        String s = "Hello, Amigo!";
        printString(s);
    }
    public static void printString(String s1) {   
        System.out.println(s1);
    }
}
