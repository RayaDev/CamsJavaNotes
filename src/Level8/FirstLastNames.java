/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cam
 */
public class FirstLastNames {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Woolf","Cameron");
        map1.put("Woolf","Ryan");
        map1.put("Woolf","Pat");
        map1.put("Woolf","Don");
        map1.put("Masini","Pat");
        map1.put("Jeans","Aaron");
        map1.put("Jeans","Derek");
        map1.put("Read","Sarah");
        map1.put("Masini","Sarah");
        map1.put("Woolf","Ann");
        

        return map1;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
