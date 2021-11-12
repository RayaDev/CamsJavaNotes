/*
CanFly, CanRun, and CanSwim for the Duck, Penguin, and Toad classes
 */
package Level12;

/**
 *
 * @author Cam
 */
public class Task_12_27 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        
        public void fly();
    }

    public interface CanRun {
        public void run();
       
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanSwim, CanRun, CanFly
    {

        @Override
        public void swim() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public class Penguin implements CanSwim, CanRun {

        @Override
        public void swim() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public class Toad implements CanSwim{

        @Override
        public void swim() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }    
}
