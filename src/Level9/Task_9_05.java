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
public class Task_9_05 {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
       // System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        
        //Stack trace is an Array!
        int stackDepth = Thread.currentThread().getStackTrace().length;
       /* for (Object s : Thread.currentThread().getStackTrace())
        {
            System.out.println(s);
        } */
        System.out.println(stackDepth);
        return stackDepth;
    }    
}
