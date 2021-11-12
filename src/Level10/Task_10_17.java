/*
Create a list of integers.
Enter 20 integers from the keyboard.
Create a method to safely retrieve numbers from the list:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
The method must return a list item based on its index.
If an exception occurs while retrieving an element, it must be caught, and the method should return defaultValue.

 */
package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class Task_10_17 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            //int x = i+10;
            list.add(x);
        }

        
        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try
        {
          int safeElemenent = list.get(index);
          return safeElemenent;
        }
        catch(Exception e)
        {
            return defaultValue;
        }
            
    }   
}
