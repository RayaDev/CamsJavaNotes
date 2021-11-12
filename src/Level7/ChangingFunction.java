/*

Task: The program takes in strings until the user enters an empty string (by pressing Enter). 
Then it converts the strings to uppercase ("mother" becomes "MOTHER") and displays them.

New task: The program takes in strings until the user enters an empty string (by pressing Enter).
Then the program builds a new list. If a string has an even number of letters, then the string is duplicated. 
If the number of letters is odd, then the string is repeated three times.
The program displays the contents of the new list.

 */
package Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

/**
 *
 * @author Cam
 */
public class ChangingFunction {

    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) 
        {
            String s = reader.readLine();
            if (s.isEmpty()) 
            {
                break;
            }
            list.add(s);
        }
        
        //oldFunction(list);
        list = newFunction(list);
        printList(list);


    }
    
    public static void oldFunction (ArrayList<String> list)
    {
        ArrayList<String> listUpperCase = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) 
        {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) 
        {
            System.out.println(listUpperCase.get(i));
        }
        
    }
    
    public static ArrayList<String> newFunction(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            String s1;
            String s = list.get(i);
            int count = countChar(s);
            
            if(count%2 == 0) 
            {
                s1 = s + " " + s;
            }
            else 
            {
                s1 = s + " " + s + " " + s;
            }
            
            newList.add(s1);
        }
        
        return newList;
    }
    
    public static int countChar(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!= ' ')
            {
                count++;
            }
        }
        
        return count;
                        
    }
    
    public static void printList(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
