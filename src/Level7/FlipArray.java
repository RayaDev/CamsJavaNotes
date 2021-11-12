/*
1. Create an array of 10 numbers.
2. Enter 10 numbers from the keyboard and write them to the array.
3. Display the elements of the array in reverse order. Display each value on a new line.
 */
package Level7;

import java.util.Scanner;

public class FlipArray {

private static final int array1[] = new int[10];
    
    public static void main(String[] args) throws Exception 
    {
        Input();
        Output();       
    }   
    
    private static void Input()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++)
        {
            int num = sc.nextInt();
            array1[i] = num;
        }
    }
    
    private static void Output()
    {
        for (int i = array1.length-1; i >= 0; i--)
        {
           System.out.println(array1[i]);
        }
    }
}
