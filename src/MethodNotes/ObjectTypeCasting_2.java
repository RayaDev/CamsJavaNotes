/*

More notes and examples on object type casting

 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class ObjectTypeCasting_2 {
    
    public static void main(String args[])
    { 
        createAnimals();
    }
    
    public static void createAnimals()
    {
        Lion lion = new Lion();
        Animal lion_1 = new Lion();
        Animal cow = new Cow();
        
        lion.walk();
        lion.eat();
        lion.Roar();
        
        //lion_1.Roar(); //This lion can't roar becuase the Animal Label restricts access. 
        lion_1.eat();
        
        try {
        Animal /* creates a new object of the type Animal */ cat /*reference variable */ = new Lion(); //Constructor being called. In this case creates a Lion, which is down the chain from Animal. Can't go up the chain though. 
        Lion simba = new Animal(); //Even if it wasn't abstract, still couldn't be called becuase its up the inheritance chain. 
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
public static abstract class Animal
{
    public static void walk()
    {
       System.out.println("The Animal walked.");
    }
    
   public abstract void eat();
}

public static abstract class Carnivor extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("The animal ate some meat.");
    }
}

public static abstract class Herbavor extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("The animal ate some plants.");
    }
}

public static class Lion extends Carnivor
{
    public static void Roar()
    {
        System.out.println("The lion roared.");
    }
}

public static class Cow extends Herbavor 
{
    public static void Moo()
    {
        System.out.println("The cow mooed.");
    }
}

}
