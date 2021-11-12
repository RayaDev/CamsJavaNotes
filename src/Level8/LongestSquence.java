/*
1. Create a list of numbers.
2. Use the keyboard to add 10 numbers to the list.
3. Display the length of the longest sequence of repeating numbers in the list.
 */
package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class LongestSquence {

    public static void main(String[] args) throws IOException 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Input(list);
        int numCount = Count(list);
        System.out.println(numCount);

    }
    
    public static void Input(ArrayList<Integer> list)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            int num = sc.nextInt();
            list.add(i , num);
        }
    }
    
    public static int Count(ArrayList<Integer> list)
    {
        
       /* Doing it my way!
        Pass each element of the list into the keys of a hashmap.
        Compare the element of the list with the key of the hashmap
        if element list element == hash map key
        add it to the value side of a hash map.
        Would work for any collection of numbers. 
        
        Book marked a stack overflow article about this problem. As applies to
        a hashmap of strings though. 
        
        */
        
        int maxCount = 0;
        return maxCount;
    }
}


/*

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


Longest sequence

Solution found in the codeGym comments. 


public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //In the main method, declare an ArrayList variable with Integer elements and immediately initialize it.
        ArrayList<Integer> list = new ArrayList<>();

        // inserting 10 numbers into list
        for (int i = 0; i < 10; i++) {
            Integer n = Integer.parseInt(br.readLine());
            list.add(n);
        }


        int counterA = 1;       // counter set to 1 (we start counting sequence at 1)
        int counterB = 0;       // in this variable we later save longest sequence

        for (int i = 0; i < list.size()-1; i++) {    // repeat until list.size() - 1 because in next line we get numbers from current index i + 1
            if (list.get(i).equals(list.get(i + 1))) // use equals for numbers > 127
                counterA++;                          //if 2 numbers are in sequence increase counter by 1
            else {
                    if (counterA >= counterB)       // check if current sequence is bigger than last
                    counterB = counterA;            // save the biggest sequence in variable counterB
                    counterA = 1;                   // reset the counter

            }



        }

        if (counterA>counterB) {   //we put this statement to check if last numbers from the list are in the biggest sequence ( because in if statement above you don't save it in counterB variable)
            counterB = counterA;

        }

        System.out.println(counterB);

    }

}
*/