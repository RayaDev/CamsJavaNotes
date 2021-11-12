/*
Arrange the cast operators correctly to get the required result: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
 */
package Level10;

/**
 *
 * @author Cam
 */
public class IntegerConversion_1 {
    
    public static void main(String[] args) 
    {
        int a = 0;
        System.out.println(a);
        
        int b = (byte) a + 46; //Narrowing int to byte
        System.out.println(b);
        
        byte c = (byte) (a * b); //Same type, but changes c to 0;
        System.out.println(c);
        
        /*double f = (char) 1234.15; //Same size, but char does not handle any number < 0.
        System.out.println(f); */
        
        double f = (char) 1234.15; //Narrows the int to a char, prints a type face to that code with a value?
        System.out.println(f); 
        
        long d = (char) (a + f / c + b);
        System.out.println(d);
        
    }  
    
}
