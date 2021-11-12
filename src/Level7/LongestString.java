/*
1. Initialize the list of strings.
2. Read 5 strings from the keyboard and add them to this list.
3. Using a loop, find the longest string in the list.
4. Display the string. If there is more than one, display each on a new line.

 */
package Level7;

/* import java.util.ArrayList;
import java.util.Scanner;

public class LongestString {

private static final ArrayList<String> list = new ArrayList<>();

public static void main(String[] args) throws Exception 
    {             
        Input();
        String L = Longest(); 
        System.out.println(L);
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
    
    private static String Longest()
    {
        
        String L1= list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            
            String L2 = list.get(i);
            if (L2.length() > L1.length()) 
            {
                L1 = L2;
            }
            else 
            {
                L1 = L1;
            } 
        }
        return L1;       
    }
} */


import java.io.BufferedReader;                                                                                                                                                                                                                                                                                                                                                              
import java.io.InputStreamReader;                                                                                                                                                                                                                                                                                                                                                              
import java.util.ArrayList;                                                                                                                                                                                                                                                                                                                                                              
import java.util.List;                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                              
public class LongestString {                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                              
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));                                                                                                                                                                                                                                                                                              
    public static void main(String[] args) throws Exception {                                                                                                                                                                                                                                                                                                                                                              
      List<String> strings;   
      strings = new ArrayList<String>();        
      int max=0;
     
          String name1 = reader.readLine() ; 
          strings.add(name1) ; 
          
          String name2 = reader.readLine() ; 
          strings.add(name2) ; 
          
          String name3 = reader.readLine() ; 
          strings.add(name3) ; 
          
          String name4 = reader.readLine() ; 
          strings.add(name4) ; 
          
          String name5 = reader.readLine() ; 
          strings.add(name5) ; 
          
          for ( int i = 0 ; i < strings.size(); i++) 
          {
              if ( strings.get(i).length() > max )
              max = strings.get(i).length() ;
          }
          
               for ( int j = 0 ; j < strings.size(); j++) 
          {
              if ( strings.get(j).length() == max )
              System.out.println( strings.get(j));
          }
       
    }                                                                                                                                                                                                                                                                                                            
}