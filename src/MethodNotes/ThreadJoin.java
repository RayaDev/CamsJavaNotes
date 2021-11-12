/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import static GoodCode.PrintAllClass.printAll;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Cam
 */
public class ThreadJoin {
   
    public static void main(String[] args) throws InterruptedException
    {
        JoinTest j = new JoinTest("Thread 1");
        JoinTest j2 = new JoinTest("Thread 2");
        JoinTest j3 = new JoinTest("Thread 3");
        
        Thread t = new Thread(j);
        Thread t2 = new Thread(j2);
        Thread t3 = new Thread(j3);
             
        allAtOnce(t,t2,t3);
        
        //joinTesting(t,t2,t3);
     
        
      
    }  
    
public static void allAtOnce(Thread t, Thread t2, Thread t3)
{
    //******
        //Basic start function on Threads
        System.out.println("************");
        System.out.println("All at once:");
        t.start();
        t2.start();
        t3.start();
        //*********** 
}
    
public static void joinTesting(Thread t, Thread t2, Thread t3)
{
    //Join method below, all threads wait to finish, then start a new one. 
    
    System.out.println("****************");
    System.out.println("Join method below");
       
    try{   
        t.start();
        t.join();
        
        t2.start();
        t2.join();
        
        t3.start();
        t3.join(); 
        
    }
    catch(Exception e)
    {
        printAll(e);
    }
}
    
public static class JoinTest implements Runnable
{
    String name;
    
    public JoinTest(String name)
    {
        this.name = name;
    }

        @Override 
        public void run() {
             pause(this.name);
             System.out.println(this.name + " finished running");
        }
        
    }

    public static void pause(String name)
    {
        
        int randomInt = ThreadLocalRandom.current().nextInt(1000, 9000);
        
        try
        {
        Thread.sleep(randomInt);
        }
        catch (Exception e)
        {
            
        }
        
        System.out.println("Thread " + name + " paused for " + randomInt + " mili sec");      
        
    }
    

}
