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
public class Task_12_21 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "I'm Fluffy";
        }
    }

    public static class Cat extends Pet 
    {
        @Override
        public String getName()
        {
            return "I'm a cat.";
        }
    }   
}
