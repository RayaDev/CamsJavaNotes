/*
 Operators

Java has 5 different boolean compare operators: &, &&, |, ||, ^

& and && are "and" operators, | and || "or" operators, ^ is "xor"

The single ones will check every parameter, regardless of the values, before checking the values of the parameters. The double ones will first check the left parameter and its value and if true (||) or false (&&) leave the second one untouched. Sound compilcated? An easy example should make it clear:

Given for all examples:

 String aString = null;
AND:

 if (aString != null & aString.equals("lala"))
Both parameters are checked before the evaluation is done and a NullPointerException will be thrown for the second parameter.

 if (aString != null && aString.equals("lala"))
The first parameter is checked and it returns false, so the second paramter won't be checked, because the result is false anyway.

The same for OR:

 if (aString == null | !aString.equals("lala"))
Will raise NullPointerException, too.

 if (aString == null || !aString.equals("lala"))
The first parameter is checked and it returns true, so the second paramter won't be checked, because the result is true anyway.

XOR can't be optimized, because it depends on both parameters.
 */
package MethodNotes;

import java.io.*;
public class IfElseOperators {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String number = reader.readLine(); 
        int number1 = Integer.parseInt(number);
        
        int number2 = 78;
        
        if (number1 > number2){
            System.out.println("Number 1 is greater");
        }
        else {
             System.out.print("Number 2 is greater");
        }
    }
}

