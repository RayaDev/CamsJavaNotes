/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class MethodOverloading {
    public static void main(String[] args) throws Exception 
    {
        int a = 5;
        String b = "Cammmm";
        double c = 5.0;
        
        print(a);  
        System.out.println();
        
        print(b);
        System.out.println();
        
        print(c);
        System.out.println();
        
        
    }
    
    public static void print(Object o)
    {
        /*With this method every input type is automatically widened to an object. Prints any input.
        Does this use up more system resources by widening the object everytime? 
        Compared to say just overloading the method for each type of object */
        
        System.out.println(o);
        typeCheck(o);
        
    }
    
    public static void typeCheck (Object o)
    {
        if (o instanceof Integer)
        {
            
            System.out.println("The object is an Integer");
        }
        
        else if (o instanceof String)
        {
            System.out.println("The object is a String");
        }
        
        else 
        {
            System.out.println("Unkown object.");
        }
        
       
    }
}
