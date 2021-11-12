/*
1. Inside the Solution class, create public static Man and Woman classes.
2. The classes must have the following fields: String name, int age, String address.
3. Make constructors that have all possible parameters.
4. Create two objects of each class with complete data using a constructor.
5. Display the objects on the screen in this format: name + " " + age + " " + address
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class ClassAndConstructors {
    
    public static void main(String[] args) 
    {
       
        Man /*object type */ man /*variable name */ = new Man /*Constructor*/("Test");
        
        Man man1 = new Man("Cam", 30, "Christchurch");
        Man man2 = new Man("Clem", 28, "Christchurch");
        Woman woman1 = new Woman("Lexi", 23, "Christchurch" );
        Woman woman2 = new Woman("Clara", 28, "Christchurch");
        
        System.out.println(man);
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }
    public static class Man 
    {
        public String name;
        public int age;
        public String address;
        
        public Man (String name)
        {
            this.name = name;
        }
        public Man (String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Man (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address; 
        }
        
        public String toString() //overriding the toString() method, which is called from println, but when called on an object returns gibberish.  
        {
        return name + " "+ age + " " + address;
        }
    }
    public static class Woman 
    {
        public String name;
        public int age;
        public String address;
    
        public Woman (String name)
        {
            this.name = name;
        }
        public Woman (String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Woman (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address; 
        }   
        
        public String toString()
        {//overriding the toString() method  
        return name + " "+ age + " " + address;
        }
    }

}
