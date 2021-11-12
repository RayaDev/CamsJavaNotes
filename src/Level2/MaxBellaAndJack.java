/*
More naming and delcaring objects and variables. Setting diffrent outputs.


class and file name have to match. The correct package has to be called.
So you could do a Lesson 2 package, and each file name has the task matching with the class.


.
 */
package Level2;

public class MaxBellaAndJack {
    
public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
        
        dog3.name= dog1.name;

        System.out.println(dog3.name);
        int var1 = dog3.name.compareTo(dog1.name);
        System.out.println(var1);
        
    //Experiments with setting outputs
    }

    public static class Dog {
        public String name;
    
    }
}
