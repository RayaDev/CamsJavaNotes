/*
1. Create an array of 10 strings.
2. Enter 8 strings from the keyboard and save them in the array.
3. Display the contents of the entire array (10 elements) on the screen in reverse order. Each element on a new line.
 */
package Level7;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class StringArrayReverse {
    
static String[] array1 = new String[10];  

    
    public static void main(String[] args) throws Exception 
    {
        array1[9] = "Cam";
        array1[8] = "Ryan";
        
        ArrayInput();
        //ArrayOutput();
        ArrayOutput1();        
               
    }  
    private static void ArrayInput()
    {
        Scanner sc =  new Scanner(System.in);
               
        for (int i = 0; i < 8; i ++)
        {
            String string1 = sc.nextLine();
            array1[i] = string1;
        }
    }
    private static void ArrayOutput()
    {
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
    }
    private static void ArrayOutput1()
    {
        for (int i = array1.length-1; i >= 0; i--)
        {
            System.out.println(array1[i]);
        }
    }
}
