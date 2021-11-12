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
public class NewFunctions {
   public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly 
    {
        public void fly();
    }

    public static class Horse 
    {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly
    {

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    } 
}
