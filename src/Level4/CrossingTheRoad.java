/*
The pedestrian traffic light is programmed as follows:
at the beginning of each hour, the green signal is on for three minutes,
then the signal is yellow for one minute,
and then it is red for one minute.
Then the light is green again for three minutes, etc.
Use the keyboard to enter a real number t that represents the number of minutes that have elapsed since the beginning of the hour.
Determine what color the traffic light is at the specified time.
Display the result as follows:
"green" if the light is green,
"yellow" if the light is yellow, and
"red" if the light is red.

Example for 2.5:
green
Example for 3:
yellow
Example for 4:
red
Example for 5:
green

Requirements:
•	The program should read a real number from the keyboard.
•	The program should display text on the screen.
•	If the light is green, display: "green"
•	If the light is yellow, display: "yellow
•	If the light is red, display: "red"
 */
package Level4;

import java.io.*;

public class CrossingTheRoad {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String time = reader.readLine(); 
        double time1 = Double.parseDouble(time);  //Converts a string into a double       
        double digits = getDigits(time1);
       // System.out.println(digits);
       // double color = lightcolor(digits);
        //System.out.print(color);
     
    }
    
    public static double lightcolor(double a) { //Lets say you could seperate out the last two digits of the minutes
        if (a >= 0 && a < 3 || a == 5) {         //So 
            System.out.println("green");}
        if (a >= 3 && a < 4 ) {
            System.out.println("yellow");
        }
        if (a >= 4 && a < 5) {
            System.out.println ("red");
        }
        return a;       
    }
    public static double getDigits(double a) {
        double divide = a / 10;
        String test = Double.toString(divide);
        String[] convert = test.split("\\.");

        int a1 = Integer.parseInt(convert[0]);
        int b1 = Integer.parseInt(convert[1]);

         System.out.println(a1); // 13454
          System.out.println(b1); // 92345
        int c = String.valueOf(b1).length();  //Get number digits of an integer by converting to a string..Might not be the most efficent
       // System.out.println(c);
        //Now we need to loop .10 to the power of the of c
        double d = .10;
        for(int i=1;i<= c-2;i++){  
       // System.out.println(i);
            d = d * .10;
        }
       // System.out.println(d);
        double e = b1 * d;
       // System.out.println(e);
        return e;
    }
}

// Went down the rabithole with this one. Sometimes thats not the best way to do things. 