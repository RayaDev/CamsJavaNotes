/*
1. Create a list of the words: "Sam", "I", "Am".
2. After each word, insert the word "Ham" into the list.
3. Display the result on the screen, each list element on a new line.
 */
package Level7;

import java.util.ArrayList;

/**
 *
 * @author Cam
 */
public class SamIAm {
    
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");
        
        list.add(1, "Ham");
        list.add(3, "Ham");
        list.add(5, "Ham");
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
