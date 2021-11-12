/*

Write a program that reads a string from the keyboard.
The program should change the first letter of each word to uppercase.
Display the result on the screen.

_____
Break each word into its own char array, and capitlize the first. The combined all the char arrays back into Strings


*/
package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cam
 */
public class Task_8_23 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] charArray = s.toCharArray();
        
        int i = 0;              
        for (char c : charArray)
        {
            if (c == ' ')
            {
                char cUpper = Character.toUpperCase(charArray[i+1]);
                charArray[i+1] = cUpper;
            }            
            i++;                         
        }
        
        char cUpper = Character.toUpperCase(charArray[0]); 
        charArray[0] = cUpper;           
        
      /*  for (char c : charArray)
        {
            System.out.println(c);
        } */
         
        String sUpper = new String(charArray);
        System.out.println(sUpper); 
    }  
        
}


/*public static void capitalize(char[] charArray)
    {                
        int i = 0;              
        for (char c : charArray)
        {
            if (c == ' ')
            {
                char cUpper = Character.toUpperCase(charArray[i+1]);
                charArray[i+1] = cUpper;
            }            
            i++;                         
        }
        
        char cUpper = Character.toUpperCase(charArray[0]); 
        charArray[0] = cUpper;               
    } */