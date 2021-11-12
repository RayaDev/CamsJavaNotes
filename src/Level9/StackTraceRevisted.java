/*
Write five methods that call each other.
Each method should return the name of the method that called it. Use the stack trace to obtain this information.

Requirements:

 */
package Level9;

/**
 *
 * @author Cam
 */
public class StackTraceRevisted {
 public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();//write your code here
    }
}
