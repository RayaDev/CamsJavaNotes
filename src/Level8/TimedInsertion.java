/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class TimedInsertion {
    public static void main(String[] args) 
    {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) 
    {
        // write your code here
        Date stime = new Date();
        insert10000(list);
        Date etime = new Date();
        long runtime = etime.getTime() - stime.getTime();

        return runtime;

    }

    public static void insert10000(List list) 
    {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }    
}
