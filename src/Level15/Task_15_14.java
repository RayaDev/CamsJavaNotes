/* 
COMPELETED

Static modifiers: part 1

In a static block, initialize labels with 5 different key-value pairs.

Requirements:
•	The Solution class must only have one method (main).
•	The Solution class should declare a static Map field labels.
•	The field labels must be populated with 5 different key-value pairs in a static block.
•	The main method should display the contents of labels.
 */
package Level15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Task_15_14 {
   
    
  public static Map<Double, String> labels = new HashMap<Double, String>();
  
  static 
  {
        labels.put(5d,"Adi");
        labels.put(1d,"Ram");
        labels.put(2d,"Mohan");
        labels.put(3d,"Ramesh");
        labels.put(4d,"Piko");
        System.out.println(labels);
    }

    public static void main(String[] args) {
     
    }   
    
    
    
    
    
    
  /*  
    public static Map<Double, Integer> labels = new HashMap<>();

    public static void main(String[] args) 
    {    
        createHashMap();
        System.out.println(labels);
        System.out.println(labels.size());
    } 
    //This wasn't even what the task was asking for lol 
    public static void createHashMap ()
    {
        Scanner sc = new Scanner(System.in);
        //Some wierd stuff with scanner was messing up the count. 
        double d;
        int label;         
        
        for (int i = 0; i < 5; i++)
        {
            
            System.out.println("Enter data:" + i);
           
           // Why doesn't this work?
            d = sc.nextDouble();
            label = i; //The issue was with nextLine()
           
          /* //But this order does?
           label = sc.next();
           d = sc.nextDouble();*/
           
        // labels.put(d, label);
         
         //sc = null;
            
      //  } 
        
        
   // } 
}
