/*

Need to understand and define all the principles below

Inheritance
Encapsulation
Overloading
Polymorphism - Always getting this confused with Inheritance 
Abstraction
Interface



 */
package MethodNotes;

public class ObjectTypeCasting_GoodExample {
   
    public static void main(String args[]) 
    {    
        MyMainClass.main();
        
    }
    
public static class MyMainClass {

    public static void main() 
    {    
        
        createAnimal();
        createDogNarrowing();
        createDog();
        createWolf();       
        
    }
    
    public static void createAnimal()
    {
        Animal bird = new Animal("Tweety");
        System.out.println(bird.getName());
        System.out.println(bird.getClass());
        
        try
        {
          bird.animalSound();
          bird.eat();
          bird.poop();
          bird.layEgg();
          bird.play();
          bird.howl();
          
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Bird are kind of boring..");
        }

        System.out.println("____________________"); 
    }
    
    public static void createDogNarrowing()
    {
        Animal myCreature = new Dog("Polly");
        /*myCreature is an narrowing of the Dog class down to the Animal class. Therefore it cannot bite(), or play(),
        becuase they are methods in class Dog. */
       
        System.out.println(myCreature.getName());
        System.out.println(myCreature.getClass());
        
        try 
        {
        myCreature.animalSound(); /*The myCreature is an Animal class, but the
        Dog class method animalSound() Overrides Animal class's animalSound()
        
        making animalSound private in the Animal class fixed this.. 
        */
            
        myCreature.running(); 
        //Now myCreature is an Animal object, that is a new Dog()
        
        myCreature.poop(); 

        myCreature.eat();
        //But it can eat. 
        
        myCreature.layEgg();
        // And it can use layEgg(), becuase that method is private to the Animal class 
        
        myCreature.bite(); 
        /*Cannot bite... Dog class was narrowed to only excute Animal methods. 
        even though bite() is public. 
        */
        
        myCreature.howl();
        //Cannot howl(), becuase howl is a method in the Wolf class. 
        
        myCreature.play();
        //Cannot play(), beucase play is limited to Dog class. 
        }
        
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("This thing doesn't know how to do alot..");
        }
                 
        System.out.println("____________________");
    }
    
    public static void createDog()
    {
        Dog myDog = new Dog("Fido"); /* Create a Dog object
        
        Dog class extends Animal class.. so in this case.
        the class Animal object is widned to now include everything a Dog object can do. 
        
        Is this... Polymophism...? I think so. Adding methods to classes that you've inhertied. 
        
        */ 
        
        System.out.println(myDog.getName());
        System.out.println(myDog.getClass());
        
        try 
        {
        
        myDog.animalSound();
        /* Call the method on the Dog object, which uses the super function to call  
        animalSounds() from the Animal class.
        */   
        
        myDog.running(); 
        /* This Dog object can run and bite, running() is in the Animal class, the myDog object
        inherited that method, and then added the bite method from the Dog class. Works becuase running() is public. */
        
        myDog.bite(); 
        /*Does comple becuase a Dog object can do anything an Animal can do, 
        plus all the dog methods
             
        */
             
        myDog.eat();
        
        myDog.poop();
        //Overrides the Animal class poop()
        
        myDog.play();
        
        myDog.layEgg();
        /* Becuase layEgg is private to Animal, it was not extended to the Dog class
        and therefore a Dog object cannot use this method. 
        */
        
        }
        
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Dogs can't lay eggs!");
        }
        
        
        System.out.println("____________________");
    }
    
    public static void createWolf()
    {
        Wolf wolf = new Wolf("Gmork");
        /*The Wolf class is the widest casting. Extends the Dog class, which allready
        extended the Animal class. Can do everything a Dog and an Animal can do */ 
       
        System.out.println(wolf.getName());
        System.out.println(wolf.getClass());
        
        try 
        {
        wolf.animalSound();
        wolf.bite();
        wolf.howl();
        wolf.eat();
        wolf.poop();
        wolf.play();
        /*play() is private to Dog class. Otherwise it would extend to Wolf class, 
        but it will neve extend back to the Animal class.    
        */ 
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Wolves don't like to play..");
        }
    }
}   
    
    
public static class Animal { // Superclass (parent)
  
    public String name;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    private void animalSound() 
    {
    
        System.out.println("The animal makes a sound");
    
    }
    
    public void running()
    {
        System.out.println("The animal is running!");
    }
    
    private void poop()
    {
        System.out.println("The aninmal pooped.");
    }
    
    public void eat()
    {
        System.out.println("The animal is eating");
    }
    
    private void layEgg ()
    {
        System.out.println("The animal laid an egg!");
    }
    
    public String getName()
    {
        return name;
    }
}

public static class Dog extends Animal { //Subclass and extension of Animal

    public Dog(String name) 
    {
        super(name);
    }
 
    public void animalSound() 
    {    
        super.animalSound(); // Call the superclass method
        System.out.println("The canine is growling..");   
    }
    
    public void bite()
    {
        System.out.println("The canine bit you!");
    }
        
    public void poop() 
    {
        System.out.println("The canine pooped!");
    }
    
    private void play()
    {
        System.out.println("The dog fetched the ball!");
    }
    
}

public static class Wolf extends Dog { //Extension of Dog, which allready extended Animal.

    public Wolf(String name)
    {
        super(name);
    }
 
    
    @Override
    public void animalSound()
    {
        super.animalSound();
        System.out.println("The wolf growls.. GRRRRR...");        
                        
    }
    @Override
    public void bite()
    {
        super.bite();
        System.out.println("The wolf bites harddd!");
    }
    
    public void howl()
    {
        System.out.println("The wolf howled at the moon");
    }
    
}

}
