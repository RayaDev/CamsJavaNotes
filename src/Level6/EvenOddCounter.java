/*
Use the keyboard to enter a number. Determine the number of even digits and odd digits in the entered number.
If a number is divisible by 2 without a remainder (i.e. the remainder is zero), then it is even.
And we'll increase the even digit counter (static variable even) by 1.
Otherwise, the number is odd, so we'll increase the odd digit counter (static variable odd).
Display the following message: "Even: a Odd: b", where a is the number of even digits and b is the number of odd digits.

Example for 4445:
Even: 3 Odd: 1
 */
package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class EvenOddCounter {
     
    public static int odd;
    public static int even;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(reader.readLine());

        while (a >0) {

            if (a%2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            a/=10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}

/* This was sooo much simpler than I thought lololol ughhh */ 