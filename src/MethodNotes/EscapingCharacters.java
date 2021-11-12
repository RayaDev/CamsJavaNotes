/*
Use the \ command to null the effect of an operator in a string. 

Display the following text (two lines):
This is a Windows path: "C:\Program Files\Java\jdk1.8.0_172\bin"
This is a Java string: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"

Hint:
\” – Insert a double quote character in the text at this point.
\\ – Insert a backslash character in the text at this point.

Requirements:
•	The program should output text.
•	Two lines must be displayed.
•	The first line of text should be: This is a Windows path: "C:\Program Files\Java\jdk1.8.0_172\bin"
•	The second line of text should be: This is a Java string: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"

 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class EscapingCharacters {
      public static void main(String[] args) {
        System.out.println("This is a Windows path: \"C:\\ProgramFiles\\Java\\jdk1.8.0_172\\bin\"");
        System.out.println("This is a Java string: \\\"C:\\\\ProgramFiles\\\\Java\\\\jdk1.8.0_172\\\\bin\\\"");
       
    } 
}
    
