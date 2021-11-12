/*
Yeahhhh buddy!!! Good work! Intresting way to solive it. 
 */
package Level2;

/**
 *
 * @author Cam
 */
public class MinOf4NumbersTest {
    
  public static int min(int a, int b, int c, int d) {
       //System.out.println("Min excuted");
       //System.out.println("Min excuted"+ " " + a + b + c + d);
        int m1;
        int m = min2 (a,b);
        //System.out.println(" m =" + m);
        if (m < c && c<d) 
        m1 = m;
         else if (c < m && m <d) 
        m1 = c;
         else 
        m1 = d;
        
        return m1;

    }

    public static int min2(int a, int b) {
        //System.out.println("Min2 excuted");
        int m2;
        
        if(a < b)
        
        m2 = a;
        else
        m2 = b;
       //System.out.println("Min2 =" + m2);
       return m2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min2(-20, -10));
        System.out.println("The min is" + min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
