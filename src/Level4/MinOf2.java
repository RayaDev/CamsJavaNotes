/*
Pretty clean mininum program...
 */
package Level4;

import java.io.*;
public class MinOf2 {
        
        public static  int m1 = 0;
        
        public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String a = reader.readLine(); 
        int a1 = Integer.parseInt(a);          
      
         String b = reader.readLine(); 
        int b1 = Integer.parseInt(b);
        
        System.out.println(Min(a1,b1));
        
        }
        public static int Min(int a1, int b1) {
     
        if (a1 <= b1){
            m1 = a1; 
        }
        else if (a1 > b1){
            m1 = b1;
        }
        return m1;       
    }
}


