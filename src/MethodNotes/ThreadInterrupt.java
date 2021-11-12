/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cam
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException
    {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt(); //Stops the thread through its own methods, but looks like you do so through exception handling. 
    }    
    
    
    static class Clock implements Runnable
    {
        public void run()
        {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted())
            {
                try 
                {
                    Thread.sleep(1000);
                    System.out.println("Tick");
                } 
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(ThreadInterrupt.class.getName()).log(Level.SEVERE, null, ex);
                    //break;
                    //Looks like you still need to break statement here or else it just keeps running. 
                    
                }
            }
        }
    }   
}
