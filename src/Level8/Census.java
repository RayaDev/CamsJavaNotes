/*
Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Check how many people have the same first name or last name.
 */
package Level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Cam
 */
public class Census {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> Census = new HashMap<String, String>();
        Census.put("Woolf","Ryan");
        Census.put("Woolf2", "Pat");
        Census.put("Woolf3","Don");
        Census.put("Woolf4","Don");
        Census.put("Gray1","Luz");
        Census.put("Gray2","Gary");
        Census.put("Cooney1","Frank");
        Census.put("Cooney2","Rose");
        Census.put("Woolf5","Ann");
        Census.put("Herdon", "Brian");
        return Census;
    }

    public static int getCountSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for(String n : map.values())
            if(n.equals(name))
                i++;
        return i;
    }

    public static int getCountSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for(String n : map.keySet())
            if(n.equals(lastName))
                i++;
        return i;
    }

    public static void main(String[] args) 
    {
        
        HashMap <String, String > Census = createMap();
        
        for (Map.Entry<String, String> map: Census.entrySet())
        {
            
            String firstName = map.getValue();
            System.out.println(firstName);
            int firstname = getCountSameFirstName(Census, map.getValue());
            System.out.println(firstname);
        
            String lastName = map.getKey();
            System.out.println(lastName);
            int lastname = getCountSameLastName(Census, map.getKey());
            System.out.println(lastname); 
        }
        
    }
}


/*

Census.put("Woolf","Cameron");
        Census.put("Woolf","Ryan");
        Census.put("Woolf", "Pat");
        Census.put("Woolf","Don");
        Census.put("Woolf","Don");
        Census.put("Gray","Luz");
        Census.put("Gray","Gary");
        Census.put("Cooney","Frank");
        Census.put("Cooney","Rose");
        Census.put("Woolf","Ann");

Code gym Solution

public static HashMap<String, String> createMap() {
        HashMap<String, String> Map = new HashMap<String, String>();
        Map.put("kekSurname3", "kekName1");
        Map.put("kekSurname2", "kekName3");
        Map.put("kekSurnamfe3", "kekName3");
        Map.put("kekSurdname", "kekName");
        Map.put("kekSusrname5", "kekName5");
        Map.put("kekSuvrname", "kekName");
        Map.put("kekSucrname", "kekName");
        Map.put("kekSudrname8", "kekName8");
        Map.put("keksSurname", "kekName");
        Map.put("kehkSurname", "kekName");
        return Map;
    }

    public static int getCountSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for(String n : map.values())
            if(n.equals(name))
                i++;
        return i;
    }

    public static int getCountSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for(String n : map.keySet())
            if(n.equals(lastName))
                i++;
        return i;
    }

    public static void main(String[] args) {

    }
*/