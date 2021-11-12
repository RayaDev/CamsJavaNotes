/*
 Use the keyboard to enter an integer. Display a string description as follows:
"Negative even number" - if the number is negative and even,
"Negative odd number" - if the number is negative and odd,
"Zero" - if the number is 0,
"Positive even number" - if the number is positive and even,
"Positive odd number" - if the number is positive and odd.
 */
package Level4;



import java.util.Scanner;

public class LablesAndNumbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if (number < 0 && number%2 == 0){
            System.out.println("Negative even number");
        }
        if (number < 0 && number%2 != 0) {
            System.out.println("Negative odd number");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        if (number > 0 && number%2 == 0) {
            System.out.println("Positive even number");
        }
        if (number > 0 && number%2 != 0) {
            System.out.println("Positive odd number");
        }
    }
}
