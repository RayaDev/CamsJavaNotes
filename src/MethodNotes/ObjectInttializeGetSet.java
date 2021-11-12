/*


***Illustrates getting, setting, and intilizing class objects and reference variables***
 
Private modifiers means only that class can have access to it.. Still need to understand more public vs private 

*/
package MethodNotes;

public class ObjectInttializeGetSet {
    
    public static void main(String[] args) {
        Person person = new Person(); //creates a new object and stores in in the person variable
        person.initialize("Cam", 30);  //Calls the initialize method below, pass arguments and sets those variables
        
        System.out.println(person.getName()); //returns the variable name. 
        
        person.name = "Don"; //I'd like to have it so that you can only set the name with the setName function.
        System.out.println(person.name); 
        
        person.setName("Ryan");
        System.out.println(person.name);
        
    }
    

    public static class Person {   
        private String name;
        private int age;
        
        private void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        private String getName(){
            return this.name;
        } 
        private void setName(String name) {
            this.name = name;
        }

    }   
}
      

