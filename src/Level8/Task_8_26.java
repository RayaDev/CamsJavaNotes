/*
Create an array of 20 numbers.
Populate it with numbers from the keyboard.
Display the five largest numbers.
Each value should be on a new line.

 */
package Level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cam
 */
public class Task_8_26 {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] a) //performs the sort operation on the array, no need to return a new array. 
    {
        boolean sorted = false;        
        int temp;
        
        while(!sorted) 
        {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) 
            {
                if (a[i] < a[i+1]) //Swap the < operator for sorting highest to lowest or vice versa
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }  
    
}
