/*
Catch (and display the type of) the exception that occurs when the following code is executed:
int num = Integer.parseInt("XYZ");
System.out.println(num);
 */
package Level9;

/**
 *
 * @author Cam
 */
public class ExceptionsWithNumbers 
{
    public static void main(String[] args) throws Exception 
    {
        try
        {
        int num = Integer.parseInt("XYZ");
        System.out.println(num);
        }
       /* catch (Exception e)
        {
            System.out.println(e);
        }  */     
        
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }        
             
        //write your code here
    }    
}
