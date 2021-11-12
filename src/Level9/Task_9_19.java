/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level9;

/**
 *
 * @author Cam
 */
public class Task_9_19 {
    public static void main(String[] args) 
    {
        try 
        {
        divideByZero();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            
            /*StackTraceElement[] trace = Thread.currentThread().getStackTrace();
            for (StackTraceElement s : trace)
            {
               System.out.println(s); 
            } */
            
        }
    }   
    
    public static void divideByZero()
    {
        int x = 3;
        
        int z = x / 0;
        System.out.println(z);
        
    }
}
