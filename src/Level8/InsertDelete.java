/*
•	The program should not display text on the screen.
•	The program should not read values from the keyboard.
•	The Solution class must contain only 5 methods.
•	The insert10000(List list) method must insert 10,000 items into the list.
•	The get10000(List list) method should call get 10,000 times on the list.
•	The set10000(List list) method should call set 10,000 times on the list.
•	The remove10000(List list) method must remove 10,000 items from the list.
 */
package Level8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cam
 */
public class InsertDelete {
    public static void main(String[] args) throws Exception 
    {
        // ArrayList
        Date stime = new Date();
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);
        Date etime = new Date();
        long runtime = etime.getTime() - stime.getTime();
        System.out.println("ArrayList run time = " + runtime + " milliseconds"); 

        // LinkedList
        Date stime1 = new Date();
        LinkedList linkedList = new LinkedList(); 
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        Date etime1 = new Date();
        long runtime1 = etime1.getTime() - stime1.getTime();
        System.out.println("LinkedList run time = " + runtime1 + " milliseconds"); 
    }

    public static void insert10000(List list) 
    {
        for (int i = 0; i < 10000; i++) 
        {
            list.add(0, new Object());
        }

    }

    private static void get10000(List list) 
    {
        for (int i = 0; i < 10000; i++) 
        {
            list.get(i);
        }

    }

    public static void set10000(List list) 
    {
        for (int i = 0; i < 10000; i++) 
        {
            String s1 = "Set";
            Object s = new Object();
            list.set(i, s1);
        }
    }

    public static void remove10000(List list) 
    {
        for (int i = 0; i < list.size();) 
        {
            Object o = list.get(i);
            list.remove(o);
        }
    }

}
