/*
There is a Cat class with a String variablename.
Create a Map<String, Cat> and add 10 cats represented by (name, Cat) pairs.
Get a Set of all cats from the Map and display it on the screen.

 */
package Level9;

/**
 *
 * @author Cam
 */
import java.util.*;

public class Task_9_27 {

      public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> catMap = new HashMap<>();
        catMap.put("1", new Cat("1"));
        catMap.put("2", new Cat("2"));
        catMap.put("3", new Cat("3"));
        catMap.put("4", new Cat("4"));
        catMap.put("5", new Cat("5"));
        catMap.put("6", new Cat("6"));
        catMap.put("7", new Cat("7"));
        catMap.put("8", new Cat("8"));
        catMap.put("9", new Cat("9"));
        catMap.put("10", new Cat("10"));
        
        return catMap;
        
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>();
        for(Map.Entry<String, Cat> entry : map.entrySet())
        {
            Cat cat = entry.getValue();
            catSet.add(cat);
        }
        
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
