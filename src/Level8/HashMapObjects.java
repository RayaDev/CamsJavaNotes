/*

There is a HashMap<String, Object>. 10 different object pairs have been added to it.
Display the contents of the collection, each element on a new line.

Example output: (here we just show one line):

Sim - 5
 */
package Level8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cam
 */
public class HashMapObjects {

    public static void main(String[] args) throws Exception 
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        printValues(map);

    }
    
    public static void printValues(Map<String, Object> map) 
    {
        for (Map.Entry<String, Object> pair : map.entrySet()) //What does this Entry method mean? Code gym article.. the " : " means for each
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    } 
}
