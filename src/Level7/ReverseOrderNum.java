/*
Enter 10 numbers from the keyboard and put them in a list.
Display them in reverse order. Each element on a new line.
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
public class ReverseOrderNum {

    public static void main(String[] args) throws IOException 
    {  
        ArrayList <Integer> list = new ArrayList<>();       
        
        initializeArray(list);
        printList(list);
        
        
    }  

        public static ArrayList<Integer> initializeArray(ArrayList <Integer> list) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        //Random rand = new Random();
        
       /* System.out.println("How big do you want the range to be? ");
        System.out.println("Note: Zero is included in the range. So for a range of 10, enter 11. ");
        int r = sc.nextInt(); */
        
        for (int i = 0; i < 10; i++)
        {
            int n = sc.nextInt();
           // int n = rand.nextInt(r);
            list.add(n);
           
        }
        
        return list;
    }
        
     public static void printList(ArrayList<Integer> list)
     {
            
         for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i -1;
            System.out.println(list.get(j));
        }
         
       /* list.forEach((num) -> {
             System.out.println(num);  //Intresting sytax here for print a list
        }); */
     }
}
