/*
 Anything added to a string is converted to a string. 
 */
package MethodNotes;

/**
 *
 * @author Cam
 */

public class Concatenation {
    public static void main(String[] args) {
        int a = 5;
        Cat cat = new Cat();
        cat.name = "Simon";
        cat.age = 5;
        System.out.println("The cat is" + " " + cat.name + " " + "and" + " " + 
         cat.name + " " + "is" + " " + cat.age + a + " " + "Years old.");
    
    }
     public static class Cat {
        public String name;
        public int age;
        
    }
}
