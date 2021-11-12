/*
Consider this example:
The getFeetFromInches method is called with the argument 243.

Example output:
20

Requirements:
•	The getFeetFromInches(int) method must be public and static.
•	The getFeetFromInches method must return an int.
•	The getFeetFromInches method should not display anything.
•	The getFeetFromInches method must correctly return the number of full feet represented by the variable inches.
 */
package Level3;

import java.io.*;

public class GetFeetFromInches {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String inches = reader.readLine();
        int inches1 = Integer.parseInt(inches);
        System.out.println(calcfeet(inches1));
            
    }
       public static int calcfeet(int inches2) { 
        int feet = inches2 / 12;
        return feet;
    }  
}

