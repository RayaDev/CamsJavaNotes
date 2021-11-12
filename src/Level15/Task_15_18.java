/*
Static modifiers and kittens

 1. In the Solution class, create a Cat class with a public String field name.
2. In the static block, create a Cat object and assign it to the variable cat (don't forget to initialize the field name).
3. In the Cat class, don't create constructors with parameters.
4. In the static block, display the created cat's name on the screen.

Requirements:
•	The Cat class must be inside the Solution class and must be public and static.
•	The Cat class must have a public String field name.
•	The variable cat must be initialized in the static block of the Solution class.
•	In the static block, the created cat's name should be displayed on the screen.
•	The Cat class must not have constructors with parameters.

 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_18 {
     public static Cat cat;
    static{
        cat = new Cat();
        cat.name = "Fluffy";
        System.out.println(Task_15_18.cat.name);
    }

    public static void main(String[] args){

    }

    public static class Cat {
        public String name;
    }
}
