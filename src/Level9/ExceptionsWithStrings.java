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
public class ExceptionsWithStrings {

    public static void main(String[] args) throws Exception 
    {
        
        try 
        {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        
    }
}
