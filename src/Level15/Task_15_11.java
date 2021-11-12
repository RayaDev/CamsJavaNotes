/* The simplest code: part 1 
COMPLETED

Simplify the code: remove all inheritance and implementations that will be added automatically by the compiler
PS: The me and zapp objects have a has-a relationship: https://en.wikipedia.org/wiki/Has-a

Requirements:
•	The SpecificSerializable interface should extend the Serializable interface.
•	The JavaDev class must implement the SpecificSerializable interface.
•	The code should not have explicit inheritance involving the Object class (extends Object).
•	The JuniorJavaDev class should not explicitly inherit the SpecificSerializable interface.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_11 {
  /*  
    Orignal Code here. Java automatically adds all the extensions below 
    
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about com.codegym.task.task15.task1511?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev extends Object implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends Object, JavaDev implements SpecificSerializable {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }  */
    
public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about com.codegym.task.task15.task1511?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable  {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }  
}
