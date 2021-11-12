/*
With the compareTo() method, Java will return 0, if the strings are literally equal, 
or a positive or negative number if they are not.
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class StringMethods2 {
    
    static String dogname = "Steve"; //Resets the name in the method. 
    public static void main(String args[]) {
     CompareToLiteral();  
     CompareToObject();  
     System.out.println(dogname);
 
    }
    public static void CompareToLiteral(){
    String str1 = "Karl";
    String str2 = "Karl";
    String str3 = "Cam";
    int var1 = str1.compareTo(str2);
    int var2 = str2.compareTo(str3);
    System.out.println(var1);
    System.out.println(var2);
    
    }
    // CompareToObject is trickey.. but it sorta works?
    public static void CompareToObject(){
    
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
        
        dog3.name= dog1.name;
        
        int var1 = dog3.name.compareTo(dog1.name);
       
        System.out.println(var1);
        
        dogname = dog3.name;
 
    }

    public static class Dog {
        public String name;
    
    }
}

    



