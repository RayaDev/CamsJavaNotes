/*

Goal is to compare how long two threads take to populate a Set of random Strings, compared to one thread.
Definetly faster, but starts to loose effiecny after 4 or so threads. 


 */
package MethodNotes;

import static CamsUsefulMethods.buildRandom.alphabetArray;
import CamsUsefulMethods.printAll;
import static CamsUsefulMethods.printAll.printLM;
import static CamsUsefulMethods.printAll.printP;

import java.util.*;

public class ThreadSharedResources {
    
    private static ArrayList<String> randomSet = new ArrayList<>(); //The threads are sharing this list! 
    
    public static void main(String[] args) throws InterruptedException
    {
        boolean testDone = false;
        while(testDone == false)
        {
            testDone = singleThreadRun();
            printP("List size..." + randomSet.size());
            
        }
        
        randomSet.clear();
        
        multiThreadRun();
        printP("List size..." + randomSet.size());
             
      
    }
    
    
    public static boolean singleThreadRun() throws InterruptedException
    {
        stringWorker s1 = new stringWorker();             
        s1.start();
        s1.join();
        printP("Single string run time.." + s1.runTime);
        return true;
    }
    
    public static void multiThreadRun() throws InterruptedException
    {
        stringWorker s1 = new stringWorker();             
        s1.start();
        
        stringWorker s2 = new stringWorker();
        s2.start();
        //s2.join();
        
        stringWorker s3 = new stringWorker();
        s3.start();
        //s3.join();
        
        stringWorker s4 = new stringWorker();
        s4.start();
        s4.join();
        
        /*stringWorker s5 = new stringWorker();
        s5.start();
        s5.join();*/
        
        int mtRuntime = (s1.runTime + s2.runTime + s3.runTime + s4.runTime) / 4 ;
        printP("Multithread run time.." + mtRuntime); //Actually the real time would just be an average of the thread times. 
    }
    
    public static class stringWorker extends Thread
    {
        public static int runTime;
        
        @Override
        public void run()
        {           
            
            Date start = new Date();
            
                int i = 0;
                boolean sizeCheck = true;
                while(sizeCheck)
                {
                    sizeCheck = checkListSize();
                    randomSet.add(buildRandomString());
            
                    if(i%1000 == 0)
                    {
                        printP("Runninng..." + this.getName());
                    } 
                    i++;
                }           
            
            Date stop = new Date();       
            Date diff = new Date(stop.getTime() - start.getTime());       
            runTime = (int) diff.getTime();
            printP(this.getName() + " runtime = " + runTime);
            
            
            
        }
        
        
        public static String buildRandomString()
        {
            Random r = new Random();
            String s = "";
        
            for(int i = 0; i < 1000; i++)
            {
                char[] alphabet = alphabetArray();            
                int j = r.nextInt(alphabet.length);
                s += Character.toString(alphabet[j]);
            }
        
        return s;
        }
        
        public static boolean checkListSize()
        {
            if(randomSet.size() >= 10000)
            {
                return false;
            }
            
            else
            {
                return true;
            }
        }
    }
}
