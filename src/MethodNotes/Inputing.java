/*
 Write code that calculates how many seconds have passed since 3:00 PM when the clock says it's 3:30 PM. Display the result.

Requirements:
•	The program should output text.
•	The displayed text should be a positive integer.
•	The displayed number must be a multiple of 60.
•	The displayed number must match the task conditions.
 */
package MethodNotes;

import java.io.*;

public class Inputing{
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many minutues since 3:00PM");
        String minutes = reader.readLine();
        int minutes1 = Integer.parseInt(minutes);
        int seconds1 = (calcseconds(minutes1));
        String seconds2 = Integer.toString(seconds1);
        System.out.println("It is now 3:30PM. There has been " + seconds1 + " since 3:00PM"); //Cool idea to make 3:30 in a changing variable
}
  
      
   public static int calcseconds(int minutes1) { 
        int seconds = minutes1 * 60;
        return seconds;

}
    
}
