/*
 Use the keyboard to enter a year, and then determine the number of days in the year. Display the result as follows:
Number of days in the year: x
, where
x is 366 for a leap year, and
x is 365 for an ordinary year.

Hint:
A leap year is 366 days, but an ordinary year is 365 days.
1) if the year is evenly divisible by 400, then it is a leap year;
2) for other years, if the year is evenly divisible by 100, then it is a regular year;
3) for other years, if the year is evenly divisible by 4, then it is a leap year;
4) all remaining years are not leap years.
Thus, the years 1700, 1800, and 1900 are not leap years, since they are multiples of 100 but not 400.
The years 2100, 2200 and 2300 are not leap years.
 */
package Level4;

import java.io.*;

public class NumberOfDaysInAYear {
    public static void main(String[] args) throws IOException { 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String year = reader.readLine(); 
        int year1 = Integer.parseInt(year);
        int leapyear = leap1(year1);
        if (leapyear == 1) {
            int daynumber = 366;
            System.out.println("Number of days in the year: " + daynumber);
        }
        else {
            int daynumber = 365;
            System.out.println("Number of days in the year: " + daynumber);
        }
            
    }
    public static int leap1(int a){
        if (a % 400 == 0) {
            return 1; }
        
        if (a % 100 == 0) {
            return 0;} 
        
        if (a % 4 == 0) {
            return 1;} 
        
        else {
            return 0;}
        }
}
