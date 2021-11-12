/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level12;

/**
 *
 * @author Cam
 */
public class ThreeMinMethods {
    public static void main(String[] args) 
    {

    }
    
    public static int min(int a, int b)
    {
        
        int min;
        if (a <  b)
        {
            min = a;
            return a;
        }
        
        else 
        {
           min = b;
           return min;
        }
        
    }
            
    public static double min(double a, double b)
    {
        
        double min;
        if (a <  b)
        {
            min = a;
            return a;
        }
        
        else 
        {
           min = b;
           return min;
        }
    }
    
    public static long min(long a, long b)
    {
        
        
        long min;
        if (a <  b)
        {
            min = a;
            return a;
        }
        
        else 
        {
           min = b;
           return min;
        }
    }
}
