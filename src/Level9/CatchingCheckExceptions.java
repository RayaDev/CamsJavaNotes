/*
In the handleExceptions method, handle all unchecked exceptions.
You need to use the printStack method to display the stack trace of each exception that occurs.
You can only use one try-catch block.
 */
package Level9;

/**
 *
 * @author Cam
 */
public class CatchingCheckExceptions {
    public static void main(String[] args) {
        handleExceptions(new CatchingCheckExceptions ());
    }

    public static void handleExceptions(CatchingCheckExceptions obj) {
        
        
       
    int i = 1;
     
   
        
     while (i<=3)
     {
        
     
        try 
        {
            
            if (i == 1)
            {
            obj.method1();          
            }
            
            if (i==2) 
            {
            obj.method2();  
            }
            
            if (i==3)
            {
            obj.method3(); 
            }
        }
            
        catch (Exception e) 
        {
            printStack(e);
        }    
        
        i++;
       
        }
     
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }  
}
