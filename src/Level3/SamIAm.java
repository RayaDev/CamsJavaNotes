/*
 Display all possible combinations of the words "Sam", "I", "Am".

Hint: there are 6 combinations.
Display each combination on a new line. Do not separate the words.

Consider this example:
IAmSam
AmSamI
...

Requirements:
•	The program should output text.
•	The displayed text should contain 6 lines.
•	The text on each line must be unique.
•	All possible combinations should be displayed.
  
Output
Sam I Am
HARD
Teacher diego
6
Task

 */
package Level3;

//How do you compare if two strings are equal?
public class SamIAm {
      public static void main(String[] args) {
        String a = "Sam ";
        String b = "I ";
        String c = "Am ";
        System.out.println(a + b + c);
        System.out.println(b + a + c);
        System.out.println(c + b + a);
        System.out.println(b + c + a);
        System.out.println(c + a + b);
        System.out.println(a + c + b);
        
      
      }
}
