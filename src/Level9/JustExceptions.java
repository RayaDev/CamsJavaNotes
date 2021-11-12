/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level9;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 *
 * @author Cam
 */
public class JustExceptions {


        
    public static void main(String[] args) throws Exception {
        try {

            method1();
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //write your code here
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
