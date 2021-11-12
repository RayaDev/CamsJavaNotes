/*

Enter the number and name from the keyboard. Display the following string:
<name> will take over the world in <number> years. Mwa-ha-ha!

Here's an example:
Kevin will take over the world in 8 years. Mwa-ha-ha!

The order in which the data is input matters a lot.

Requirements:
•	The program should output text.
•	The program must read data from the keyboard.
•	The displayed text must contain the entered name.
•	The displayed text must contain the entered number.
•	The displayed text must fully match the task conditions.
 */
package Level3;

import java.io.*;

public class PlansToConquerTheWorld {
    public static void main(String[] args) throws Exception {      
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
                   
        String name = reader.readLine();
        String time = reader.readLine();
        int time1 = Integer.parseInt(time);
        //String time = reader.readLine();
        //int salary1 = Integer.parseInt(salary);
        //int time1 = Integer.parseInt(time);
        
        System.out.println(name + " will take over the world in " + time1 + " years. Mwa-ha-ha!");
    }
}
