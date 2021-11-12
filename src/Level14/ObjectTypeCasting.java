/*

Notes on widening and narrowing object types conversions. 

 */
package Level14;


public class ObjectTypeCasting {
   
    public static void main(String[] args) 
    {
        /*
        A Tiger object can always be assigned to a variable whose type is that of one of its ancestors. 
        For the Tiger class, these are Cat, Animal, and Object.
        */
        
        
        Tiger tiger = new Tiger();
        Cat cat = new Tiger();
        Animal animal = new Tiger();
        Object obj = new Tiger();    
        
        
        /*
        If an assignment operation causes us to move up the inheritance chain (toward the Object class), 
        then we're dealing with a narrowing conversion (also known as downcasting). 
        If we move down the chain toward the object's type, then it's a widening conversion (also known as upcasting).
        Moving up the inheritance chain is called widening (narrowing), because it leads to a more general type. 
        However, in doing so we lose the ability to invoke the methods added to the class through inheritance.
                
        When widening the type, you need to use a type conversion operator, i.e. we perform an explicit conversion.
        This causes the Java machine to check whether the object really inherits the type we want to convert it to.
       
        
        (Some confusion on narrowing and widening. I assume going from Tiger>> Cat >> Animal >> Object it narrowing as
        you lose access to methods.
        
        Widening would be Object >>  Animal >> Cat >> Tiger as you gain access to methods.)
        
        ***Okay okay so forget all this.. the basic idea is the going down the inhertiance tree towards a more specific object
        increasing access to methods, and going up the tree to the source Object class reduces access to methods.****
        
        Makes sense I mean your narrowing an Object down to a specific, but it increasing the number of methods that
        object can access. 
              
        */
        
        Object obj_1 = new Tiger();
        Animal animal_1 = (Animal) obj_1;
        Cat cat_1 = (Cat) obj_1;
        Tiger tiger1 = (Tiger) animal_1;
        Tiger tiger2 = (Tiger) cat_1;
        
        /*
        Here we have three assignment operations. All of them are examples of widening conversions.
        The type cast operator is not needed here, because no check is necessary. 
        An object reference can always be stored in a variable whose type is one of its ancestors.
        */
        
        Cat cat2 = new Tiger();
        Animal animal2 = cat;
        Object obj2 = cat;
        
    }
    
    public static  class Animal
    {
        public void doAnimalActions()
        {
            
        }
    }
    
    public static class Cat extends Animal
    {
        public void doCatActions()
        {
            
        }
    }
    
    public static class Tiger extends Cat
    {
        public void doTigerActions()
        {
            
        }
    }
}
