/*
 
Use the below guide

https://dzone.com/articles/java-string-format-examples

%s %d and all that jiz jazz. 
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class StringFormating {
    public static void main(String[] args) {  
       /* String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 101);          // Hexadecimal value  
        String str5 = String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5); */
       
        testFormating();
        
     
    }  
    
    public static void testFormating()
    {
        String str1 = String.format("This is me testing %s for the %dst time.", "formating", 1);
        System.out.println(str1);
        
        int x = 1;
        int y = 2;
        int z;
        String str2 = String.format("%d + %d = %d", x , y, (z = x+y));
        
        System.out.println(str2);
        
       
        
    }
}
