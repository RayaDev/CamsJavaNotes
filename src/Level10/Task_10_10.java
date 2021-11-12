/*
Add one type conversion to get the following answer: d = 1.0

 */
package Level10;

/**
 *
 * @author Cam
 */
public class Task_10_10 {
    public static void main(String[] args) {
        int a = (byte)257;
        System.out.println(a);
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / e;

        System.out.println(d);
    }   
}
