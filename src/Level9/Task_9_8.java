/*
In the handleExceptions method, handle all checked exceptions.
You need to display the checked exception that occurs.
You can only use one try-catch block.
 */
package Level9;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 *
 * @author Cam
 */
public class Task_9_8 {
    public static void main(String[] args) {
        handleExceptions(new Task_9_8());

    }

    public static void handleExceptions(Task_9_8 obj) {
        
        try {
        obj.method1();
        obj.method2();
        obj.method3();
        }
        catch (Exception e) 
        {
           // System.out.println(e);
            printStack(e);
        }
    }
    
    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }   
}
