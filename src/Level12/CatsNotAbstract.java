/*
 
Abstract classes are wierd... 

 */
package Level12;

/**
 *
 * @author Cam
 */
public class CatsNotAbstract {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        
        public abstract String getName();
   

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        
        @Override
        public String getName()
        {
            String name = "Jimbo";
            return name; 
        }

        @Override
        public Pet getChild() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Pet getChild() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }   
}
