/*

Overloading methods! Methods can have the same name, but need unique identifiers.
Kind of like constructors for classes. 

 */
package Level12;

/**
 *
 * @author Cam
 */
public class PrintInts {
    
    
    public static void main(String[] args) 
    {
        Integer a = 5;       
        int a1 = 5;
        
        print(a1);
        print(a);
      
        
    }
    
    public static void print(int a)
    {
        System.out.println(a);
       
    }
    
    public static void print (Integer a)
    {
        System.out.println(a);
    }
      
}
