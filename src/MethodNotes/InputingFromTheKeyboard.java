/*
 
Aparently you can make templets out of these through the IDE...

 */
package MethodNotes;

import java.io.InputStream;
import java.io.Reader;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
// or just use
//import java.io.*;
import java.util.Scanner; //Must import for Scanner 

public class InputingFromTheKeyboard {
        public static void main(String[] args) throws IOException  {
             //FullInput();
             //CompactInput();
             ScannerInput();
        
        } 
       
        public static void FullInput() throws IOException {
        //Full expanded input code
        InputStream test = System.in;
        Reader testread = new InputStreamReader(test); //InputStreamReader is a java element
        BufferedReader bufftest = new BufferedReader(testread);
        
        System.out.println("What is your name?");
        String name = bufftest.readLine(); //Reads line from the keyboard.
        System.out.println("How old are you?");
        String age = bufftest.readLine(); //Reads line from the keyboard.
        int age1 = Integer.parseInt(age); //Converts the string to an integer. 
        
        System.out.println("Your name is " + name + " and you are " + age+" years old."); }
        
        public static void CompactInput() throws IOException {
        //More compact version of full input code
        
        //Enter data using BufferReader 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String var = reader.readLine(); 
        int var1 = Integer.parseInt(var);
  
        //Printing the read line 
        System.out.println(var); 
        System.out.println(var1); 
        }

        public static void ScannerInput() throws IOException {
        //Using the Scanner method
        // Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
  
        // String input 
        String name = sc.nextLine(); 
  
        // Character input, reads a single character
        char gender = sc.next().charAt(0); 
  
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        int age = sc.nextInt(); 
        long mobileNo = sc.nextLong(); 
        double cgpa = sc.nextDouble(); 
  
        // Print the values to check if the input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
        
        }      
} 
        
        
   
 
    

