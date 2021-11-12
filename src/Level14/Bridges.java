/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14;

/**
 *
 * @author Cam
 */
public class Bridges {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }
    
    public static void println (Bridge bridge)
    {
        System.out.println(bridge.getCarsCount());
    }
    
    
    interface Bridge {
        int getCarsCount();
    }
    
    
    static class WaterBridge implements Bridge {

        @Override
        public int getCarsCount() 
        {
            int carCount = 10;
            return carCount;
        }
    
    }
    
    static class SuspensionBridge implements Bridge {

        @Override
        public int getCarsCount() 
        {
            int carCount = 20;
            return carCount;
        }
        
    }
}
