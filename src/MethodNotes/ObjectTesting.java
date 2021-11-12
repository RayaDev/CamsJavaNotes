/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

public class ObjectTesting {
    
    public static String Testname = "Steve";       // Static means the variables are shared among all objects at a class level. 
    private static String newName = "Ass";          // Variables can be public or private. Doesn't effect their use inisde of the class.
    public static void main (String[] args) {       // Only affects their use in other parts of the program or outside the class.                                                   // Actualy main method has to be public. 
      naming();
      System.out.println(Testname);  
      System.out.println(newName);               // This system out could not find the newName variable becuase it was a local instance of naming()
    }                                             // But it will now reference the class level variable instead. 
    public static void naming() {
        String newName = "Bitch";               // Just created a local instance variable. It is currently hiding the class level newName.
        Testname = Testname + " Boof";         // Redefining the class level variable! With out another varialbe inbetween. 
         // Testname = newName;                // Redefining the class level variable!    
       System.out.println(newName);                   
        
       //return newName;   << Nothing to return on this method since we are just redefining class level varaibles. 
                               // The void part of the method determines if we can return anything. 
    }
}

