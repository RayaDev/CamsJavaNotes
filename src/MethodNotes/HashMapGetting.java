/*

This is really good example code!!

 */
package MethodNotes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class HashMapGetting {
    public static void main(String[] args) 
    { 
        HashMap <String, Integer> test = new HashMap<>();
       
        test = Input(test);
           
        GettingValues(test);
        System.out.println(" ");
        
        GettingKeys(test);
        System.out.println(" ");
        
        System.out.println(" ");
        Iterators(test);
       
    }
    
    private static HashMap<String, Integer> Input (HashMap< String, Integer> map)
    {
        HashMap <String, Integer> rollCall = new HashMap<>();
        rollCall.put("Cam", 30);
        rollCall.put("Ryan", 29);
        rollCall.put("Aaron", 30);
        rollCall.put("Pat", 29);
        
        return rollCall;
        
    }
    
    private static void GettingValues (HashMap < String, Integer > map)
    {
        
        String name = "Cam";       
        int age = map.get(name);
        
        System.out.println("Getting just the value associated with a unique key: " + name);
        System.out.println(" ");
        System.out.println(age);     
        
    }
    
    private static void GettingKeys (HashMap < String, Integer > map)
    {
                
        System.out.println("Getting all the keys associated with a value");
        System.out.println(" ");
        
        Set<Entry<String, Integer>> keys = map.entrySet();
        
        int age = 30;
        
        for (Entry<String, Integer> value : map.entrySet()) {
            
            if (value.getValue().equals(age)) {  //Just plug in the value you want to check for here.  
                
                System.out.println("Key with age " + age + ": " + value.getKey());
            }
        }
        
        //Prints all key value maps
        /* for (Map.Entry<String, Integer> s : keys)
        {
            System.out.println(s);
        } */
    }
    
    private static void Iterators(HashMap <String, Integer > map)
    {
        
        System.out.println("Iterating through all the keys and values.");
        System.out.println(" ");
        
        Iterator ir = map.entrySet().iterator();
        while (ir.hasNext())
        {
            Entry mapElement = (Entry)ir.next(); //gets the mapElement String:Integer from the HashMap
            int age = (int)mapElement.getValue(); //gets the specific value of the got mapElemenet, and casts it to an int
            String name = (String)mapElement.getKey(); //gets the specific key of the got maElemenet. 
            
            System.out.println("Name: " + name + " Age: " + age);
        }
    }
    
}
