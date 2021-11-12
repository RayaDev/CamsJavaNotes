/*

Experimenting with threads inside threads... 

 */
package MethodNotes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Cam
 */
public class ThreadMegaThread {
   
    public static void main(String[] args) throws InterruptedException
    {
                   
        Thread FTStart = new Thread(startTest()); 
        Thread FTJoin = new Thread(joinTest());
        
        System.out.println("Starting FTStart");
        FTStart.start();
        FTStart.join();
        
        System.out.println("Starting FTJoin");
        FTJoin.start();
        FTJoin.join();
       
        /* FinalThread FT = new FinalThread(FTStart, FTJoin);
        
        Thread runFT = new Thread(FT);
        
        runFT.start();*/
           
    }  
       
    public static Thread startTest()
    {
        JoinTest j = new JoinTest("TS 1");
        JoinTest j2 = new JoinTest("TS 2");
        JoinTest j3 = new JoinTest("TS 3");
        
        Thread t = new Thread(j);
        Thread t2 = new Thread(j2);
        Thread t3 = new Thread(j3);
        
        megaThreadStart megaTest = new megaThreadStart(t,t2,t3);
        Thread MT_Start = new Thread(megaTest);
        
        return MT_Start;
       /* System.out.println("");
        System.out.println("Begin startTest()");
        
        MT_Start.start();
          
        System.out.println("End startTest()");
        System.out.println(""); */
        
        
    }

    public static Thread joinTest()
    {
        JoinTest j = new JoinTest("TJ 1");
        JoinTest j2 = new JoinTest("TJ 2");
        JoinTest j3 = new JoinTest("TJ 3");
        
        Thread t = new Thread(j);
        Thread t2 = new Thread(j2);
        Thread t3 = new Thread(j3);
        
        
        megaThreadJoin megaTestJ = new megaThreadJoin(t,t2,t3);
        Thread MT_Join = new Thread(megaTestJ);
        
        return MT_Join;
        /*System.out.println("");
        System.out.println("Begin joinTest()");
       
        MT_Join.start();
        
        System.out.println("");
        System.out.println("End joinTest()"); */
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
    
public static class megaThreadStart extends Thread //Its a thread with in a thread...  (doesnt work with Runnable interface?)
{
    Thread t;
    Thread t1;
    Thread t2;
    ;
    
    public megaThreadStart(Thread t, Thread t1, Thread t2)
    {
        this.t = t;
        this.t1 = t1;
        this.t2 = t2;
       
                       
    }

    @Override
    public void run() 
    {
        
        System.out.println("");
        System.out.println("Begin megaThreadStart run()");
        t.start();
        t1.start();
        t2.start();
        
        
        System.out.println("End megaThreadStart run()");
        System.out.println("");
    }   
}

public static class megaThreadJoin implements Runnable //Its a thread with in a thread... 
{
    Thread t;
    Thread t1;
    Thread t2;
    
    public megaThreadJoin(Thread t, Thread t1, Thread t2)
    {
        this.t = t;
        this.t1 = t1;
        this.t2 = t2;
                       
    }

    @Override
    public void run() 
    {
         System.out.println("");
        System.out.println("Begin megaThreadJoin run()");
        try{
        t.start();
        t.join();
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        
         System.out.println("");
        System.out.println("End megaThreadJoin run()");
    }   
}

public static class FinalThread implements Runnable 
{
    Thread t;
    Thread t1;
    
    
    public FinalThread(Thread t, Thread t1)
    {
        this.t = t;
        this.t1 = t1;
        
                       
    }

    @Override
    public void run() 
    {
        
        System.out.println("");
        System.out.println("Begin finalThread run()");
        t.start();
        t1.start();
      
        
        System.out.println("End finalThread run()");
        System.out.println("");
    }  
       
    
}

}
