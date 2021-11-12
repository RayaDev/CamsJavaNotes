/*
1. Figure out how the program works.
1.1. Note that the Water object is the same for all the threads.
2. Implement the ourInterrupt() method so that it interrupts all threads in the threads list.
3. Correct the values ​​of the variables in the run() method:
3.1. isCurrentThreadInterrupted must be the same as the value of the isInterrupted() method for the current thread.
3.2. threadName must be the same as the value of the getName() method (implemented in the Thread class) for the current thread.
 */
package Level16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cam
 */
public class Task16_20 {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        for(Thread t : threads)
        {
            t.interrupt();
        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try 
            {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Object " + sharedResource + ", thread " + threadName);
                    Thread.sleep(1000);
                }
            } 
            catch (InterruptedException e) 
            {
                
            }
        }
    }    
}
