/*
1. Create an array of 10 strings.
2. Create an array of 10 numbers.
3. Enter 10 strings from the keyboard, and put them in an array of strings.
4. In each element of the number array, record the length of the string whose string array index coincides with the current index of the number array.

Display the contents of the number array, each value on a new line.
 */
package Level7;

import java.util.Scanner;



public class LonelyArrays {

private static final String s[] = new String[10]; //Final makes it so that this aspect of the variable can no longer be modified
private static final int slength[] = new int[10];
    
    public static void main(String[] args) throws Exception {
       
        sInput();
        sRead();
        Output();
        
    } 
    private static void sInput() //Making everything private means that only the class can call it. Best practice. 
    {
        for (int i = 0; i < s.length; i++)
        {
          Scanner sc = new Scanner(System.in);
          String string1 = sc.nextLine();
          s[i] = string1;
        }
    }
    private static void sRead()
    {
        for (int i = 0; i < slength.length; i++)
        {
            int input = s[i].length();
            slength[i] = input;
        }
    }
    private static void Output()
    {
        for (int i = 0; i < s.length; i++)
        {
            //System.out.println(s[i] + " " + slength[i]);
            System.out.println(slength[i]);
        }
    }
}
