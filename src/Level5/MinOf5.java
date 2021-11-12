/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level5;

import java.util.Scanner;

public class MinOf5 {
    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] myArray = new int[size];
        
        
        for(int i=0; i<size; i++) 
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println(min(myArray));
    }
    
    public static int min(int [] array) 
    {
        int min = array[0];
   
        for(int i = 0; i<array.length; i++ ) {
            if(array[i]<min) {
            min = array[i];
            }
        }
        return min;
    } 
}

/* Code Gym solution...

package com.codegym.task.task05.task0531;

import java.io.InputStream;
import java.io.Reader;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
           int c = Integer.parseInt(reader.readLine());
   int d = Integer.parseInt(reader.readLine());
   int e = Integer.parseInt(reader.readLine());


        int minimum = min(a,b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b,int c,int d,int e) {
        int nummin=a;
        if(nummin>b)
        {
            nummin=b;
        }
        if(nummin>c)
        {
            nummin=c;
        }
        if(nummin>d)
        {
            nummin=d;
        }
        if(nummin>e)
        {
            nummin=e;
        }
       return nummin;
        
    }
}

*/