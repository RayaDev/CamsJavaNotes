/*
1. Inside the Solution class, create public static classes Cat and Dog.
2. Implement the createCats method, which should return a set with 4 cats.
3. Implement the createDogs method, which should return a set with 3 dogs.
4. Implement the join method, which should return a combined set of all the animals (all the cats and dogs).
5. Implement the removeCats method, which should remove from the set pets all cats in the set cats.
6. Implement the printPets method, which should display all the animals in the set pets.
Each animal should be on a new line.
 */
package Level8_1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cam
 */
class AnimalSet {

public static void main(String[] args) {
        Set<Cat12> cats = createCats();
        Set<Dog12> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat12> createCats() {
        HashSet<Cat12> result = new HashSet<Cat12>();

        //write your code here

        return result;
    }

    public static Set<Dog12> createDogs() {
        //write your code here
        return null;
    }

    public static Set<Object> join(Set<Cat12> cats, Set<Dog12> dogs) {
        //write your code here
        return null;
    }

    public static void removeCats(Set<Object> pets, Set<Cat12> cats) {
        //write your code here
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
    }
    
    public class Cat12
    {
        public String name;
        
        public Cat12(String name)
        {
            this.name = name;
        }
    }
    
    public class Dog12
    {
        public String name;
        
        public Dog12(String name)
        {
            this.name = name;
        }
    }
}
