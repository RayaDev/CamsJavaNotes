/*
Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
Determine whether a triangle with these sides can exist.
Display the result as follows:
"The triangle is possible." - if a triangle with these sides could exist.
"The triangle is not possible." - if a triangle with these sides cannot exist.

Hint:
A triangle can exist only if the sum of two of its sides is greater than the third side.
You need to compare each side with the sum of the other two.
If even one side is larger or equal to the sum of the other two sides, then no such triangle exists.

Requirements:
•	The program should read three numbers from the keyboard.
•	The program should display text on the screen according to the task conditions.
•	If a triangle with the specified sides could exist, you need to display: "The triangle is possible."
•	If a triangle with the specified sides cannot exist, you need to display: "The triangle is not possible."
 */
package Level4;

import java.io.*;
public class RulesOfTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String a = reader.readLine(); 
        int a1 = Integer.parseInt(a);        // Is there a way to read and assign multiple variables with one readLine()?
        String b = reader.readLine(); 
        int b1 = Integer.parseInt(b);
        String c = reader.readLine(); 
        int c1 = Integer.parseInt(c);
        int Triangle = TriangleTest2(a1,b1,c1);
        if (Triangle == 1) {
            System.out.println("\"The triangle is possible.\"");
        }
        else {
            System.out.println("\"The triangle is not possible.\"");
        }
   
    }   
    /*public static int TriangleTest (int a,int b, int c){
        if ( a + b > c){
            return 1; }
        if (a + c > b){
            return 1;
        }
        if (c + b > a) {
            return 1;
        }  
        else { 
            return 0;
        }
     } */
    public static int TriangleTest2 (int a,int b,int c){
       if (a >= (b+c)|| b >= (a+c)|| c >= (b+a)){
            return 0;}
       else {
            return 1;
       }
    }
}
