/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.io.IOException;
import java.util.Scanner;


public class ArrayPrimativeInput {

public static int[] Array1 = new int[5]; //Array's have to be intialized.. 

  public static void main(String[] args) throws IOException 
    {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         Array1[0] = num;
           
         System.out.println(Array1[0]);
         
         //Remembers, no matter what they contain, arrays are fixed in size when they are declared. 
         int[] test = {1,2,3,4,5};
         String[] sTest = {"test","test","test"};
         Box[] boxTest = {new Box(1), new Box(2), new Box(3)};
         
    }
  
  public static class Box {
      
      int size;
      
      Box(int size)
      {
         this.size = size; 
      }
      
  }
  
  
}
