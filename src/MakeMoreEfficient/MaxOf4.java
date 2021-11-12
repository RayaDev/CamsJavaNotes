/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeMoreEfficient;


import java.util.Scanner;

public class MaxOf4 {
    
    public static int[]array1; 
    
    public static void main(String[] args) throws Exception {  
     
        array1 = new int[4];
        System.out.println("Enter 4 numbers");
        Scanner sc = new Scanner(System.in); 
    
        for(int i=0; i<array1.length; i++) { //Prompt as many times as the array size
        array1[i] = sc.nextInt();
        }
        System.out.println("The max number is");
        System.out.println(FindMax(array1));
    }    
     
        public static int FindMax(int [] array){   //Should be a better way than.. (That takes into account negatives. there's gotta be. 
            
            int max = array [0];
            
            for (int i = 0; i <array.length; i++ ) { //tah dah! The for loop.. 
                if (max > array[i]) {
                    max = max;
                }
                else {
                    max = array[i];
                }
            }
            
                return max;
            /*if (array [0] > array[1]) {
                max = max;
            }
            else {
                max = array[1];
            }
            if (max > array[2]) {
                max = max;
            }
            else {
                max = array[2];
            }
            if (max > array[3]){
                max = max;
            }
            else {
                max = array[3];
            } */
            
           
        } 
}

    

