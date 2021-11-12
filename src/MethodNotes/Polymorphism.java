/*

Polymorphism is the ability to work with several types as if they were the same type. 
Moreover, the objects' behavior will be different depending on their type.

 */
package MethodNotes;


public class Polymorphism {
    

    public static void main(String[] args) 
    {

        Dolittle dolittle = new Dolittle();

        Lion simba = new Lion();
        Tiger shereKhan = new Tiger();
        Cheetah chester = new Cheetah();

        dolittle.healCat(simba);
        dolittle.healCat(shereKhan);
        dolittle.healCat(chester);
    }

    
public static class Dolittle 
{
    public void healCat(Cat cat) //The handling of the Cat object works for all classes that extend Cat. 
    {

       System.out.println("The patient is healthy!");
       cat.run(); //Calls the run method for the object passed into the method. 
    }
    
    /* 
    The healCat() method can accept Lion, Tiger, and Cheetah objects — they're all instances of Cat:
    
    So our Dolittle class works with different types as if they were the same type. 

    Now let's tackle the second part: "moreover, the objects' behavior will be different depending on their type".
    
    Polymorphism does more than just let us use different types as one. 
    It also lets us remember their differences, preserving the behavior specific to each of them. 
    */
}
        
public static class Cat 
{
    public void run() 
    {
        System.out.println("Run!");
    }
}
    
public static class Lion extends Cat 
{

    @Override
    public void run() 
    {
       System.out.println("Lion runs at 80 km/h");
    }
}

public static class Tiger extends Cat 
{

    @Override
    public void run() 
    {
        System.out.println("Tiger runs at 60 km/h");
    }
}

public static class Cheetah extends Cat 
{

    @Override
    public void run() 
    {
        System.out.println("Cheetah runs at up to 120 km/h");
    }
}



}
