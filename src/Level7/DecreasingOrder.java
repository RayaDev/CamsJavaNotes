/*
Task: Write a program that reads 20 numbers from the keyboard and displays them in decreasing order.

Becoming trickier than I thought on my own... 


Could just call a java sort method, then reverse the sorted list. But I want to see the code that makes that work. 
 
*/
package Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class DecreasingOrder {

private static ArrayList <Integer> list1 = new ArrayList <>();
private static ArrayList <Integer> sorted = new ArrayList <>();
    
public static void main(String[] args) throws IOException 
    {
                            
        Input();
        //Sort();
        PrintList(list1);
        
        System.out.println("");
        System.out.println("____________________");
        System.out.println("");
        
       PrintList(sorted);
           
    }
    
    public static void Input()
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        for (int i = 0; i < 20; i++)
        {
            int num = r.nextInt(50);
           // int num = sc.nextInt();
         
           list1.add(num);
        }            
    }  
    
    public static void Sort()
    {
        
       /* Find the max and add it to a new array, remove it from the old
        and then find the max again of the old array, add that to the next spot in the new. Use a list. 
        */
                
       
        for (int i = 0; i < list1.size(); i++)
        {
            if (list1.get(0) < list1.get(1))
            {
                int max = list1.get(1);
                sorted.add(max);
                list1.remove(max);              
            }
            else 
            {
                int max = list1.get(0);
                sorted.add(max);
                list1.remove(max);
            }           
        }            
    }
    
    public static void PrintList(ArrayList<Integer> List)
    {
      
        for (int i = 0; i< List.size(); i++)
        {
            System.out.println(List.get(i));
        }
    }
}
