/*
1. In the initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Read 20 numbers from the console and put them into the array
2. The max(int[] array) method must find the maximum of the array elements
 */
package Level7;


import java.io.IOException;

import java.util.Scanner;
import java.util.Random;

public class MaxArray {
     public static void main(String[] args) throws Exception {
          Scanner sc = new Scanner(System.in); 
         
        System.out.println("How many numbers do you want to compare? ");
        int n1 = sc.nextInt();
        int array[] = new int[n1];
        
        int[] array1 = initializeArray(array);
        int max = max(array1);
        System.out.println("The max is " + max);
        System.out.println("    ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(i+1 + "  " + array[i]);
        } 
    }

    public static int[] initializeArray(int array1[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("How big do you want the range to be? ");
        int r = sc.nextInt();
        
        for (int i = 0; i <array1.length; i++)
        {
            //int n = sc.nextInt();
            int n = rand.nextInt(r);
            array1[i] = n;
           
        }
        System.out.println("The array length is " + array1.length);
        return array1;
    }

    public static int max(int[] array) {
        
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
}    

