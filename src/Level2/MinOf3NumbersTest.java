/*
Just a diffrent way to solve to same probablem. 
 */
package Level2;

/**
 *
 * @author Cam
 */
public class MinOf3NumbersTest {    
 
   public static int min(int a, int b, int c) {
        
    int m;
        if (a<b && b<c) 
        m = a;
         else if (b<a && a<c) 
        m = b;
         else 
        m = c;
        
        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}
