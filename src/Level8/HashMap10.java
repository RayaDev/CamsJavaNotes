/*
Create a HashMap<String, String>, and add 10 string pairs:
watermelon - melon,
banana - fruit,
cherry - fruit,
pear - fruit,
cantaloupe - melon,
blackberry - fruit,
ginseng - root,
strawberry - fruit,
iris - flower,
potato - tuber.
Display the contents of the collection, each element on a new line.
 */
package Level8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class HashMap10 {
    public static void main(String[] args) throws Exception {
        
        HashMap<String, String> map1 = new HashMap<>();
        
        Input(map1);
        Print(map1);       

    }
    
    private static void Input(HashMap <String, String> hmap)
    {
        hmap.put("watermelon","melon"); //("key","value")
        hmap.put("banana","fruit");
        hmap.put("cherry","fruit");
        hmap.put("pear","fruit");
        hmap.put("cantaloupe","melon");
        hmap.put("blackberry","fruit");
        hmap.put("ginseng","root");
        hmap.put("strawberry","fruit");
        hmap.put("iris","flower");
        hmap.put("potato ","tuber");
    }
    
    private static void Print(HashMap<String, String> map)
    {
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
        // Get a key-value pair
            HashMap.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            // Key
            String value = pair.getValue();        // Value
            System.out.println(key + " - " + value);
        }
        
        /* ShortHand
        
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      // Key
            String value = pair.getValue();                  // Value
            System.out.println(key + ":" + value);
        }
        
        */
    }
}
