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
public class ExceptionsWithArrays {
    public static void main(String[] args) throws Exception 
    {
        
        try 
        {
        int[] m = new int[2];
        m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }       
    }    
}
