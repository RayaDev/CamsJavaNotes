/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;



public class ArrayMethods1 {
 
//public static int [] array1; //static array varaible 
    
    public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) {max = myList[i];}
      }
      System.out.println("Max is " + max);  
      
      //Allocating memory to an array
      
      
      int array1 []={1,2,3,4,5,6,7}; //Initialzing an array
      
      //Buidling an array from stratch 
      int Array1[];
      Array1 = new int [20];
      Array1[1]=5;
      Array1[2]=6;
      
      
   }
    
        public static void SplitArray () {
        double d = 13454.92345;
        String bob = Double.toString(d);
        String[] convert = bob.split("\\.");

         int a = Integer.parseInt(convert[0]);
         int b = Integer.parseInt(convert[1]);
        System.out.println(a); // 13454
        System.out.println(b); // 92345
    }
}
