/*
Use the keyboard to enter three numbers, and then display the middle number.
In other words, not the largest and not the smallest.
If all the numbers are equal, display any one of them.
 */
package MakeMoreEfficient;


import java.io.IOException;
import java.util.Scanner;

public class SomeHowAverage{
        

    public static void main(String[] args) throws IOException  {
            Scanner sc = new Scanner(System.in); 
            int [] array1 = new int[3];
            for(int i = 0; i<3; i++) {
                int number = sc.nextInt(); 
                    array1 [i] = number;
                
            }
            //Find the min, find the max, print the middle
            int max1 = max(array1);
            int min1 = min(array1);
            int mid = 0;
            for (int i=0; i< array1.length; i++) {
                if (array1[i] <= max1 && min1 != array1[i]) {
                    mid = array1[i]; 
                }   
                         
            }

            
            if (mid == max1) {
                
                System.out.println(mid);
            }
            else if (max1 == min1) { //test for all three
                System.out.println(max1);
            }
            else if (mid != max1 && mid != min1) { 
                System.out.println(mid);
            }                   
       }
       
        public static int max(int [] array) {
            int max = 0;
            int i;
            for(i=0; i<array.length; i++ ) {
                if(array[i]>max) {
                max = array[i];
                }
        }
            return max;
          
    }
        public static int min(int [] array) {
            int min = array[0];
   
            for(int i = 0; i<array.length; i++ ) {
                if(array[i]<min) {
                 min = array[i];
                }
             }
            return min;
        }
}