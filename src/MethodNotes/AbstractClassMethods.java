/*
The point of abstract classes in the force all other child classes to impliment
the methods of the abstract. 

Can't make an object of the abstract, but acts as sort of a templete for all
classes and objects that extend it. 
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class AbstractClassMethods {
    
    public static void main(String args[]) 
    {    
        Dog dog = new Dog();
        dog.Sound();
        dog.eatFavorite_Food();
        dog.move();
        
        Dog Fido = new Pet();
        
        
       
        try 
        {
            Animals cow = new Animals(); //Object can't be implimented becuase it's abstract
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

public static abstract class Animals {
    
    abstract void Sound(); 
    /* Abstract method does not need a body. Just ensures that anything
        that inherits animal must Override sound, and impliment its own method.
        
    */
    abstract void eatFavorite_Food();   
    
    public static void move()
    {
        System.out.println("The creature moved..");
       
    }
    /*Can create a regular method in the abstract class that gets extended to 
    the child classes, and can still be implimented. 
    
    */
}

public static class Dog extends Animals
{

        @Override
        void Sound() {
            System.out.println("Woof! Woof!");
        }

        @Override
        void eatFavorite_Food() {
           System.out.println("Noms some meatz.");
        }
    
}

public static class Pet extends Dog
{
    
}
    
}
