/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level12;

/**
 *
 * @author Cam
 */
public class AbstractHuman {
    
    public static void main(String[] args) 
    {

    }  
    
    interface CanRun
    {
        void run();
    }
    
    interface CanSwim
    {
        void swim();
    }
    
    public abstract class Human implements CanRun, CanSwim
    {
        
        @Override
        public void swim() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
