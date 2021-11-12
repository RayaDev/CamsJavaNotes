/*
1. In the Cat class, add the public static ArrayList<Cat> variable cats.
2. Each time a new cat (new Cat object) is created, add it to the variable cats. Create 10 Cat objects.
3. The printCats method should display all cats on the screen. You need to use the variable cats.
 */
package Level6;


import java.util.ArrayList;

// What a messss! 

public class StaticCat {
 public static ArrayList<StaticCat> cats = new ArrayList<StaticCat>(); //Learn arrayLists
 
    
    public StaticCat() {
        
    }

    public static void main(String[] args) {
         for (int i = 0; i <10; i++) 
        {
            StaticCat cat = new StaticCat();
            StaticCat.cats.add(cat);
            
            printCats();
        }
    
       /* Cat cat = new Cat();
        cat.cats.add(cat);
        
        Cat cat1 = new Cat();
        cat1.cats.add(cat1);
        
        Cat cat2 = new Cat();
        cat2.cats.add(cat2);
        
        Cat cat3 = new Cat();
        cat3.cats.add(cat3);
        
        Cat cat4 = new Cat();
        cat4.cats.add(cat4);
        
        Cat cat5 = new Cat();
        cat5.cats.add(cat5);
        
        Cat cat6 = new Cat();
        cat6.cats.add(cat6);
        
        Cat cat7 = new Cat();
        cat7.cats.add(cat7);
        
        Cat cat8 = new Cat();
        cat8.cats.add(cat8);
        
        Cat cat9 = new Cat();
        cat9.cats.add(cat9); */
        
    
        printCats();
    }


    public static void printCats() {
        for(StaticCat cat : cats) //The :  is a conditional operator
        {
        System.out.println(cat);
        }
    }
}

