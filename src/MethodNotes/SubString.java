/*

Good for substring methods.

 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class SubString {
    public static void main(String[] args) 
    {
        int i = 1;
        while(i<43)
        {
        
        String s = "I do not want to learn Java. I want a big salary";
        //System.out.println(s.length());
        
        System.out.println(s.substring(1,31));        
        System.out.println(s.substring(31,48));
        
        System.out.println(i);      
        i++;
        }
        
    }  
}
