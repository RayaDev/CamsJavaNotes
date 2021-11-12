/*
Task: The program takes two numbers from the keyboard and displays the maximum using a phrase like "The max is 25".
 */
package Level6;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; */
import java.io.*;
public class MistakesOfYouth {
 

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max1 = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = a > b ? a : b; //Wtf is this??? 

        System.out.println(max1 + max);
    }
    
}

 /* Orignal Code


    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(max + max);
    }
*/