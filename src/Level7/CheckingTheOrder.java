/*
1. Read 10 words from the keyboard and add them to a list of strings.
2. Determine whether the list is ordered by increasing string length.
3. If it is not, then display the index of the first element that violates this order.

 */
package Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckingTheOrder {
    
    public static void main(String[] args) throws IOException {
                
        ArrayList<String> list = new ArrayList<>();
        Input(list);
        CheckOrder(list);
                
    }
    
    private static void Input(ArrayList<String> list)
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++)
        {
            String s = sc.nextLine();
            list.add(s);
        }
    }
    
    private static void CheckOrder(ArrayList<String> list)
    {
        //String check = list.get(0);
        
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            String s1 = list.get(i+1);
            
            if ( s.length() > s1.length())
            {
                System.out.println(s1);
                System.out.println(i+1);
                break;                                
            }
        }
    }
}
