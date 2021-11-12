/*
Write five methods that call each other.
Each method should return the line number of the code from which it was called.
Use the element.getLineNumber() method.

 */
package Level9;

/**
 *
 * @author Cam
 */
public class WhoCalledMe {
    public static void main(String[] args) throws Exception 
    {
        method1();
    }

    public static int method1() 
    {
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        //System.out.println(lineNumber);
        
        method2();
        return  lineNumber;
    }

    public static int method2() 
    {
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        //System.out.println(lineNumber);
        
        method3();
        return  lineNumber;
    }

    public static int method3() 
    {
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        //System.out.println(lineNumber);
        
        
        method4();
        return  lineNumber;
    }

    public static int method4() 
    {
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        //System.out.println(lineNumber);
        
        
        method5();
        return  lineNumber;
    }

    public static int method5() {
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        //System.out.println(lineNumber);
        
        return  lineNumber;
    }    
}
