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
public class ExceptionsTypeCatchList 
{
    public static void main(String[] args)
    {
        System.out.println("Program starts");

        try
        {
            System.out.println("Before calling method1");
            method1();
            System.out.println("After calling method1. This will never be shown");
        }
        catch (NullPointerException e)
        {
           System.out.println("Null reference. Exception has been caught");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero. Exception has been caught");
        }
        catch (Exception e)
        {
            System.out.println("Any other errors. Exception has been caught");
        }

        System.out.println("Program is still running");
    }
    
    public static void method1()
    {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
