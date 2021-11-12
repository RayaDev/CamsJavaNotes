/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import static CamsUsefulMethods.printAll.printP;

/**
 *
 * @author Cam
 */
public class StaticClassVariables {

    public static void main(String[] args)
    {
        Human Steve = new Human("Steve");
        Human Carl = new Human("Carl");
        
        Steve.hasHeart();
        Steve.noHeart(); //Access the static variable and changes it, so now Carl has no heart!
              
        Carl.hasHeart();
        

        //printP(Carl.getClass().getName());  //Little refernce of getName() extended from getClass. 
        
        //printP(Steve.getClass().getName());
        
    }
    
    public static class Human
    {
        static String heart = " the human has a heart..."; //Static means its common across all instances of the class! @_@
        String name;
        
        Human(String name)
        {
            this.name = name;
        }
        
        public void hasHeart()
        {
            printP(name + heart);
            
        }
        
        public static void noHeart()
        {
            heart = "...is a heartless Capitalist";
            
        }
                
    }
}
