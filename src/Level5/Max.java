/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level5;

import java.io.*;
import java.util.Scanner;
/* 
Task about algorithms

*/

public class Max {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      //System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      
      //System.out.println("Enter the elements of the array ::");
      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
     
     
     
   
        int max = myArray[0];

        for(int i=0; i<myArray.length; i++ ) {
            if(myArray[i]>max) {
            max = myArray[i];
            }
        
        }
        
        System.out.println(max);
   }
} 

