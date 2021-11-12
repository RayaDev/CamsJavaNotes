/*
Use the keyboard to enter three integers. Display the number of positive numbers and the number of negative numbers in the original set, in the following form:
"Number of negative numbers: a" and "Number of positive numbers: b", where a and b are the unknowns.
 */
package Level4;

import java.util.Scanner;


public class PositiveAndNeg {
    public static int[]array1; 

    public static void main(String[] args) throws Exception {
        array1 = new int[3];
        Scanner sc = new Scanner(System.in); 
    
        for(int i=0; i<array1.length; i++) { //Prompt as many times as the array size
        array1[i] = sc.nextInt();  
        }
        FindPositive(array1);
    
    } 
    public static void FindPositive (int [] array) {
        int negcount= 0;
        int poscount = 0;
        for(int i = 0; i < array.length; i ++) {
            if (array[i] > 0){
               int a = poscount ++; 
                }
            else if (array[i] < 0) {
                int b = negcount++;
                }
        }
        System.out.println("Number of negative numbers: " + negcount);
        System.out.println("Number of positive numbers: " + poscount);
    }
}
