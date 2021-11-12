/*

The "extends" command makes that class copy the parent class. 

 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class Polymorphism1 {



public static void main(String[] args) 
{

    Animal dog = new Dog();
    dog.speak();
       
    Cat cat = new Cat();
    Dog dog1 = new Dog();

    AnimalBarbershop barbershop = new AnimalBarbershop();

    barbershop.trim(cat);
    barbershop.trim(dog1);
}
    
    
public class Animal 
{

   public void speak() {

       System.out.println("Hello!");
   }
}

public static class Dog extends Animal 
{

   @Override
   public void speak() {
       System.out.println ("Woof-woof!");
   }
}

public static class Cat extends Animal 
{

   @Override
   public void speak() 
   {
       System.out.println("Meow!");
   }
}  

public static class AnimalBarbershop 
{

    public void trim(Animal animal) {

       System.out.println("The haircut is done!");
   }
}

}
