/*
There is a Cat class with a String name.
Create a HashMap<String, Cat>.
Add 10 cats to the collection. The cat's name should be used as the key.
Display the result on the screen, each element on a new line.
 */
package Level8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cam
 */
public class HashMapCat {
    public static void main(String[] args) throws Exception 
    {
        String[] cats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};
        
        
       
        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) 
    {
        HashMap<String, Cat> map2 = new HashMap<>();
        for(int i = 0; i < cats.length; i++){
            
            map2.put(cats[i], new Cat(cats[i])); //Key: Value
        }
        return map2;
          
    }


    public static class Cat 
    {
        String name;       

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        } 
    }
}    
