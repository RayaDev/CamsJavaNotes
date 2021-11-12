/*

More complicated use of methods. 
 
*/
package Level2;

public class Methodman {
    public static void main(String[] args) {
        test22(45.567676, 57);
        test23(6589, 69);
    }

    public static void test22(double a, int b) {
       double c = a * b;
       System.out.println(c);
    }
    public static void test23(double a1, double b2) {
       double d = a1 / b2;
       System.out.println(d);
       double d1 = d * d * d;
       System.out.println(d1);
       
    }
}




    

