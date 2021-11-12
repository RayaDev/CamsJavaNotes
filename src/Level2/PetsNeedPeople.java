/*
 Create Cat, Dog, Fish, and Woman objects.
Assign an owner to each animal.

Requirements:
The program should not display text on the screen.
In the main method, create Cat, Dog, Fish, and Woman objects, and store references to them in variables.
In the main method, set the Woman object as the owner of each animal.
The Cat, Dog, and Fish classes must have only one Woman variable named owner.
The Woman class must not have variables.
  

 */
package Level2;

/**
 *
 * @author Cam
 */

public class PetsNeedPeople {
    
    public static void main(String[] args) {
        Woman woman = new Woman();
        Cat cat = new Cat();
        Dog dog =  new Dog();
        Fish fish = new Fish();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    
    }

    public static class Fish {
        public Woman owner;
        
    }

    public static class Woman {
    }
}
