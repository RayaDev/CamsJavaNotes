/*

This one was a mind fuck. Study this one hard. 


Calculate the total cost of apples.
The total cost of apples corresponds to public static int applePrice.

Requirements:
•	The program should display text on the screen.
•	The Apple class's addPrice method should not display text on the screen.
•	The Apple class's applePrice variable must be a static int initialized to zero.
•	The main method should call the addPrice method only twice.
•	The Apple class's addPrice method should increase the cost of apples by the passed-in value.
 */
package MakeMoreEfficient;

/**
 *
 * @author Cam
 */
public class PriceOfApplesSolution {
public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple2 = new Apple();

        System.out.println("============================================================");
        System.out.println("In main method, calling apple.addPrice(50) ");
        apple.addPrice(50);
        System.out.println("\tMethod returned to main. apple.price now = " + apple.applePrice + " and apple2.applePrice = " + apple2.applePrice);
        System.out.println("============================================================");
        System.out.println("In main method, calling apple2.addPrice(100) ");
        apple2.addPrice(100);
        System.out.println("\tMethod returned to main. apple2.price now = " + apple2.applePrice + " and apple.applePrice = " + apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int appl) {   // <<<<<<< Changing that variable is all you needed to do.... 
            System.out.println("\tInside method addPrice() with argument :" + appl);
            System.out.println("\tAdding argument to current price of :" + applePrice);
            applePrice=applePrice+appl;
            System.out.println("\tapplePrice now : " + applePrice);
        }
    }
}    







// Helpful discussion https://codegym.cc/help/1733#discussion
// https://codegym.cc/help/1543

//Orignal Code Below
    /*     public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The cost of apples is " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            //write your code here
        }
    } */


