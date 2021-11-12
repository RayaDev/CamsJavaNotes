/*
Catch (and display the type of) the exception that occurs when the following code is executed:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);


 */
package Level9;

import java.util.HashMap;

/**
 *
 * @author Cam
 */
public class ExceptionsWithMaps 
{
    public static void main(String[] args) throws Exception 
    {
        try
        {
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
        }
      /*  catch (Exception e)
        {
            System.out.println(e);
        }*/
        catch (NullPointerException e)
        {
            System.out.println(e);        
        }
                
    }    
}
