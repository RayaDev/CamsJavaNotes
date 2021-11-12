/*
Add a public static int convertToSeconds(int hour) method that converts hours to seconds.
Call it twice in the main method with any arguments.
Display the results, each time on a new line.

Requirements:
•	Add the convertToSeconds method. It must be public static, and take and return ints.
•	The convertToSeconds method must convert the passed number of hours to seconds.
•	The main method must call the convertToSeconds method twice.
•	The main method should display the result of the calls, each time on a new line.
•	The convertToSeconds method should not display anything.

 */
package Level3;

//Simplifed code by running method insde println
public class TimeConversion {
  public static void main(String[] args) {
        int hour1 = 6, hour2 = 8;
        //int Seconds = convertToSeconds(hour1);
        //System.out.println(Seconds);
        System.out.println(convertToSeconds(hour1));
        
        //int Seconds2 = convertToSeconds(hour2);
        //System.out.println(Seconds2);
        System.out.println(convertToSeconds(hour2));
        
    }
    
    public static int convertToSeconds(int hour) { 
        int seconds = hour * 60 * 60;
        return seconds;
    }
    
}
