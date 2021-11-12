/*
 Implement the print3 method. The method should display the passed string (word) three times, but on the same line.
Words must be separated by a space and should not merge into one.

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The print3 method should display the text on the screen.
•	The main method should call the print3 method only twice.
•	The print3 method should display the passed string (word) three times, but on the same line.
 */
package Level2;

/**
 *
 * @author Cam
 */
public class Print3Times {
    
  public static void print3(String s) {
        System.out.print(s + " ");
        System.out.print(s + " ");
        System.out.print(s + " "); 

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
