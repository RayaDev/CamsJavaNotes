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
public class LoggingStackTraces {
    public static void main(String[] args) 
    {
       log("In main method");
    }

    public static void log(String s) 
    {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()+": "+Thread.currentThread().getStackTrace()[2].getMethodName()+": "+s);
    }    
}
