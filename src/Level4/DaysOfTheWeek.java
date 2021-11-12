/*
Use the keyboard to enter a number representing a day of the week. Then, depending on the entered number, display the name of the day of the week: "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", if you enter a number greater than 7 or less than 1, display "No such day of the week".

Example for number 5:
Friday

Example for number 10:
No such day of the week

Requirements:
•	The program should read a number from the keyboard.
•	The program should display text on the screen.
•	If you enter a number from 1 to 7, you need to display the name of the day of the week.
•	If you enter a number outside the range of 1 to 7, then display a notification that there is no such day of the week.
 */
package Level4;
import java.io.*;



public class DaysOfTheWeek {
    
    public static String[] Days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String day = reader.readLine();    
        int day1 = Integer.parseInt(day)-1;
        
        if (day1 < 0 | day1 > 6) {
        System.out.println("No such day of the week");        
        }
        else {
        System.out.println(Days[day1]);     
        }
    }
}

// Used HashMap<Integer, String>... What is a Hashmap?
