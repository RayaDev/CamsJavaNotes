/*
Orignally Task 8_17

Experimenting around with the Set problem and solving duplicate lists. 

This program

Gets all the values from a Set, and sorts them into Sets containing unique and duplicate values of the orignal Set. 

 */
package MethodNotes;


import java.util.*; //Java catch all import. Not always a good thing. 

/**
 *
 * @author Cam
 */
public class SortDuplicateStrings {
    
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
        
        
        ArrayList<String> firstNames = new ArrayList<>();
        
        
        Set <String> dupes1 = new HashSet<>(); 
        Set <String> dupes2 = new HashSet<>(); 

        /*  
            Even when you create a Set, It doesn't solve the orignal problem. Just creates
            An oringal dupeList with no dupes. Just removes all the extra... 
        
            Working though with Sets to try and Solve this more easily. 
            Try iterators? Do we need more tools? \
            
        
            Sets don't allow dupes. "Sort" the values into unique and duplicate Sets.  
            Nope! Solved! 
        
        */
        
        //creates a running list of values from the List firstNames, which is a collection of values from Set names.  
        
        for (Map.Entry<String, String> pair : map.entrySet()) // creates a variable for each key : value pair for each key in map with entrySet()
        {
            String firstName = pair.getValue(); //So in this cases, simply gets the value from the pair object. 
            firstNames.add(firstName);
            
        }
                
        
        for (Map.Entry<String, String> pair : map.entrySet()) 
        {                
                         
            String firstName = pair.getValue();
                
            boolean test = dupes1.add(firstName);
                    
            System.out.println(test);
            System.out.println(dupes1.size());
                    
                    
            if (test == false) //Check if add to Set was successfull, if not, add it to a Seperate set that is the real dupes!!
            {
                dupes2.add(firstName);
                System.out.println(firstName + "added to dupes2");
            }
                    
        }
                             
        
        System.out.println("Orignal list....");
        printList(firstNames);
        
        System.out.println("dupes 1 Set....Removed all duplicates.");
        printSet(dupes1);
        
        System.out.println("dupes 2 Set.....Contains all duplicates");
        printSet(dupes2);      
     
    }  
        
    public static void printSet (Set<String> set)
    {
        for (String s : set)
        {
            System.out.println(s);
        }
    }
    
    public static void printList(ArrayList<String> list)
    {
        for (String s : list)
        {
            System.out.println(s);
        }
    }
    
}








        
    
        
      
