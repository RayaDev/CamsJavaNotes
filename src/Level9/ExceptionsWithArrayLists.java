/*
Catch (and display the type of) the exception that occurs when the following code is executed:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
 */
package Level9;

import java.util.ArrayList;

/**
 *
 * @author Cam
 */
public class ExceptionsWithArrayLists 
{
    public static void main(String[] args) throws Exception 
    {
        
        try
        {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }    
}
