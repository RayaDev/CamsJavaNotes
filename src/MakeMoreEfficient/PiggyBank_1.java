/*
Use the keyboard to enter numbers and calculate their sum until the user enters the word "sum".
Display the resulting sum on the screen.

Hint: to read from the keyboard until the string 'exit' is input, do this:
 */
package MakeMoreEfficient;


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class PiggyBank_1 {
    
    public static boolean run = true;
    public static int sum = 0;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException  
    {
       
        
        int sum2 = sum1();
        if (sum2 != 0) 
        {
            System.out.println(sum2);
        }
        else 
        {
           System.exit(0); // exits the java machine at any point, returns 0 to the JM.
        }
            
    }
    
    public static int sum1 ()
    {      
            while (run == true) {
                String s = sc.nextLine();
                           
                if (s.equals("exit")) 
                {
                    break; //Ends the loop
               
                }
                if (s.equals("sum")) 
                {
                    //System.out.println(sum);
                    return sum;
                }
                else 
                {
                    int num = Integer.parseInt(s);
                    sum = sum + num;
                }             
            }  
        return 0;   
    }  
}


/* 

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer>list=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(true){
            String a=s.nextLine();
            if (a.equalsIgnoreCase("sum")){
                break;
            }
            list.add(Integer.parseInt(a));
        }
        for (int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
                
        System.out.println(sum);
                
    }
} 
*/
