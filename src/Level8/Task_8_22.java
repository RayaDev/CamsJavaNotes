/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Task_8_22 {
   /* public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        
        int min = array.get(0);
        
        for(int i = 0; i < array.size()-1; i++)
        {
            if (array.get(i) < min)
            {
                min = array.get(i);
            }
      
        }
        
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
       
        
        System.out.println("How many numbers do you want to enter?");
        int i = sc.nextInt();
        
        while (numbers.size() < i)
        {
           int j = sc.nextInt();
           numbers.add(j);
           
        }
        
        
        return numbers;
    }    
} */

//Code gym Solution

public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array)
    {
        // Find the minimum here
        int i = array.indexOf(Collections.min(array));
        Integer min = array.get(i);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        // Create and initialize a list here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> totatlList = new ArrayList<Integer>();
        String s = reader.readLine();
        int x = Integer.parseInt(s);

        for (int i = 0; i < x; i++)
        {
            s = reader.readLine();
            int y = Integer.parseInt(s);
            totatlList.add(y);
        }
        return totatlList;
    }
}
