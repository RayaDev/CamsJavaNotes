/*
1. Create a list of strings.
2. Add 5 strings from the keyboard.
3. Do the following 13 times: remove the last string and insert it at the beginning.
4. Use a loop to display the resulting list, each value on a new line.

 */
package Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAndInsert {

//private static ArrayList<String> list = new ArrayList<>();
    
   /* public static void main(String[] args) throws Exception 
    {             
        Input();
        InsertAndRemove();
        Print();                
    }
    
    private static void Input()
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++)
        {
            String s = sc.nextLine();
            list.add(s);
        }
    }
    
    private static void InsertAndRemove()
    {
        int x = 0;
        while (x < 12) 
        {        
            for (int i = list.size(); i > 0; i--)
            {            
            String s = list.get(i-1);
            list.add(0, s);
            }            
            x++;
        }
    }
    
    private static void Print()
    {
        for (int i = 0; i < list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
} */

//Here's the solution. Way too complicated up top per usual lol.    
    
public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<5; i++){
           list.add(sc.nextLine());
       }
       for(int i=0; i<13; i++){
           String temp = null;
           temp = list.get(list.size()-1);
           list.add(0, temp);
           list.remove(list.size()-1);
           
       }
        for (int i = 0; i <list.size(); i++){
            System.out.println(list.get(i) );
            }
    } 
}