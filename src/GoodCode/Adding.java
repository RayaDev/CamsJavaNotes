/*
Nice, simple, and compact. 
Adds numbers untill you enter -1. 

 */
package GoodCode;

import java.io.IOException;
import java.util.Scanner;

public class Adding {
     public static void main(String[] args) throws IOException  {
            Scanner sc = new Scanner(System.in); 
                     
            int run = 1;
            int sum = 0; 
            while (run==1) {
                
                int num1 = sc.nextInt();
                sum = sum + num1;
                if (num1 == -1) {
                    run = 0;
                    System.out.println(sum);
                }
                else {
                    run = 1;
                }
            }
       }
}
