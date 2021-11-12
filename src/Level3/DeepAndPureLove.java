/*
 For example:
Kevin + Eva + Angelica = Pure love. Ooo la-la!

Requirements:
•	The program should output text.
•	The program must read data from the keyboard.
•	The displayed text must contain the entered name1.
•	The displayed text must contain the entered name2.
•	The displayed text must contain the entered name3.
•	The displayed text must fully match the task conditions.
 */
package Level3;

import java.io.*;

public class DeepAndPureLove {
    public static void main(String[] args) throws Exception {
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
    String name1 = reader.readLine();
    String name2 = reader.readLine();
    String name3= reader.readLine();
    
    System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love. Ooo la-la!");
}

}
