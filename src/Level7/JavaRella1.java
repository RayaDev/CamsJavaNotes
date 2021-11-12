/*
I believe the problem is not the code but the way this code is checked by Codegym tool . 
So ideally what you can do is move all the code in the initialize() and sortList() 
into the main method and do the ArrayList initializations with a new keyword. That should solve your problem
 */
package Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaRella1 {
     public static void main(String[] args) throws Exception {
        
        Scanner input;
        ArrayList<Integer> inputArr = new ArrayList<Integer>();
        ArrayList<Integer> oddArr = new ArrayList<Integer>();
        ArrayList<Integer> evenArr = new ArrayList<Integer>();
        ArrayList<Integer> anotherArr = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            input = new Scanner(System.in);


        inputArr.add(input.nextInt());
        }
        
        // write your code here

        for (int i = 0; i < 20; i++) {
            if ((inputArr.get(i) % 2 == 0)) {
                evenArr.add(inputArr.get(i));
                if((inputArr.get(i) % 3 == 0)){
                    oddArr.add(inputArr.get(i));
                }
            }  
              else if ((inputArr.get(i) % 3 == 0)) {
                oddArr.add(inputArr.get(i));
            } else anotherArr.add(inputArr.get(i));
        }
        
        printList(oddArr);
        printList(evenArr);
        printList(anotherArr);
    }

    public static void printList(List<Integer> list) {
        
        
        for (Integer x : list) {
            System.out.println(x);
        }
        
    }
}