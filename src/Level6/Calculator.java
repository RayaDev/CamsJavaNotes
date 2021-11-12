/*
Make a Calculator class, which will have 5 static methods:
int plus(int a, int b) - returns the sum of a and b
int minus(int a, int b) - returns the difference between a and b
int multiply(int a, int b) - returns the product of a and b
double divide(int a, int b) - returns the result of dividing a by b
double percent(int a, int b) - returns b percent of the number a
 */
package Level6;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Calculator {
    public static int plus(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int minus(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    public static double divide(int a, int b) {
        double a1 =Double.valueOf(a);
        double b1 =Double.valueOf(b);
        double c = (a1 / b1);
        return c;
    }

    public static double percent(int a, int b) {
        double a1 =Double.valueOf(a);
        double b1 =Double.valueOf(b);
        double c = ((double)b / 100) * a;
        return c;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt(); 
         int b = sc.nextInt(); 
         System.out.println(divide(a, b));
         System.out.println(percent(a, b));
         //This would be a great one for 
         
    }    
}
