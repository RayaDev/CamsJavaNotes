/*
1. Create a list of strings.
2. Add 10 strings from the keyboard.
3. Find out which string occurs earlier in the list: the shortest or the longest.
If several strings are shortest or longest, then consider the very first such string encountered.
4. Display the string described in Step 3. One string should be displayed.


Solution. Not so complicated really. 
 */
package Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class ShortestOrLongest {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i =0;i<10;i++){

            strings.add(reader.readLine());
        }
        int m=strings.get(0).length();
     int n=strings.get(0).length();
     
     
     for(int i=0;i<10;i++)
     {
         int j=strings.get(i).length();
         if(j<n)
         n=j;
     }
     for(int i=0;i<10;i++)
     {
         int l=strings.get(i).length();
         if(l>m)
         m=l;
     }
     for(int i=0;i<10;i++)
     {
         int l=strings.get(i).length();
         if(l==m )
         {
             System.out.println(strings.get(i));
             break;
         }
         if(l==n)
         {
             System.out.println(strings.get(i));
             break;
         }

     }
    }
}
