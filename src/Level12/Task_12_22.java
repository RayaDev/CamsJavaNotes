/*
Override the Cat class's setName method so that the following message is displayed:

"I'm a cat".
 */
package Level12;

/**
 *
 * @author Cam
 */
public class Task_12_22 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("I'm Fluffy");

        System.out.println(pet.getName());
    }  
    
    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        
        @Override
        public void setName(String name)
        {
            this.name = "I'm a cat";
        }

    }
}
