/*
Remove unnecessary operators to get the correct answer: result: 1000.0
double d = (short) 2.50256e2d;
char c = (short) 'd';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (d * s) - 500e-3;
 */
package Level10;

/**
 *
 * @author Cam
 */
public class Task_10_4 {
    public static void main(String[] args) {
       /* double d = (short) 2.50256e2d;
        System.out.println(d);
        short c = (short) 'd';
        System.out.println("char: " + c);
        short s = (short) 2.22;
        System.out.println(s);       
        int i = (short) 150000;
        System.out.println(i);
        float f = (short) 0.50f;
        System.out.println(f);
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);*/
        
        Solution();
    }    
    
    public static void Solution()
    {
        double d = (short) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = (int) 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}
