/*
Create a HashSet with String elements.
Add 10 strings to it:
watermelon
banana
cherry
pear
cantaloupe
blackberry
ginseng
strawberry
iris
potato

Display the contents of the collection, each element on a new line.
Watch how the order of the entries has changed.
 */
package Level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class HashSetPlants {
    public static void main(String[] args) throws Exception {
        
        HashSet<String> set1 = new HashSet<>();
        
        Input(set1);
        Print(set1);       

    }
    
    private static void Input(HashSet<String> set)
    {
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");
    }
    
    private static void Print(Set<String> set)
    {
        /* Long hand for iterations. 
        
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String text = iterator.next();
            System.out.println(text);
        } 
        
        */ 
        
        for (String text : set)
        {   
            System.out.println(text);
        }
    }
}
