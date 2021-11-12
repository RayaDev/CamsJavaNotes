/*
Solution to the task..Ugh Long one. Another way to solive it
 
Write a function that computes the minimum of four numbers.
The function min(a, b, c, d) should use (call) the function min(a, b)

Hint:
You need to write the body of the two existing min functions.

Requirements:
•	The program should display text on the screen.
•	The min methods should not display text on the screen.
•	The main method should call min(a, b) and min(a, b, c, d).
•	The main method should display the result of the min methods. Each time, on a new line.
•	The min(a, b) method must return the minimum of the numbers a and b.
•	The min(a, b, c, d) method must use the min(a, b) method.
•	The min(a, b, c, d) method must return the minimum of the numbers a, b, c, and d.


*/
package Level2;

/**
 *
 * @author Cam
 */
public class MinOf4Numbers {
    
 public static int min(int a, int b, int c, int d) {
       //System.out.println("Min excuted");
       //System.out.println("Min excuted"+ " " + a + b + c + d);
        int m1;
        //int m = min2 (a,b);
        //System.out.println(" m =" + m);
        if (a < b &&  a <c && a < d) 
        m1 = a;
        
         else if (b < a && b < c && b < d) 
        m1 = b;
         else if (c < a && c < d && c < d)
                 
        m1 = c;
       
        else
             
        m1 = d;
        
        return m1;
//System.out.println(min(-40, -10, -30, 40));
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
