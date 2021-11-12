/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Task_9_21 {
    public static void main(String[] args) 
    {
        readData();
    }

    public static void readData() 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nList = new ArrayList<Integer>();
        
        try
        {
            while(true)
            {
                int x = sc.nextInt();
                nList.add(x);
            }
        }
        catch(Exception e)
        {
            for (int list: nList){
                System.out.println(list);
            }        
        }
    }   
}
