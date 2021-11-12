/*
Arrange the cast operators correctly to get the required result: d = 3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;
 */
package Level10;

/**
 *
 * @author Cam
 */
public class IntegerConversion_2 {
    public static void main(String[] args) 
    {
       /* int a = 15;
        int b = 4;
        float c = a / b;
        System.out.println(c);
        
        long test = (long) 1e-3;
        System.out.println(test);
        
        double d = a * 1e-3 + c;
        System.out.println(d); */
        
        
          
        int a = 15;
        int b = 4;
        float c = (float) a / (float) b;
        // System.out.println(c);
        double d = a * 1e-3 + c;

        System.out.println(d);
    
    }    
}
