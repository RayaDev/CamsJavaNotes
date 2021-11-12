/*
Override the getChild method in the Cat and Dog classes 
so that cats give birth to cats and dogs to dogs.\

Good example of object overrides, and how objects call inherit classes, ect. 
 */

package Level12;

/**
 *
 * @author Cam
 */
public class CatDogBirths {

    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Cat getChild() //Can be a Cat or Pet object, same function. 
        {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() //Can be a Pet or Dog object, same function. 
        {
            return new Dog();
        }
    }
}  

