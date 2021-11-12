/*
Override the getName method in the Whale class so that the program 
doesn't display anything on the screen.
 */
package Level12;

/**
 *
 * @author Cam
 */
public class WhalesDescendentsCows {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm a cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() 
        {
            return "";
        }
    }    
}
