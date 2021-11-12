/*
In the main method, create three Cat objects and fill them with data.
Use the Cat class from the first task. You don't need to create the Cat class.

Calls variables from another class. 
 */
package Level5;

/**
 *
 * @author Cam
 */
public class ThreeCats {
      public static void main(String[] args) {
        FightMethod cat1=new FightMethod("ada",21,33,11);
        FightMethod cat2=new FightMethod("sda",21,2,44);
        FightMethod cat3=new FightMethod("sqq",2,3,4);
    }

    public static class FightMethod {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public FightMethod(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
