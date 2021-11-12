/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeMoreEfficient;

import java.io.IOException;
import java.util.Scanner;

public class SomeHowAverage2 {
        public static void main(String[] args) throws IOException  {
            Scanner sc = new Scanner(System.in); 
            int num1 = sc.nextInt(); 
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
             
            if (num1 == num2 && num2 == num3) {
                System.out.println(num1);
            }
            else if (num1 ==  num2 || num1 ==  num3) {
                System.out.println(num1);
            }
            else if (num2 == num3 ) {
                System.out.println(num2);
            }
      
            
        if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
        System.out.print(num1);
            }
    //checking num2 is a middle number or not
    if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
        System.out.print(num2);
    }
    //checking num3 is a middle number or not
    if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
        System.out.print(num3);

        }
        
    }
}
