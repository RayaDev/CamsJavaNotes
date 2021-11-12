/*
1. Read 10 words from the keyboard and add them to a list of strings.

2. The doubleValues method should duplicate words like this:
alpha, beta, gamma, -> alpha, alpha, beta, beta, gamma, gamma.
3. Display the result, each value on a new line.
 */
package MakeMoreEfficient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class DuplicatingWords {

    private static ArrayList<String> list = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
              
        ArrayList<String> list1 = list;
        
        Input();
        ArrayList<String> result = doubleValues(list1);
        
        printResult(result);
        

    }

    private static void Input() 
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++)
        {
            String s = sc.nextLine();
            list.add(s);
           
            // list.add(0,s); adds the elements to the begining of the list with that 0. 
        }
    }   
     
    private static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i < 20 ; i++)
        {
            
            list.add(i+1, list.get(i));
            
            
        }
        
        return list;
    } 
    
    private static void printResult(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i ++)
        {
            System.out.println(list.get(i));
        }
    } 
}


/*  Code Gym Solution



public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String>list = new ArrayList<String>();
 for(int i=0;i<10;i++){list.add(reader.readLine());}
        ArrayList<String> result = doubleValues(list);
         for(int i = 0;i<result.size();i++){System.out.println(result.get(i)); }
             
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i=0;i<list.size();i+=2)
        {
            list.add(i+1,list.get(i));
        }
        return list;
    }
}
*/
