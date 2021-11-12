/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;

/**
 *
 * @author Cam
 */
public class Task_10_11 {
    public static void main(String[] args) 
    {
        String s = "I do not want to learn Java. I want a big salary";
        int i = 0;
        
        while(i<42)
        {      
            if (i%2 == 0)
            {             
                System.out.println(s.substring(0,48));        
                //System.out.println(s.substring(31,48));      
            }
        
            else
            {   
                System.out.println(s.substring(1,48));        
                //System.out.println(s.substring(31,48));       
            }
            
            i++;
        }
        
        System.out.println(i);
        
    }     
}

/* Codegym Solution

public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        char[] c = s.toCharArray();
        for(int i =0;i<43;i++)
        {
            for(int j=0+i; j<s.length(); j++)
            {
                System.out.print(c[j]);
            }System.out.println();
        }
    }
*/
