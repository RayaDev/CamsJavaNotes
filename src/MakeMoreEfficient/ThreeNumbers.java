/*
Look into the index method!!!
 */
package MakeMoreEfficient;

import java.io.*;

public class ThreeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String num = reader.readLine();
        int number1 = Integer.parseInt(num);
        
        String num2 = reader.readLine(); 
        int number2 = Integer.parseInt(num2);
        
        String num4 = reader.readLine(); 
        int number3 = Integer.parseInt(num4);
        
        
        
        if (number1 == number2 && number3 != number1 && number3 != number2){
            System.out.println(3);
        }
        if (number3 == number1 && number2 != number3 && number2 != number1){
            System.out.println(2);
        }
        if (number2 == number3 && number1 != number2 && number1 != number3) {
            System.out.println(1);
        }
        
        //Index Method???
        
        
       // int Array1[] = {number1,number2,number3};
        
      /*  for (int i = 0; i < Array1.length - 1; i++) {
           if (Array1[i] == Array1[i+1]) {
               System.out.println(i);
               System.out.println(i+1);
               
               //Tests which ones are equal only from left to right
           }
           else if (Array1[2] == Array1[0]) {
               System.out.println(1);
           }
        } */
        
    
    }
}