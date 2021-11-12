/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cam
 */
public class Task_10_20 {
 public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            //array[i] = Integer.parseInt(reader.readLine());
            array[i] = i * 234;
        }

        sort(array);
        //showSmallest(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        boolean sorted = false;
        int temp;
        
        while(!sorted) 
        {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) 
            {
                if (array[i] > array[i+1]) 
                {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = false;
                }
            }
        }
    }  
    
   /* public static void showSmallest(int[] array)
    {
        int tenth = array[9];
        int eleven = array[10];
        
        System.out.println("The 10th smallest is " + tenth);
        System.out.println("The 11th smallest is " + eleven);
        
    }*/
}
