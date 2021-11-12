/*
Use the keyboard to enter three integers. Determine whether there is at least one pair of equal numbers among them.
If such a pair exists, display the numbers separated by a space.
If all three numbers are equal, then display all three.
Here are some examples:
a) if you enter the numbers
1
2
2
then we display
2 2

b) if you enter the numbers
2
2
2
then we display
2 2 2

Requirements:
•	The program should read the numbers from the keyboard.
•	The program should contain System.out.println() or System.out.print().
•	If two numbers are equal to each other, you must display them on the screen.
•	If all three numbers are equal, then display all three.
•	If there are no equal numbers, don't display anything.
 */
package Level4;

import java.io.*;
public class DoWeHaveAPair {
        
    public static void main(String[] args) throws IOException  
    { 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String a = reader.readLine(); 
        int a1 = Integer.parseInt(a);
       
        String b = reader.readLine(); 
        int b1 = Integer.parseInt(b);
        
        String c = reader.readLine(); 
        int c1 = Integer.parseInt(c);
        
        IsPair(a1,b1,c1);
    }
    public static void IsPair(int a, int b, int c) {
        
        if ( a == b && b == c) {
            System.out.print(a);
            System.out.print(" " + b);
            System.out.print(" " + c);
        }
         else if (a== b) {
            System.out.print(a);
            System.out.print(" " + b); }
         
        
         else if (a == c) {
             System.out.print(a);
            System.out.print(" " + c); 
        }
        
         else if (b == c ) {
            System.out.print(b);
            System.out.print(" " + c);
        }
    }       
}

