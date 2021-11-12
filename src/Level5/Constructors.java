/*

Using constructors instead of intialize.. simplified code. They don't have the void decleration.  

"It's easy to declare a constructor inside a class. A constructor is similar to the initialize method, with just two differences:

1. The name of a constructor is the same as the class name (instead of initialize).

2. A constructor has no type (no type is indicated)."

"OK, so it's like initialize, but with a few differences. I think I get it."


Create a Friend class with three constructors:
- Name
- Name, age
- Name, age, sex


My theory with constructors for as to why they can have the same name..
Each one passes diffrent variables so that makes them unqiue. The argument will only call on the constructor
that has the same number of variables as the argument itself. 
 
*/
package Level5;

/**
 *
 * @author Cam
 */

public class Constructors {
    
    public static void main(String[] args) {

    }
    
    public class Friends1 {

    public String name;
    public int age;
    public char sex;
    
   
    public Friends1(String name) //Constructors below 
    {
        this.name = name;
    }
    public Friends1(String name, int age) 
    {
        this.name = name;
        this.age = age;        
    }
    public Friends1(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    
  }
}
