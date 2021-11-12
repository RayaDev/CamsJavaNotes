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
public class DisplayValue {

    public static void main(String[] args) throws Exception 
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Sim", "Sim"); // Value, Key
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) 
    {
        for (Map.Entry<String, String> pair : map.entrySet()) //What does this Entry method mean?
        {
            System.out.println(pair.getValue());
        }
    }    
}
