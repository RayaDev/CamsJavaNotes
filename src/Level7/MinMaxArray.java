/*
Create an array of 20 numbers.
Populate it with numbers from the keyboard.
Find the maximum and minimum numbers in the array.
Display the maximum and minimum numbers, separated by a space.
 */
package Level7;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class MinMaxArray {
    public static void main(String[] args) throws IOException 
    {
        
        int[] array1 = new int [20];
        array1 = Input(array1);
        int max1 = Max(array1);
        int min1 = Min(array1);
       // System.out.println(max1);
       // System.out.println(min1);
        System.out.print(max1 + " " + min1);
    
    }
    
    public static int[] Input(int [] array)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        for (int i = 0; i < array.length; i++)
        {
            //int num = r.nextInt(50);
            int num = sc.nextInt();
            array[i] = num;
        }
            return array;    
    }
    
    public static int Max(int [] array)
    {
        int max = array[0];
        
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        
        return max; 
    }
    
    public static int Min(int [] array)
    {
         int min = array[0];
         
         for (int i =0; i <array.length; i++)
         {
             if (min > array[i])
             {
                 min = array[i];
             }
         }
               
        return min; 
    }
        
}
    

