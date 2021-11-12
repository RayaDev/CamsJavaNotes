/*
Task: Write a program that reads 20 numbers from the keyboard and displays them in decreasing order.

Requirements:

 */
package Level7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Cam
 */
public class DecreasingOrder1 {

    public static void main(String[] args) throws IOException 
    {
    int[] array = new int[20];
    
    array = Input(array);
    array = ReverseSort(array);
    PrintArray(array);

    }
    
    public static int[] Input (int[] array)
    {
        Scanner sc = new Scanner(System.in);
       // Random r = new Random();
        
        for (int i = 0; i < array.length; i++)
        {
            //int num = r.nextInt(50);
            int n = sc.nextInt();
            array[i] = n;
        }
        Arrays.sort(array);
        
        return array;
    }
    
    public static int[] ReverseSort(int [] array)
    {
        int[] array1 =  new int[20];
        int j = 0;
        for (int i = array.length-1; i >=0; i--)
        {
            
            int num = array[i];            
            array1[j] = num;
            j++;
                
            
        }
        
        return array1;
    }
    
    public static void PrintArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
}

