/*

More method overloading!
Adding more parameters to the method still counts as overloading, and gives
the method a unique identifier. 


 */
package Level12;

/**
 *
 * @author Cam
 */
public class FreedomOfPress {
    public static void main(String[] args) 
    {

    }

    public static void print(String a)
    {
        System.out.println(a);
    }
    
    public static void print(int a)
    {
        System.out.println(a);
    }
    
    public static void print(Integer a)
    {
        System.out.println(a);
    }
    
    public static void print(char a)
    {
        System.out.println(a);
    }
    
        
    public static void print(float a)
    {
        System.out.println(a);
    }
    
        
    public static void print(int b, char a)
    {
        System.out.println(a);
    }
        
}
