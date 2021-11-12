/*
1. Create an array of 20 numbers.
2. Populate it with values ​​from the keyboard.
3. Create two arrays of 10 numbers each.
4. Copy the large array into the two small ones: half the numbers into the first small array, and the second half into the second small array.
5. Display the second small array, each value on a new line.
 */

package Level7;

import java.util.Scanner;
import java.util.Random;

public class OneLargeOneSmall {

private static int array20[] = new int[20];
private static int array1[] = new int[10];
private static int array2[] = new int[10];
    
    public static void main(String[] args) throws Exception 
    {
        Input();
        SplitArray();
        Output();
    }
    
    private static void Input()
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
       
        for(int i = 0; i < array20.length; i++)
        {
            int num = sc.nextInt();
            //int n = rand.nextInt();
            array20[i] = num;
        }
    }
    
    private static void SplitArray()
    {
        for (int i = 0; i <= 9; i++)
        {
            array1[i] = array20[i];
        }
        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = array20[i+10];
        }
    }
    private static void Output()
    {
        for(int i = 0; i < array2.length; i++)
        {
            System.out.println(array2[i]);
        }
    }    
}
