/*
Edit the following three classes: Pet, Cat, and Dog.
Make the Cat and Dog classes inherit the Pet class.

Demonstrates inheratence, and polymorphism(?). 
 */
package Level11;

/**
 *
 * @author Cam
 */
public class Pets {
    public static void main(String[] args) {
    
     
        Cat cat1 = new Cat("Jimbo", 14);
        Dog dog1 = new Dog("Shilo", 8);
       
        cat1.eat();
        dog1.play();
        cat1.play();
        
    }

    public class Pet {
        String name;
        int age;
        
        void eat() 
        {
           System.out.println(name + " is eating."); 
        }
        
        void play()
        {
            System.out.println(name + " is playing.");
        }
 
    }

    public static class Cat extends Pet {
        
        public Cat (String name, int age) //Constructor
        {
            this.name = name;
            this.age = age;
        }
       
    }

    public static class Dog extends Pet {
        
        public Dog (String name, int age) //Constructor
        {
            this.name = name;
            this.age = age;
        }
    }   
}
