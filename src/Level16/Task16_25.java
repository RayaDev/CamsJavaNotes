/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level16;

/**
 *
 * @author Cam
 */
public class Task16_25 {
    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
       /* t1.start();
        t2.start();
        //t2.interrupt();
        //t1.interrupt();*/
       
       t1.start();
       t1.join();
        t2.start();
       t2.join();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                //t1.interrupt();
                t2.join();               
                System.out.println("T1 finished");
            } catch (InterruptedException e) {
                System.out.println("T1 was interrupted");
               // t2.run();
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                
                t1.join();
                //t1.interrupt();
                System.out.println("T2 finished");
               // t2.interrupt();
            } catch (InterruptedException e) {
                System.out.println("T2 was interrupted");
            }
        }
    }   
}
