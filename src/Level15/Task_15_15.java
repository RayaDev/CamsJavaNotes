/*  
COMPLETED! Not super sure what the point is here.. why excute funtions outside the main? 
Atleast practice using BufferedReader more. 


Static modifiers: part 2

1. In a static block, read two int variables A and B from the console.
2. Don't forget about the IOException that must be handled in the catch block.
3. Close the input stream with the close() method.

Requirements:
•	Field A must be public and static.
•	Field B must be public and static.
•	The program should read data from the keyboard in a static block.
•	The program must initialize the fields A and B in a static block using the values entered from the keyboard.
•	The program should display the minimum of the values ​​entered from the keyboard.


 */
package Level15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cam
 */
public class Task_15_15 {
    public static int A;
    public static int B;

    public static final int MIN = min(A,B);
    
    static 
    {   
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(br.readLine());
            B = Integer.parseInt(br.readLine());       
           
        } 
        catch (Exception ex) 
        {
           System.out.println(ex);
        }
    }
    
 
    
   public static void main(String[] args) {
        System.out.println(min(A,B));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
