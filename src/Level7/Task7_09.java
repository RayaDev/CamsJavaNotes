/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Task7_09 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = createStringList();             
        printShortestString(list);
    }    
    
    public static ArrayList<String> createStringList()
    {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        int i = 0;
        while (i < 5) 
        {
            String input = sc.nextLine();
            list.add(input);
            i++;
        }
        
        return list;
        
    }
    
    public static void printShortestString(ArrayList<String> list)
    {
        
        String firstString = list.get(0);
        int shortestLength = firstString.length();
        for (String s : list) //checks for shortest
        {
            int k = s.length();
            if (k < shortestLength) 
            {
                shortestLength = k;
            }
            
             
        }
        
        //System.out.println("The shortest string has length: " + shortestLength); //Practice using %formating.
        
        for (String s : list)
        {
            if (s.length() == shortestLength)
            {
                System.out.println(s);
            }
        }
    }
}
