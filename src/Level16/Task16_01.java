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
public class Task16_01 {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }    
    
    public static class TestThread implements Runnable
    {

        @Override
        public void run() 
        {
            System.out.println("My first thread");
        }
        
    }
}
