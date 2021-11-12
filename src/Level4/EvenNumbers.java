/*
The for loop in practice.
For loops have three arguments that must be passed. See codegym lecture. 
*/
package Level4;

/**
 *
 * @author Cam
 */
public class EvenNumbers {
        public static void main(String[] args) throws Exception {
        
        for(int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
