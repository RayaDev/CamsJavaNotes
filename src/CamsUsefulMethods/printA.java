/*

Bunch of methods for printing all diffrent types of arrays[]. 

 */
package CamsUsefulMethods;

import static CamsUsefulMethods.printAll.printP;

/**
 *
 * @author Cam
 */
public class printA {
    
  
    public static void printA(int[] a) //Prints a basic array
    {
       for(int i = 0; i < a.length; i++)
       {
           printP(a[i]);
       }
    }     
    
     public static void printA(String[] a) //Prints a basic array
    {
       for(int i = 0; i < a.length; i++)
       {
           printP(a[i]);
       }
    }     
    
    public static void printA(char[] a) //Prints a basic array
    {
       for(int i = 0; i < a.length; i++)
       {
           printP(a[i]);
       }
    }     
    
    public static void printA(double[] a)
    {
       for(int i = 0; i < a.length; i++)
       {
           printP(a[i]);
       }
    }
    
    public static void printA(long[] a)
    {
       for(int i = 0; i < a.length; i++)
       {
           printP(a[i]);
       }
    }
}
