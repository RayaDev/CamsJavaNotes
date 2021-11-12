/*
The program reads the name of the month from the keyboard and then displays its number on the screen in a phrase like:
"May is month 5".
Use collections.
 */
package Level8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Create a hashSet with every month(Uppercase) and a number (key:value)
User input as a stting. Parse to upperCase.
Check against HashSet and then output. 
 */
public class Task_8_28 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> s = new ArrayList<>();
        s.add("January");
        s.add("February");
        s.add("March");
        s.add("April");
        s.add("May");
        s.add("June");
        s.add("July");
        s.add("August");
        s.add("September");
        s.add("October");
        s.add("November");
        s.add("December");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = s.indexOf(input);
        index += 1;
        
        System.out.println(input + " is month " + index);       
              
    }   
}
