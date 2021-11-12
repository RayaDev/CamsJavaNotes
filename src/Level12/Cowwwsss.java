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
public class Cowwwsss {
    public static void main(String[] args) 
    {

    }

    public static abstract class Animal 
    {
        public abstract String getName();
    }

    public static class Cow extends Animal
    {
        @Override
        public String getName()
        {
            String name = "Moocifur";
            return name;
            
        }
    }   
}
