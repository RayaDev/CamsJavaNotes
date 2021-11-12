/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Cam
 */
public class Task_10_19 {
    public static void main(String[] args) throws IOException {
        
        HashMap<String, Integer> idMap = buildIdMap();
        printHashMap(idMap);
                     
    }    
    
    public static HashMap<String, Integer> buildIdMap () throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, Integer> idMap = new HashMap<>();
                
        while(true)
        {           
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine(); 
            
            String idCheck = Integer.toString(id);
            if (name.isEmpty() || idCheck.isEmpty())
            {
                return idMap;
            }
            
            idMap.put(name, id);
                   
        }
                          
        //return idMap;        
    }
    
    public static void printHashMap(HashMap<String, Integer> map)
    {
        for (HashMap.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

/*

CodeGym Solution

 public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        while(true) {
            int id;
            String s = "";
            s = reader.readLine();

            if(s == ""){ //or s.isEmpty()
                break;
            }

            try {
            id = Integer.parseInt(s);
            }

            catch (NumberFormatException e){
                break;
            }
            String name = "";
            name = reader.readLine();

            if (name == ""){
                break;
            }

            map.put(name,id);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    }


And another

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String name;
        Integer num;

        while(true)
        {
            String s = reader.readLine();

            if(s.isEmpty())  break;

            num = Integer.parseInt(s);
            name = reader.readLine();

            if(!map.containsValue(name))
                map.put(name, num);
        }

        for(Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
*/
