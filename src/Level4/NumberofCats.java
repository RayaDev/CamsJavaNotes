/*
Write code to correctly count the number of cats created (count) and display the correct number of cats on the screen.

Requirements:
•	The program should display text on the screen.
•	Don't change the line responsible for screen output.
•	The Cat class must have only one count variable.
•	The Cat class's variable count must be a static int, have a public access modifier, and be initialized to zero.
•	The main method should have only two initialized Cat variables.
•	The variable count must store the actual number of cat objects created.
  

 */
package Level4;

/**
 *
 * @author Cam
 */
public class NumberofCats {
     public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.catcount(1);

        Cat cat2 = new Cat();
        cat2.catcount(1);

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
        
        public static void catcount(int count1){
        count = count + count1;

        }
    }
}

