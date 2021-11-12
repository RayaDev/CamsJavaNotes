/*

Synchronized kind of has the same effect is join().

Bascially a thread occupies a method or variable, and doesn't let any other thread 
use that Object untill it is done. 


 */
package MethodNotes;

import static CamsUsefulMethods.printAll.printP;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cam
 */
public class ThreadSynchronized {

    public static void main(String[] args) throws InterruptedException
    {
        
        printP("Synchronized example: ");
        Box b = new Box(3,2,4);
        Thread t = new Thread(b);
        Thread t2 = new Thread(b);
        t.start();
        t2.start();
        t2.join(); //Waits for this thread test to finish before starting another. 
        
        printP("UnSynchronized example: ");
        Box1 b1 = new Box1(3,2,4);
        Thread t3 = new Thread(b1);
        Thread t4 = new Thread(b1);
        t3.start();
        t4.start();
         
        
        
    }
    
    //Synchronized Box class
    private static class Box implements Runnable
    {
        static int width;
        static int length;
        static int height;
        static int area;
        
        Box(int W, int L, int H)
        {
            this.width = W;
            this.length = L;
            this.height = H;
        }
        
        public static synchronized void getArea() throws InterruptedException
        {
            area = width * length * height;
            printP(Thread.currentThread().getName() + " is occupying the synchronized getArea()");
            Thread.currentThread().sleep(2000);
            printP(Thread.currentThread().getName() + " has finished calculating area.");
            printP(area);
        }

        @Override
        public void run() {
            try 
            {
                getArea();
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(ThreadSynchronized.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Unsychronized Box class
    private static class Box1 implements Runnable
    {
        static int width;
        static int length;
        static int height;
        static int area;
        
        Box1 (int W, int L, int H) //This instance of the class doesn't "contain" a getArea method. It still calls that from the parent class. 
        {
            this.width = W;
            this.length = L;
            this.height = H;
        }
        
        public static void getArea() throws InterruptedException //Multiple threads of the Box1 class are using this method at the same time.
        {
            area = width * length * height;
            printP(Thread.currentThread().getName() + " is occupying the unsynchronized getArea()");
            Thread.currentThread().sleep(2000);
            printP(Thread.currentThread().getName() + " has finished calculating area.");
            printP(area);
            
        }

        @Override
        public void run() {
            try 
            {
                getArea();
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(ThreadSynchronized.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
