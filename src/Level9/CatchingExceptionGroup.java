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
public class CatchingExceptionGroup {

public static void main(String[] args) throws Exception 
    {
        try 
        {

        method1();

        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static void method1() throws Exception1, Exception2, Exception3 
    {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {    
}


   