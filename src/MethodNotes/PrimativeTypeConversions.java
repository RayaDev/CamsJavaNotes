/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class PrimativeTypeConversions {
    public static void main(String[] args)
    {
        //narrowPrimative();
        // widenPrimative();
         allCharTypes();
    }
    
    
    static void widenPrimative()
    {
        //To widen a conversion, just make the number fit in the data type below it. Will automaticall widen to fit the next type above. 
        byte n = 8;
        //char cN = (char) n; //char still needs to be cast since its not numaric. 
        short n1 = n;
        int n2 = n1;
        long n3 = n2;
        float n4 = n3;
        double n5 = n4;
        System.out.println("Double: " + n5 + " same as orignal byte");
        
        
        
        
    }
    static void narrowPrimative()
    {
       //Just showing an example of casting down each step of the way. 
      

        //double n = 3e39; //Means 3x10^38.. Maximum value a float (type below double) can hold. Any higher and float outputs infinity.  
       double n = 2147483647d; //This is the max value for an int, so even just one higher won't compile. 
       float nF = (float)(double) n;
       long n1 = (long)(float)(double) nF;      
       int n2 = (int)(long)(float)(double) n1;
       short n3 = (short)(int)(long)(float)(double)n2;
       //char n4 = (char)(short)(int)(long)(float)n; //Char just outputs unicode values. Max numerical value is 127?, but size is 16bytes     
       byte n5 = (byte)/*(char)*/(short)(int)(long)(float)(double)n3; //this is casting down to its orignal value.. 
             
       System.out.println("Orignal double: " + n);
       System.out.println("Cast to float: " + nF);
       System.out.println("Cast to long: " + n1);
       System.out.println("Cast to int: " + n2);
       System.out.println("Cast to short: " + n3);
       //System.out.println("Cast to char: " + n4);
       System.out.println("Cast to byte: " + n5);
       
       /*
       Byte sizes..
       
       double = 64
       float = 32
       long = 64
       int 32
       short 16
       char 16
       byte 8
       
       Maybe something to with byte size is cuasing the value to truncate to -1 in the above example. 
       Data is lost when you convert from 64byte to 32 to 16 to 8.. Unless the orignal value can be contained in
       The same number of bytes as the primative type below it. 
       */
       
       float x = 6e30f;
       int y = (int)x;
       System.out.println("Same byte size test float to int: float: " + x + " truncates to int: " + y);
       /*
       Doubles can truncate down to max value of long... and floats can truncate down to max value of int. 
       */
       
    }
    
    static void allCharTypes()
    {                           
        //Trying to find the end of it.    
        Set<Character> allChar = new HashSet<>();
        try
        {           
            
            int maxInt = 65535; //Max character UniCode value apprently. Does it just loop over again then? Like char 0 = char 65536?
            for(int i = 0; i <= maxInt; i++)
            {
                char c = (char)i;
                System.out.println(i + " = " + c);
                allChar.add(c);
            }           
        }
        catch(Exception e)
        {
           System.out.println(e);  
         
        }
        
        /*for(char c : allChar)
        {
            System.out.println(c);
        }*/
           
    }
}
