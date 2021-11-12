/*


Orignal Solution to the task, however inefficient! Still good work. 
 */
package Level8;

import java.util.*;

public class Task_8_17_Orignal {
    public static void main(String[] args) 
    {
        HashMap<String, String> map = createMap();
        removeFirstNameDuplicates(map);
    } 
    
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap();
        
        //(Last, First)
        names.put("Cameron1","Woolf");
        names.put("Cameron2","Woolf");
        names.put("Cameron3","Woolf3");
        names.put("Cameron4","Woolf3");
        names.put("Cameron5","Woolf5");
        names.put("Cameron6","Woolf6");
        names.put("Cameron7","Woolf6");
        names.put("Cameron8","Woolf8");
        names.put("Cameron9","Woolf9");
        names.put("Cameron10","Woolf10");
        
        return names;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        
        //System.out.println("Orignal size: " + map.size());
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> dupes = new ArrayList<>();
        
        //creates a running list of values
        for (Map.Entry<String, String> pair : map.entrySet())  
        {
            String firstName = pair.getValue(); 
            firstNames.add(firstName);
            
        }
        
        
        
        for (Map.Entry<String, String> pair : map.entrySet()) 
        {                
            for (String name : firstNames) 
            {               
                if (pair.getValue().equals(name))
                {
                    dupes.add(name);              
                }
            }
        }
        
        
        Set<String> finalDupes = getRealDupes(dupes);
        
      /*  System.out.println("Orignal dupe list.....");
        for (String name : dupes)
        {
            
            System.out.println(name);
        } 
       
        
        
        System.out.println("Final dupe list");
        
        for (String dupe : finalDupes)
        {
            System.out.println(dupe);
        }
        */
        
      
        for (String dupe : finalDupes)
        {
                   
            removeItemFromMapByValue(map,dupe);
        }
    }
    
    public static Set<String> getRealDupes (ArrayList<String> dupes)
    {
           
        Set<String> uniqueSet = new HashSet<>();
        Set<String> dupesList = new HashSet<>();
        
        for (String a : dupes) {
            if (uniqueSet.contains(a)) 
            {
                dupesList.add(a);
            } 
            else 
            {
                uniqueSet.add(a);
            }
        }
        // System.out.println(uniqueSet.size() + " distinct words: " + uniqueSet);
        // System.out.println(dupesList.size() + " dupesList words: " + dupesList);
       
       
       return dupesList;
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) 
    {       
        HashMap<String, String> copy = new HashMap<String, String>(map);
        
        for (Map.Entry<String, String> pair : copy.entrySet()) 
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
           
    }
  
}


