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
public class ZomebieCatDog {
    
    public static void main(String[] args) {

    }
       protected void finalize() throws Throwable 
    {
         System.out.println("A Cat was destroyed.");
    }
}

class Dog {
         protected void finalize() throws Throwable 
    {
         System.out.println("A Dog was destroyed.");
    }
}
