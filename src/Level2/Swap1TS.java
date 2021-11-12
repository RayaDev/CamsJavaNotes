/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

/**
 *
 * @author Cam
 */
public class Swap1TS {
   
  public static void main (String[] args)
  {
    int m = 5;
    int n = 6;

    System.out.println("M=" + m + " N=" + n);
    swap(m, n);
    
    System.out.println("M=" + m + " N=" + n);
  }

  private static void swap(int a, int b)
  {
    /* 
    int c = a;
    a = b;
    b = c;
    */
   a = 6;
   b = 5;   
  }
}
