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
public class Swap2 {
    
public static void main (String[] args)
  {
    int m = 5;
    int n = 6;

    System.out.println("M=" + m + " N=" + n);
    int a = m, b = n;
    
    System.out.println(a);
    System.out.println(b);

    //The code commented out did not swap the numerical values of m and n.
    //int c = a;
    //a = b;         
    //b = c;
    
    //But this code does. Is this the correct interpretation of the lesson? 
    m = b;
    n = a;
    
    System.out.println("M=" + m + " N=" + n);
  }
}
