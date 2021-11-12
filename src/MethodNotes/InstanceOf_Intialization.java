/*
Instance of and intialziing objects.

 */
package MethodNotes;

import Level14.*;

/**
 *
 * @author Cam
 */
public class InstanceOf_Intialization {
    public static void main(String[] args) 
    {      
        Animal o = new Cat ();
        isInstanceOf(o);
        System.out.println("_______");
        
        Animal o1 = new Tiger();
        //o1.king();
        //o1.sound();
        isInstanceOf(o1);
        System.out.println("_______");
        
        Animal /*Declares a new object and type */ obj /*assigns that object to a reference varaiable */ = new Cat(); //intializes that object with a consturctor. 
        isInstanceOf(obj);
        
        /*If the Cat class does not extend the Animal class, you can not initialize an Animal object
        with the new Cat() constructor.
        
        When you call new Cat() you intialize the Animal object as 
        a Cat and an Animal, since Cat extends Animal. 
        */
        
        try
        {
            Animal object = new Plane(); //This does not work since class Plane() does not extend Animal. 
        }
        catch (Exception e)
        {
           System.out.println(e); 
        }
        
    }
    
    public static void isInstanceOf(Object o)
    {
        boolean isTiger = o instanceof Tiger;
        boolean isCat = o instanceof Cat;
        boolean isAnimal = o instanceof Animal;
        
        String objectType;
        if (isTiger == true)
        {
            objectType = "The object is a Tiger";
            System.out.println(objectType);
            
        }
        
        if (isCat == true)
        {
            objectType= "The object is a Cat";
            System.out.println(objectType);
        }
        
        if (isAnimal == true)
        {
            objectType = "The object is an Animal";
            System.out.println(objectType);
        }
    }
    
    public static class Animal {
    
        private void sound() 
        {
            System.out.println("Burp");
        }
    }
    
    public static class Cat extends Animal 
    {
        private void sound() 
        {
            System.out.println("Meow");
        }
    }
    
    public static class Tiger extends Cat 
    {
        private void sound() 
        {
            System.out.println("Rawrrrr");
        }
        
        private void king()
        {
            System.out.println("King of the jungle!");
        }
    }
    
    public static class Plane
    {
        private void sound()
        {
            System.out.println("Wooossshhh");
        }
    }
}
