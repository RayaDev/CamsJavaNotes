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
public class RunningAStackTrace {
public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] num2 = Thread.currentThread().getStackTrace();
        return num2;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] num2 = Thread.currentThread().getStackTrace();
        return num2;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] num2 = Thread.currentThread().getStackTrace();
        return num2;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] num2 = Thread.currentThread().getStackTrace();
        return num2;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] num2 = Thread.currentThread().getStackTrace();
        return num2;
    }    
}
