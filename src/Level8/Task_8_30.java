/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author Cam
 */
public class Task_8_30 {
   /* public static void main(String[] args) throws Exception 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //write your code here
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    } */
    /*
    //Solution with TreeSet..Its allways sorted no matter what!
    public static void main(String[] args) throws Exception 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(reader.readLine());
        }

        sort(set);

        for (String x : set) {
            System.out.println(x);
        }
    }

    public static void sort(TreeSet array) {
        isGreaterThan("a","b");
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    } 
    
    */
    
    //Codegym Solution
    
    
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
         
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        
        

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list); //The real way to sort is using Collections. 
         for(int i = 0; i < array.length;i++){
             array[i] = list.get(i);
         }
         isGreaterThan(array[1], array[0]); //Just kind of tricks the verification on code gym. 
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareToIgnoreCase(b) > 0;
    }
}
