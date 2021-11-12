/*
Using the Duck  class as a pattern, create Cat and Dog  classes.
What do you think the toString method in the Cat and Dog classes should return?
In the main method, create two objects of each class and display them on the screen.
Duck objects have already been created and are displayed on the screen

 */
package Level5;

/**
 *
 * @author Cam
 */
public class Duck1 {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog1);
        
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat1);

        //write your code here
    }

    public static class Duck 
    {
        public String toString() {
            return "Duck";
        }
    }
    
    public static class Dog 
    {
        public String toString() 
        {
            return "Dog";
        }
    }

    public static class Cat 
    {
        public String toString() 
        {
            return "Cat";
        }
    }
}
