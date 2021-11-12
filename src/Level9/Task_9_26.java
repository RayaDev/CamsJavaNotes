/*
Create a list whose elements are arrays of numbers.
Add to the list five array objects whose lengths are 5, 2, 4, 7, and 0, respectively.
Fill the arrays with any data and display them on the screen.

 */
package Level9;

/**
 *
 * @author Cam
 */

import java.util.*;

public class Task_9_26 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        
        ArrayList<int[]> aList = new ArrayList<>();
        int[] a1 = new int[5];
        int[] a2 = new int[2];
        int[] a3 = new int[4];
        int[] a4 = new int[7];
        int[] a5 = new int[0];
        
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.add(a5);
        
        Random r = new Random();
        
        for(int[] a : aList)
        {
            int i = 0;
            while(i< a.length)
            {
                a[i] = r.nextInt(10);
                i++;
            }
                
        }
        
        return aList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }    
}
