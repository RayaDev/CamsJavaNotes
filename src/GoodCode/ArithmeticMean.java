/*
Use the keyboard to enter numbers, and then calculate the arithmetic mean.
If the user enters -1, display the arithmetic mean of all entered numbers and end the program.
-1 should not be included in the calculation.
 */
package GoodCode;

import java.io.IOException;
import java.util.Scanner;


public class ArithmeticMean {
   public static void main(String[] args) throws IOException  {
            Scanner sc = new Scanner(System.in); 
                     
            int run = 1;
            double sum = 0; 
            int count = 0;
            double mean;
            while (run==1) {
                
                int num1 = sc.nextInt();
                count = count + 1;
                sum = sum + num1;
                if (num1 == -1) {
                    run = 0;
                    sum = sum + 1;
                    count = count -1;
                    mean = sum / count;
                   //System.out.println(sum);
                   //System.out.println(count);
                   System.out.println(mean);
                   
                }
                else {
                    run = 1;
                }
            }
       }
}
