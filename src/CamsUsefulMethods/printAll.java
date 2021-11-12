/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CamsUsefulMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cam
 */
public class printAll {
   
    public static void printP(Object obj) //Prints primatives, Strings int, ect.
    {
        System.out.println(obj);
    }
       
    public static void printLM(Object obj) //ArrayList or HashMap
    {
        
       // System.out.println(obj.getClass().toString());
        
        if(obj instanceof HashMap)
        {
            //System.out.println("HashMap found.");
            HashMap<Object, Object> testMap = (HashMap)obj;                    
            for(Map.Entry<Object, Object> pair : testMap.entrySet())
            {
                Object k = pair.getKey();
                Object v = pair.getValue();
                System.out.println("Key: " + k + ", Value: " + v);                  
            }   
        }    
        
        else if (obj instanceof ArrayList)
        {
            //System.out.println("ArrayList found");
            ArrayList<Object> testList = (ArrayList)obj;
            
            for(Object o : testList)
            {
                System.out.println(o);
            }
            
        }
        
        /*else if (obj instanceof Object[])
        {
            //System.out.println("Object[] found");         
            Object[] testArray = (Object[]) obj;
            
            for(int i = 0; i < testArray.length; i++)
            {
               System.out.println(testArray[i]);
            }
        }*/
        
    }

    public static void printST (Thread t) //Prints stack trace. 
    {
       
        //Stack Trace race is an Array!
        StackTraceElement[] trace = t.currentThread().getStackTrace();
        
        int stackDepth = t.currentThread().getStackTrace().length;
        for (StackTraceElement s : trace) //Object s also works, but more specific is better
        {
            System.out.println(s);
        } 
        System.out.println("Depth of stack: " + stackDepth);
        
    }   
    
    
    
  
}
