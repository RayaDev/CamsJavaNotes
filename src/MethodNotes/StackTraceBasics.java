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
public class StackTraceBasics {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void getStackTraceDepth() {
        
        //Stack Trace race is an Array!
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        
        int stackDepth = Thread.currentThread().getStackTrace().length;
        for (StackTraceElement s : Thread.currentThread().getStackTrace()) //Object s also works, but more specific is better
        {
            System.out.println(s);
        } 
        System.out.println("Depth of stack: " + stackDepth);
        
    }   

    public static void method1()
    {
        method2();
    }
    
    public static void method2()
    {
        method3();
    }
    
    public static void method3()
    {
        method4();
        //method2(); Cuases a "method loop" cuasing a stack overflow error. 
    }
    
    public static void method4()
    {
       getStackTraceDepth(); 
    }
}
