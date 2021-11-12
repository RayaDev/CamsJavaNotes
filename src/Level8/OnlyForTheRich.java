/*

Create a Map<String, Integer> and add ten entries that represent (last name, salary) pairs.
Remove from the map all people whose salary is below 500.
 
*/
package Level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Cam
 */

/*
public class OnlyForTheRich {

    public static HashMap<String, Integer> createMap() 
    {
        HashMap<String, Integer> Memeber = new HashMap<>();
        Memeber.put("Name1", 4000);
        Memeber.put("Name2", 500);
        Memeber.put("Name3", 6000);
        Memeber.put("Name4", 7000);
        Memeber.put("Name5", 8000);
        
        Memeber.put("Name6", 400);
        Memeber.put("Name7", 4000);
        Memeber.put("Name8", 40);
        Memeber.put("Name9", 4000);
        Memeber.put("Name10", 4000);
        
        return Memeber;
        
        
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) 
    {
        Iterator ir = map.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)ir.next();
            Integer salary = (Integer) mapElement.getValue();
            String name = (String) mapElement.getKey();
            if (salary < 500)
            {
                map.remove(name);
            }
        }
    }

    public static void printMap(HashMap <String, Integer> map)
    {
        Set<Map.Entry<String, Integer>> map1 = map.entrySet();
        
        for (Map.Entry<String, Integer> s : map1)
        {
            System.out.println(s);
        } 
    }
    
    public static void main(String[] args) 
    {
        HashMap<String, Integer> Memebers = new HashMap<>();
        Memebers = createMap();
        System.out.println("Old Map");
        printMap(Memebers);
        removeItemFromMap(Memebers);
        System.out.println("New Map");
        printMap(Memebers);
    }    
}
*/

// Code Gym Solution

public class OnlyForTheRich {
    public static HashMap<String, Integer> createMap() {
       HashMap<String,Integer> map= new HashMap<>(); //write your code here
        map.put("Toscano",800);
        map.put("Flores",900);
        map.put("Lopez", 700);
        map.put("Maldonado", 800);
        map.put("Ceiz",400);
        map.put("Alonso",300);
        map.put("Dolores",700);
        map.put("Gonzaoles",600);
        map.put("Hidalgo",700);
        map.put("Francisca",800);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) 
    {
       HashMap<String,Integer> m = new HashMap<>(map); //write your code here
       Iterator<HashMap.Entry<String,Integer>>I= m.entrySet().iterator();
       
       while(I.hasNext())
        {
            Map.Entry<String,Integer> salary= I.next();
            if(salary.getValue()<500) 
            {
                map.remove(salary.getKey());
            }
        }
    }

    public static void printMap(HashMap <String, Integer> map)
    {
        Set<Map.Entry<String, Integer>> map1 = map.entrySet();
        
        for (Map.Entry<String, Integer> s : map1)
        {
            System.out.println(s);
        } 
    }
    
    
    public static void main(String[] args) 
    {
        HashMap<String, Integer> Memebers = new HashMap<>();
        Memebers = createMap();
        System.out.println("Old Map");
        printMap(Memebers);
        removeItemFromMap(Memebers);
        System.out.println("New Map");
        printMap(Memebers);  
    }
}
