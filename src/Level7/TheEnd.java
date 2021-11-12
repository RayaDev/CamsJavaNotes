/*

Create a list of strings.
Enter strings from the keyboard and add them to the list.
Enter strings from the keyboard until the user enters "end". The string "end" is ignored.
Display the strings on the screen, each on a new line.

*/
package Level7;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TheEnd {
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> List = new ArrayList<>();
        
        Input(List);
        Print(List);
    
    }
    
    public static void Input(ArrayList<String> list)
    {
        Scanner sc = new Scanner(System.in);
        
        int r = 1;
        while (r==1)
        {
            String s  = sc.nextLine();
            list.add(s);
            
            if (s.contains("end"))
            {
                r = 0;
                list.remove(s);
            }
            else
            {
                continue;
            }
        }
    }
    
    public static void Print(ArrayList<String> list)
    {
       
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        
        /* for (String x : list) 
        {
            System.out.println(x);
        } */  //This a a nice compact way to iterate and print from a list.
    }
           
}
