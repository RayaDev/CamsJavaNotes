/*
Create a Cat class with five initializers:
- Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (unknown name, address and age, i.e. a homeless cat)
- Weight, color, address (someone else's pet)

The initializer's job is to make the object valid.
For example, if the weight is unknown, then you need to specify some average weight.
A cat can't weigh nothing.
The same applies to age and color.
But there may or may not be a name (i.e. name might be null).
The same applies to the address (it might be null).
 

Aprrently this one sucked so I just copied from the help board.. 

*/
package Level5;



public class Cat {
    
    private String name = null;
    private int weight = 15;
    private String color;
    private int age;
    private String address = null;
    
    public void initialize(String name)
    {
        this.name = name;
        this.age = 43;
        this.weight = 90;
        color = "Purple";
    }
    
      public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Black";
        
    }
    
     public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        weight = 20;
        color = "Green";
    }
    
     
     public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        age = 50;
    }
    
    
      public void initialize( int weight, String color, String address)
    {

        this.weight = weight;
        this.color = color;
        this.address = address;
        color = "Red";
        age = 45;
        
    }

    public static void main(String[] args) {



    }
    
}

    

