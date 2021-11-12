/*
 Add one type conversion to get the following answer: b = 0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
 */
package Level10;

/**
 *
 * @author Cam
 */
public class IntegerConversion_3 {
    public static void main(String[] args) 
    {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f); //The default value of a byte is 0, so anything outside of the range --128 >= x <= 128 is set to 0.
        System.out.println(b);
    }   
}
