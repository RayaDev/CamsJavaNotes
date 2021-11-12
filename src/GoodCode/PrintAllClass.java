/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author Cam
 */
public class PrintAllClass {
    public static void main(String[] args)
    {
      /* ArrayList<Object> list = buildObjList();
       for (Object obj : list)
       {
           printAll(obj);
       }*/
    }
    
    public static void printAll(Object obj)
    {
        
       // System.out.println(obj.getClass().toString());
        
        if(obj instanceof HashMap)
        {
            //System.out.println("HashMap found.");
            HashMap<Object, Object> testMap = (HashMap)obj;                    
            for(Map.Entry<Object, Object> pair : testMap.entrySet())
            {
                Object k = pair.getKey();
                Object v = pair.getValue();
                System.out.println("Key: " + k + ", Value: " + v);                  
            }   
        }    
        
        if(obj instanceof ArrayList)
        {
            //System.out.println("ArrayList found");
            ArrayList<Object> testList = (ArrayList)obj;
            
            for(Object o : testList)
            {
                System.out.println(o);
            }
        }
        
        if(obj instanceof Object[])
        {
            //System.out.println("Object[] found");         
            Object[] testArray = (Object[]) obj;
            
            for(int i = 0; i < testArray.length; i++)
            {
               System.out.println(testArray[i]);
            }
        }
        
        else
        {
        System.out.println(obj);
        }
        
    }
    
   /* public static ArrayList<Object> buildObjList()
    {
        
        ArrayList<Object> objList = new ArrayList<>();
        
        String s = "test";
        int i = 1;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ha", 1);
        
        int[] sArray = new int[3];
        sArray[0]=1;
        sArray[1]=2;
        sArray[2]=3;
        
        
        objList.add(s);
        objList.add(i);
        objList.add(map);
        objList.add(sArray);
        
        return objList;
        
    } */
}
