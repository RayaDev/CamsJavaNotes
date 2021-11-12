/*
Use the keyboard to enter 2 numbers N and M.
Enter N strings and put them in a list.
Move the first M strings to the end of the list.
Display the list, each value on a new line.

Note:
you must not create more than one list.
 */
package GoodCode;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Shuffle {    
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How big do you want the list?");
        int N = sc.nextInt();
        
        System.out.println("Enter number of Strings to move");
        int M = sc.nextInt();
        
        System.out.println("Enter " + N + " Strings: ");
        Input(List, N);      
        
        System.out.println("Orignal List");      
        Print(List);
     
        Move(List, M);
        
        System.out.println(" ");
        System.out.println("First " + M + " elements move to the end of the list");
        System.out.println("Modified List: ");       
        Print(List);
               
    }
    
    public static void Input(ArrayList <String> list, int N)
    {
             
        Scanner sc = new Scanner(System.in);       
        
        for (int i = 0; i < N; i++)
        {          
            String s = sc.nextLine();
            list.add(s);             
        }
        
    }
    
    public static void Move(ArrayList <String> list, int M)
    {
        for (int i = 1; i <= M; i++)
        {
            int j = 0;
            String s = list.get(j);
            list.add(s);  
            list.remove(j);           
        }
    }
    
    public static void Print(ArrayList<String> list)
    {            
        for(int i = 0; i < list.size();i++)
        {
            System.out.println(list.get(i));
        }  
    }
}
