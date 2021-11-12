/*
Yupp making shit complicated lol
 */
package MakeMoreEfficient;

import java.util.Scanner;


public class SortThree_1 {
          
    public static void main (String [] args) {
         Scanner sc = new Scanner(System.in); 
        // System.out.println("How many numbers do you want to add to the array?");
        // int number = sc.nextInt();
         int[] array1 = new int[3];
         //System.out.println("Input " + number + " numbers");
         
         for(int i=0; i<array1.length; i++) { //Prompt as many times as the array size
         array1[i] = sc.nextInt();
         }
         
         // Print all the array elements
        for (int i = 0; i < array1.length; i++) {
         //System.out.println("The number is spot " + i + " is " + array1[i] + " ");
        }  
        SortArray(array1);
    }


    public static void SortArray(int [] array) {
   
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] > array [j - 1]) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                 }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
