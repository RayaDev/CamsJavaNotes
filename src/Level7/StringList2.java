/*
1. Create a list of strings in the main method.
2. Add 10 strings to it from the keyboard, but only add them to the beginning of the list, not the end.
3. Use a loop to display the contents, each value on a new line.

 */
package Level7;

/**
 *
 * @author Cam
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringList2{
 
    public static void main(String[] args) throws Exception 
    {
             
        ArrayList<String> list = new ArrayList<>();
          
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            String s = sc.nextLine();
            list.add(0,s);
        } 
        //System.out.println(list.size());
        
        for (int i = 0; i < list.size();i++)
        {
           int j = list.size() - i -1; //Prints in reverse order. Not sure what the -1 has to do with anything. Ohh becuase listsize - 0  doesnt have a refernece. 
           System.out.println(list.get(j));
        }
    }    
}

