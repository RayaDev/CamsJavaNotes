/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level6;

/**
 *
 * @author Cam
 */
public class CatDogObjectsThousands {
    public static void main(String[] args) 
    {
        for (int i = 0; i < 50000; i++ ) 
        {
            Cat cat = new Cat();
            Dog1 dog = new Dog1();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog1 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }    
}
