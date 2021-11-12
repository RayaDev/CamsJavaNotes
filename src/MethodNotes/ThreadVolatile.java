/*

Main point is that threads can cache variables in their own local memory. They can still be using a variable
that has a diffrent state in shared ("slow") memory compared to its cache. 



 */
package MethodNotes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cam
 */
public class ThreadVolatile {
    public static void main(String[] args) throws InterruptedException
    {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start(); //
        
        Thread.sleep(5000);
        clock.cancel(); //But when you call if from here it changese the isCancel variable from a diffrent thread
        //The main thread is unaware that clockThread exists. 
    }
    
    public static class Clock implements Runnable
    {
        private boolean isCancel = false; //Declaring this variable stores it in the class cache
        /*
        
        The volatile modifier causes a variable to always be read from and written to normal memory shared by all threads.
        */

        public void cancel()
        {
            this.isCancel = true;
        }

        @Override
        public void run()
        {
            int tick = 0;
            while (!this.isCancel) //Rember for &, if one expresion returns false, the whole loop breaks. But for && both must true for it to keep running. Evauluates the second expresion only if the first is true. 
            //while(tick < 20)
            {
                try 
                {
                    Thread.sleep(1000);
                } 
                
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(ThreadVolatile.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Tick # " + tick);
                tick++;
            }
            
            System.out.println("We never made it to 20 ticks..");
        }
    }
}
