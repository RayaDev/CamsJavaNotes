/*
Display the sum of numbers from 1 to 5, line by line (there should be 5 lines):
1
1+2=3
1+2+3=6
...

Example output:
1
3
6
...

Requirements:
•	The program should output text.
•	The displayed text should contain 5 lines.
•	The number in each new line must be greater than the previous one.
 */
package Level3;

/**
 *
 * @author Cam
 */
public class SumOf5Numbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2 + a;
        int c = 3 + b;
        int d = 4 + c;
        int e =5 + d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    
}
