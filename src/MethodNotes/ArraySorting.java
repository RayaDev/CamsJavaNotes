/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class ArraySorting {
  public static void main (String [] args) {
   
       ManualSort();
  }
   public static void ManualSort() {  
   int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
   int temp;
   for (int i = 1; i < array.length; i++) {
    for (int j = i; j > 0; j--) {
     if (array[j] < array [j - 1]) {
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
   public static void JavaSort(){
       
       
   }
}

