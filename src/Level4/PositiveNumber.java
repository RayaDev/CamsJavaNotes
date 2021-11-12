/*
Use the keyboard to enter three integers. Display the number of positive numbers in the original set.
 */
package Level4;

import java.util.Scanner;

public class PositiveNumber {
    
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
        int poscount = 0;
        for(int i = 0; i < array.length; i ++) {
            if (array[i] > 0){
                poscount ++; 
                }
        }
        System.out.println(poscount);
    }
}
    
