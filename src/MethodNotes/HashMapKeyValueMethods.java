/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class HashMapKeyValueMethods {

    public static void main(String[] args) 
    { 
        HashMap <String, String> test = new HashMap<>();
        Input(test);
        HashMapGetKeyValue(test);
       
    }
    
    private static HashMap<String, String> Input (HashMap<String, String> test1 )
    {
        test1.put("Hablar", "to talk");
        test1.put("Comer", "to eat");
        
        return test1;
    }
    
    private static void HashMapGetKeyValue(HashMap<String, String> test)
    {
        //Long hand for print all key:value pairs.
        
        for (HashMap.Entry<String, String> entry : test.entrySet()) //This is the perfered method! Use this wisely.. 
        {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key: " + k + ", Value: " + v);           
        } 
        // Getting a single value
        
        String k = test.get("Hablar");
        System.out.println(k);
        
        // Short had for print all key:value pairs.
        /*
        test.forEach((k, v) -> {
		System.out.println("Key: " + k + ", Value: " + v);
	});
        /*
        // Get all keys
        Set<String> keys = test.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k);
        }

        // Get all values
        Collection<String> values = test.values();
        for (String v : values) {
            System.out.println("Value: " + v);
        } */

    }
}
