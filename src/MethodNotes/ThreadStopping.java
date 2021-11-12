/*

To stop a thread you must do so indirectly through other varables. Only the Thread can stop itself directly. 

This can also be accomplished by a thread calling its own interupt() method. 


 */
package MethodNotes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cam
 */
public class ThreadStopping {
    
    static class Clock implements Runnable
    {
        public void run()
        {
            while (true)
            {
                try 
                {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(ThreadStopping.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Tick");

                if (!ClockManager.isClockRun) //This one stops the thread. 
                return;
            }
        }
    }  
    
    static class ClockManager
    {
        public static boolean isClockRun = true;
        
        public static void main(String[] args) throws InterruptedException //The main still works since it's statically attached to the main ThreadStopping class.. odd. 
        {
            Clock clock = new Clock();
            Thread clockThread = new Thread(clock);
            clockThread.start();

            Thread.sleep(10000);
            isClockRun = false; //This send the command for the thread to stop itself. 
        }

    }
}
