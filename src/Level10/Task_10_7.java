/*
Remove unnecessary operators to get the correct answer: 1234567
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;
 */
package Level10;

/**
 *
 * @author Cam
 */
public class Task_10_7 {
    public static void main(String[] args) 
    {
        long l = (byte) 1234_564_890L;
        System.out.println(l);
        int x = (byte) 0b1000_1100_1010;
        System.out.println(x);
        double m = (byte) 110_987_654_6299.123_34;
        System.out.println(m);
        float f = (byte) l++ + 10 + ++x - (float) m;
        System.out.println(f);
        l = (long) f / 1000;
        System.out.println(l);
        System.out.println("_______________");
        codeGym();
    }
    
    public static void codeGym()
    {
        long l = (int) 1234_564_890L;
        System.out.println(l);
        int x = (short) 0b1000_1100_1010;
        System.out.println(x);
        double m = (short) 110_987_654_6299.123_34;
        System.out.println(m);
        float f = (float) l++ + 10 + ++x - (float) m;
        System.out.println(f);
        l = (int) f / 1000;
        System.out.println(l);
    }
}

/*
long l = (int) 1234_564_890L;
        int x = (short) 0b1000_1100_1010;
        double m = (short) 110_987_654_6299.123_34;
        float f = (float) l++ + 10 + ++x - (float) m;
        l = (int) f / 1000;
        System.out.println(l);
*/
