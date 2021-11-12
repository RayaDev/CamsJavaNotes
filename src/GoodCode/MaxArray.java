/*
1. In the initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Read 20 numbers from the console and put them into the array
2. The max(int[] array) method must find the maximum of the array elements
 

Just keep adding functionality.
Next calc how far the max is from the upper limit of the range,
and the same thing for the min.

The standard deviation..

and and.. 

The probablity of the max landing with in one standard deviation of the upper limit, 
given largest enough sample size of numbers.

*/
package GoodCode;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class MaxArray {
       
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in); 
         
        System.out.println("How many numbers do you want to compare? ");
        System.out.println("Note: Zero is included.");
        int n1 = sc.nextInt();
        int array[] = new int[n1];
        int[] array1 = initializeArray(array); //I'd like to make this a class level variable, so that i don't have to keep passing it.
        
        int max = max(array1);        
        System.out.println("The max is " + max);
        
        for (int i1 = 0; i1 < array.length; i1++) //This runs back through the array though.. not very efficient! 
        {
            if (array[i1] == max)
            {
                System.out.println("The max occured at element " + i1);
            }
        }
        System.out.println("  ");
                
        int min = min(array1);
        System.out.println("The min is " + min);
        
        for (int i1 = 0; i1 < array.length; i1++) //This runs back through the array though.. not very efficient! 
        {
            if (array[i1] == min)
            {
                System.out.println("The min occured at element " + i1);
            }
        }
        System.out.println("  ");
       

     /*  for (int i = 0; i < array.length; i++) //The print is what really slows it down. 
        {
            System.out.println(i+1 + "  " + array[i]);
        }  */

    }

    public static int[] initializeArray(int array1[]) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("How big do you want the range to be? ");
        System.out.println("Note: Zero is included in the range. So for a range of 10, enter 11. ");
        int r = sc.nextInt();
        
        for (int i = 0; i <array1.length; i++)
        {
            //int n = sc.nextInt();
            int n = rand.nextInt(r);
            array1[i] = n;
           
        }
        
        return array1;
    }

    public static int max(int[] array) 
    {        
        int max = array[0];
        
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max )
            {
               max = array[i] ;      
            }
                  
        }
        return max;
    }
        
    public static int min(int[] array) 
    {        
        int min = array[0];
        
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min )
            {
               min = array[i] ;      
            }
        }
        return min;
    }   
}    

