/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cam
 */
public class Task16_03 {
    
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread st = new SpecialThread();
        SpecialThread st1 = new SpecialThread();
        SpecialThread st2 = new SpecialThread();
        SpecialThread st3 = new SpecialThread();
        SpecialThread st4 = new SpecialThread();
        
        Thread t = new Thread(st);
        Thread t1 = new Thread(st1);
        Thread t2 = new Thread(st2);
        Thread t3 = new Thread(st3);
        Thread t4 = new Thread(st4);
        
        list.add(t);
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        
        for (Thread T : list)
        {
            System.out.println("Thread object: " + T);
            T.run();
            System.out.println("");
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }   
}
