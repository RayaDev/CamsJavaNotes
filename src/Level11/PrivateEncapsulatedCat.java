/*
Make all of the Cat class's internal variables private.
 */
package Level11;

/**
 *
 * @author Cam
 */
public class PrivateEncapsulatedCat {
    public static void main(String[] args) 
    {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }    
}
