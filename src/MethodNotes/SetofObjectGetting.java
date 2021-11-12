/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class SetofObjectGetting {
    public static void main(String[] args) 
    {
        Set<Cat> cats = createCats();
            
        
        printCats(cats);
    }

    public static Set<Cat> createCats() 
    {
        Set<Cat> cats = new HashSet<>();
        
        Cat cat1 = new Cat("Stevo");
        Cat cat2 = new Cat("Ricardo");
        Cat cat3 = new Cat("Jimbo");
                     
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);             
        
        return cats;
    }

    public static void printCats(Set<Cat> cats) 
    {
   
        for (Cat cat : cats)
        {
            Cat cat21 = cat;
            System.out.println(cat21.name); 
        }                        
    }
        
    public static class Cat 
    {
        public String name;
        
        public Cat (String name)
        {
           this.name = name; 
        
        }
    }    
    
}

  