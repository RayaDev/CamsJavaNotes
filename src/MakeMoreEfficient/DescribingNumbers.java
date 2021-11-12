/*
Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
"even single-digit number" - if the number is even and has one digit,
"odd single-digit number" - if the number is odd and has one digit,
"even two-digit number" - if the number is even and has two digits,
"odd two-digit number" - if the number is odd and has two digits,
"even three-digit number" - if the number is even and has three digits,
"odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall in the range 1 - 999, don't display anything.
 */
package MakeMoreEfficient;

import java.util.Scanner;

public class DescribingNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean EO = EvenOrOdd(number);
        int DC = DigitCount(number);
        String digit = null;
        String eo;
        
        if (number <= 0) {  //Terminates program if number is 0
            return;
        }
       
        { if (EO == true) {
            eo = "even";
        }
        else {
            eo = "odd"; } }
              
        if (DC == 1) {
            digit = "single";
        }
        if (DC == 2) {
            digit = "two";
        }
        if (DC == 3 ) {
            digit = "three";
        }
        
        if (DC < 4) {
            System.out.println (eo + " " + digit + "-digit number");
        }
        
    }   
    public static boolean EvenOrOdd (int a) {
        boolean m = (a % 2 == 0);
        return m;
    }
    
    public static int DigitCount (int b) {
        
        int count = 0;
        for(; b != 0; b/=10, ++count) {   //Whats up with that first ;...
        }
       // System.out.println("Number of digits: " + count);
        return count;
    
    }
        
        /* if (number % 2 ==0 && (number > 0 && number < 10)) {  //With this one you could create a loop that counts digits
            System.out.println("even single-digit number");
        }
        if(number % 2 !=0 && (number > 0 && number < 10)) {
            System.out.println("odd single-digit number");
        }
        if (number )
    } */
}
