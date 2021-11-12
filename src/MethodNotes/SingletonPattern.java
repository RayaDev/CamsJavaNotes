/*

Singleton pattern restricts the instantiation of a class and ensures that 
only one instance of the class exists in the java virtual machine.

The singleton class must provide a global access point to get the instance of the class.

Singleton pattern is used for logging, drivers objects, caching and thread pool.

Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.

Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class SingletonPattern {
    
    public static void main (String[] args)
    {
        
    }
 
/* 
In Eager initialization, the instance of Singleton Class is created at the time of class loading, 
this is the easiest method to create a singleton class 
but it has a drawback that instance is created even though client application might not be using it.
*/    
    
    
public static class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

/*
Static block initialization implementation is similar to eager initialization, 
except that instance of class is created in the static block that provides option for exception handling.
*/

public static class StaticBlockSingleton {

    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}


/*
The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, 
it can cause issues if multiple threads are inside the if condition at the same time. 
It will destroy the singleton pattern and both threads will get the different instances of the singleton class. 
In next section, we will see different ways to create a thread-safe singleton class.

*/

public static class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
//There are like 6 more ways to impement a singleton pattern. See bookmakred resource.   
}
