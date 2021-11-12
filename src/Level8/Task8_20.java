/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class Task8_20 {
 public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++)
        {
            Cat cat = new Cat();
            result.add(cat);
        }
        //System.out.println(result.size());
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();
        
        for (int i = 0; i < 3; i++)
        {
            Dog dog = new Dog();
            result.add(dog);
        }
        //System.out.println(result.size());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();
        for (Cat c : cats)
        {
            pets.add(c);            
        }
        for (Dog d : dogs)
        {
            pets.add(d);
        }
        //System.out.println(pets.size());
        
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       /* //Concurrent Exception problem
        Iterator<Object> it = pets.iterator();
        while (it.hasNext())
        {
            Object pet = 
            for (Cat cat : cats)
            {
                if(pet.equals(cat))
                {
                    pets.remove(pet);
                }               
            }
        } */
       System.out.println(pets.size());
       for (Cat cat : cats)
       {
           pets.remove(cat);
       }
       
    /*   for (Object pet : pets)
       {
           if (pet instanceof Cat)
           {
               pets.remove(pet);
           }
       } */
        
        System.out.println(pets.size());
     
    }

 
    public static void printPets(Set<Object> pets) {
        for (Object pet : pets)
        {
            System.out.println(pet);
        }
    }

public static class Cat {
    
}

public static class Dog {
    
}
        
}
