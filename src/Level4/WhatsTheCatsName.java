/*
 Help the cat get a name using the setName method.

Requirements:
•	The Cat class must contain only one variable called name.
•	The variable name must be a String and have a private access modifier.
•	The Cat class must have only two methods: setName and main.
•	The Cat class's setName method must set the value of the private String variable name equal to the passed String argument name.
 */
package Level4;

/**
 *
 * @author Cam
 */
public class WhatsTheCatsName {
      private String name = "nameless cat";

    public void setName(String name1) {
        name = name1;    
    }

    public static void main(String[] args) {
        WhatsTheCatsName cat = new WhatsTheCatsName();
        cat.setName("Simba");
        System.out.println(cat.name);
    }
}
