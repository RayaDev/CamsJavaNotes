/*
Catch the exception that occurs when the following code is executed:
int a = 42 / 0;
Display the type of exception caught.
 */
package Level9;

/**
 *
 * @author Cam
 */
public class ExceptionsWorkingWithNumber 
{
    public static void main(String[] args)
    {
       
        try 
        {
        
        int a = 42 / 0;
        }
        
        catch (ArithmeticException e)           
        {
            System.out.println(e);
        }
    }  
}
