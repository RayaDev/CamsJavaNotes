/*
Use the keyboard to enter a number.
If the number is positive, then double it.
If the number is negative, add one.
If the entered number is zero, display zero.
Display the result on the screen.

Requirements:
•	The program should read a number from the keyboard.
•	The program must display a number on the screen.
•	If the entered number is positive, double it and display the result.
•	If the entered number is negative, increase it by one and display the result.
•	If the entered number is zero, display zero.

 */
package Level4;

import java.io.*;

public class PositiveAndNegative {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
      String number = reader.readLine();
      int number1 = Integer.parseInt(number);
      
      if (number1 > 0){
        number1 = number1 *2;
      }
      if (number1 < 0) {
        number1 = number1 + 1;     
      }
      else if (number1 == 0) {
          number1 = number1;
      }
      System.out.println(number1);
    }    
}