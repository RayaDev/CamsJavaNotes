/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cam
 */
public class Task16_07 {
    
    public static void main(String[] args) throws InterruptedException 
    {
        List<Horse> horses = prepareHorsesAndStart(10);
        
        while (calculateHorsesFinished(horses) != horses.size()) 
        {
          //Keeps the program in an infinite loop while finishedCount is not equal to horse count. 
        
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException 
    {
        int finishedCount = 0;

        for (int i = 0;i< horses.size();i++){
            if (horses.get(i).isFinished()){
                finishedCount++;
                //System.out.println(horses.get(i).getName() + " has finished the race!");
            }
            else {
                System.out.println("Waiting for " + horses.get(i).getName());
                horses.get(i).join();
            }
        }

        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) 
    {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        
        for (int i = 1; i < horseCount + 1; i++) 
        {
            number = i < 10 ? ("0" + i) : "" + i;
                horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) 
        {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread 
    {

        private boolean isFinished;

        public Horse(String name) 
        {
            super(name);
        }

        public boolean isFinished() 
        {
            return isFinished;
        }

        public void run() 
        {
            String s = "";
            for (int i = 0; i < 1001; i++) // Delay
            {   
                s += "" + i;
                if (i == 1000) 
                {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
