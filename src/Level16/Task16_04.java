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
public class Task16_04 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        
    }   
    
    public static class SpecialThread implements Runnable
    {

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        }
        
    }
    
    
}
