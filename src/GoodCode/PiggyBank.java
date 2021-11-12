/*
Use the keyboard to enter numbers and calculate their sum until the user enters the word "sum".
Display the resulting sum on the screen.

Hint: to read from the keyboard until the string 'exit' is input, do this:
 */
package GoodCode;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class PiggyBank {
    
    public static boolean run = true;
    public static int sum = 0;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException  
    {
             
        sum1();
            
    }
    
    public static void sum1 ()
    {      
            while (run == true) {
                String s = sc.nextLine();
                           
                if (s.equals("exit")) 
                {
                    break;
               
                }
                if (s.equals("sum")) 
                {
                    System.out.println(sum);
                    sum = 0;
                }
                else 
                {
                    int num = Integer.parseInt(s);
                    sum = sum + num;
                }             
            }       
    }  
}
