/*
 Simple and clean solution. I coulda thought of this lol... but I didn't..
 */
package Level7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class LongestString2 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        strings = new ArrayList<String>();

        for(int i=0;i<5;i++){
            String s = br.readLine();
            strings.add(s);
            
        }
        int max=0;
        
        for(int j=0;j<strings.size();j++){
            
            if(strings.get(j).length()>max){
                max = strings.get(j).length();
            }
            
        }
        
        for(String s : strings)
        {
            if(s.length() == max)
            {
                System.out.println(s);
            }
        }
        
    }
}
