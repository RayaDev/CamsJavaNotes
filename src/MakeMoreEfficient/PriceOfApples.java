/*
Code this yourself to better understand. 
 */
package MakeMoreEfficient;

/**
 *
 * @author Cam
 */
public class PriceOfApples {
     public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The cost of apples is " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int appl) {
            applePrice = applePrice + appl;
        }
        }
}
