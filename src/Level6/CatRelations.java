/*
Task: Each cat has a name and a mother.
Create a class that describes this situation.
Create two objects: a daughter cat and a mother.
Display them on the screen.

New task: Each cat has a name, a father, and a mother.
Edit Cat so that it reflects these relationships.
Create 6 objects: grandfather (the father's father), grandmother (the mother's mother), father, mother, son, daughter.
Display them all in the following order: grandfather, grandmother, father, mother, son, daughter.

Example Input
Grandfather Tiger
Grandmother Puss
Father Oscar
Mother Missy
Son Simba
Daughter Coco

Example output:
The cat's name is Grandfather Tiger, no mother, no father
The cat's name is Grandmother Puss, no mother, no father
The cat's name is Father Oscar, no mother, Grandfather Tiger is the father
The cat's name is Mother Missy, Grandmother Puss is the mother, no father
The cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father

Requirements:
•	The program should read in the names of 6 cats in the specified order.
•	The main method should create 6 Cat objects.
•	The program should display 6 lines with information about the cats.
•	The line about the grandfather (first line) must match the conditions.
•	The line about the grandmother (second line) must match the conditions.
•	The line about the father (third line) must match the conditions.
•	The line about the mother (fourth line) must match the conditions.
•	The line about the son (fifth line) must match the conditions.
•	The line about the daughter (sixth line) must match the conditions.
  


 */
package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class CatRelations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String grandfatherName = reader.readLine();
        Cat grandFather = new Cat(grandfatherName, null, null);
       
        String grandmotherName = reader.readLine();
        Cat grandMother = new Cat(grandmotherName, null, null);
        
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, grandFather);
                     
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandMother, null);
        
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
       
    }

    public static class Cat {
        private String name;
        private Cat mom;
        private Cat dad;
        
        

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
            
        }

        @Override
        public String toString() { //This method is a little confusing.. 
            if (mom == null && dad == null)
            {
                return "The cat's name is " + name + ", no mother, no father ";
            }
            
            else if (dad == null) 
            {
               return "The cat's name is " + name + ", "  + mom.name + " is the mother, no father";
               
            }
            else if (mom == null)
            {
                return "The cat's name is " + name + ", no mother , " + dad.name + " is the father";
            }
            else 
            {
                return "The cat's name is " + name + ", " + mom.name + " is the mother " + dad.name + " " +"is the father";
            }
        }
    }

}