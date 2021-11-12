/*
In the Cat class, create a static public int variable catCount.
Declare a constructor, i.e. public Cat(). Each time a cat (new Cat object) is created, 
increase the static variable catCount by 1. 
Create 10 Cat objects and display the value of the variable catCount on the screen.
 */
package Level6;

/**
 *
 * @author Cam
 */
public class CatAndStats {


public static void main(String[] args) {
      
        for (int i = 0; i <10; i++) 
        {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
        
    }

    public static class Cat {
        public static int catCount;
           
        public Cat() 
        {
           catCount++;
        }
    }    
}
