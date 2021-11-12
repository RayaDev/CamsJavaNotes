/*
1. Create a list of strings.
2. Add 5 different strings to it.
3. Display its size on the screen.
4. Use a loop to display its contents, each value on a new line.

Note:
Add strings to the list only after the list is
 
ArrayLists have several advantages over Arrays
> Can change size
> Can add or delete elements with out leaving holes
> Does this by calling the specail ArrayList class in Java. 

*/
package MethodNotes;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListTemp{
 
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("A"); //Maunally adding to the end of the list.
        list.add(0,"B"); //Adds the the start of the list
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++)
        {
            String s = sc.nextLine();
            list.add(s);
            // list.add(0,s); adds the elements to the begining of the list with that 0. 
        }
        for (int i = 0; i < list.size();i++)
        {
           // int j = list.size() - i -1; //Prints in reverse order. Not sure what the -1 has to do with anything. Ohh becuase listsize - 0  doesnt have a refernece. 
            System.out.println(list.get(i)); //Displays in the right order. 
        }
    }    
}
