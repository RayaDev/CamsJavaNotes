/*
Measure how long it takes to perform 10,000 get and set calls on each list.
The getGetTimeInMs method must return its execution time in milliseconds.
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
public class TenKcalls {
    public static void main(String[] args) 
    {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) 
    {
        for (int i = 0; i < 10000; i++) 
        {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) 
    {
        // write your code here
        Date stime = new Date();
        
        get10000(list);

        Date etime = new Date();
        long runtime = etime.getTime() - stime.getTime();
        
        return runtime;
    }
    
    public static void get10000(List list) {
        if (list.isEmpty()) 
        {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
