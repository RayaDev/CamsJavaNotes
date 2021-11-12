/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class OOPAnimalInheritance {
    public static void main(String[] args) 
    {
        Goose g = new Goose();
        System.out.println(g.getSize());
        
        BigAnimal d  = new Dragon();
        Dragon d1 = new Dragon();
        BigAnimal a = new BigAnimal();
        
        System.out.println(a.getSize());
        System.out.println(d.getSize());
        System.out.println(d1.getSize()); 
    }
    
    
    public static class Goose extends SmallAnimal {
        @Override
        public String getSize()
        {
            return "A goose is small, " + super.getSize();
        }
    }
    
    public static class Dragon extends BigAnimal {
        
        @Override
        public String getSize()
        {
            return "A dragon is big, " + super.getSize();
        }
    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }
}
