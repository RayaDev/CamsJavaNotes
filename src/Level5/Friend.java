/*
Create the Friend class with three initializers (three initialize methods):
- Name
- Name, age
- Name, age, sex

Note:
name is a String, age is an int, and sex is a char.
 */
package Level5;

/**
 *
 * @author Cam
 */
public class Friend {

public String name;
public int age;
public char sex;
    
    public static void main(String[] args) {

    }
    public void initialize (String name) {
        this.name = name;
    }
    public void initialize (int age) {
        this.age = age;
    }
    public void initialize (char sex) {
        this.sex = sex;
    }
}
