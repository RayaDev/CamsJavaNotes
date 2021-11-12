/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.io.*;
import java.util.Scanner;

public class ArrayInputMethods {
    
     //Splitting an array
    public static void main(String[] args) throws IOException  {        
         
          InputArray();
        //InputArray2();
                
        //Buidling an array from stratch 
        int Array1[];
        Array1 = new int [20]; //Alocates memory
        Array1[1]=5;
        Array1[2]=6;
    }

    
    public static void InputArray() throws IOException {
         Scanner sc = new Scanner(System.in); 
         System.out.println("How many numbers do you want to add to the array?");
         int number = sc.nextInt();
         int[] array1 = new int[number];
         System.out.println("Input " + number + " numbers");
         
         for(int i=0; i<array1.length; i++) { //Prompt as many times as the array size
         array1[i] = sc.nextInt();
         }
         
         // Print all the array elements
        for (int i = 0; i < array1.length; i++) {
         System.out.println("The number is spot " + i + " is " + array1[i] + " ");
        }  
    }
    
    //Testing how much data it can handle. 
    public static void InputArray2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String var = reader.readLine(); 
        int var1 = Integer.parseInt(var);
        
        int[] array1 = new int[var1];
        System.out.println("Input " + var1 + " numbers");
         
        for(int i=0; i<array1.length; i++) { //Prompt as many times as the array size
            String var2 = reader.readLine(); 
            int var3 = Integer.parseInt(var2);  
      
            array1[i] = var3; 
        }
         
         // Print all the array elements
        for (int i = 0; i < array1.length; i++) {
        System.out.println("The number is spot " + i + " is " + array1[i] + " ");
        }  
    }
     
}




