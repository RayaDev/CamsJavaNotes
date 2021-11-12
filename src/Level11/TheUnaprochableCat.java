/*

Hide all of the Cat class's internal variables 
as well as any methods capable of changing the internal state of Cat objects.
 
*/
package Level11;

/**
 *
 * @author Cam
 */
public class TheUnaprochableCat {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            
        }   
    }
}