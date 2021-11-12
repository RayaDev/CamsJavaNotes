/*
Create Dog, Cat, and Mouse classes.
Add three fields of your choice to each class.
Create objects for the characters in the cartoon "Tom and Jerry".
You'll recall there are quite a few.

For example:
Mouse jerryMouse = new Mouse("Jerry", 5, 2),
where 5 is the height in inches,
and 2 is the length of his tail in inches.
 */
package Level5;

/**
 *
 * @author Cam
 */
public class DogCatMouse {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 36, 15);
        Dog spikeDog = new Dog("Spike", 72, 30);
        
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    
    public static class Cat
    {
        String name;
        int height;
        int tail;
        
        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            
        }
             
    }
    public static class Dog 
    {
        String name;
        int height;
        int tail;
        
        public Dog (String name, int height, int tail) 
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            
        }
    }

   
}
