/*
Read 5 words from the keyboard and add them to a list of strings. 
Remove the 3rd item in the list, and then display the remaining items in reverse order.
 */
package Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {
     
private static ArrayList<String> list = new ArrayList<>(); 

    public static void main(String[] args) throws Exception 
    {
        
        ArrayList<String> list1 = list; //Might get around that stupid Code Gym requirment. 
        Input();     
        RemoveAndPrint(list1);
    }
    
    private static void Input() 
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++)
        {
            String s = sc.nextLine();
            list.add(s);
            // list.add(0,s); adds the elements to the begining of the list with that 0. 
        }
    }
    
    private static void RemoveAndPrint(ArrayList<String> list)
    {
        list.remove(2);
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i -1;
            System.out.println(list.get(j));
        }
    }
}
