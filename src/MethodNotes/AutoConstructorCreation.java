/* The simplest code: part 2
COMPLETE

Take a look at what constructor-related stuff may be added during compilation, but is already present in this program.
Simplify the code. Remove all constructors and calls of superclasses' constructors that are created and added automatically.

PS: The NakedCat, NormalCat, and SiamCat classes have an is-a (inheritance) relationship: http://en.wikipedia.org/wiki/Is-a

Requirements:
•	The NormalCat class must be a descendant of the NakedCat class.
•	The SiamCat class must be a descendant of the NormalCat class.
•	Simplify the code in the NakedCat class.
•	Simplify the code in the NormalCat class.


Helpfull Comment:

Hopefully this should help someone:
Hypernym and Hyponym ( Example craws, penguins are  BIRDS. that makes craws and penguins Hyponym 
and birds is their Hypernym) in  programming terms this relationship type is " is a" relationship. 
Example a penguin "is a" bird. Based on prior lessons this seems to fit best for inherited classes. 
Meronym and Holonymn ( Example leafs, or branches are part of TREES. 
that makes leafs and branches Meronym and the tree is their Holonymn) 
in programming terms this relationship type is "has a" relationship.  Example a Tree "has a" leaf. 
Based on prior lessons this seems to fit best for inherited interfaces. 

 */
package MethodNotes;

import Level15.*;

/**
 *
 * @author Cam
 */
public class AutoConstructorCreation {
    
 public static void main(String[] args) {
        SiamCat coco = new SiamCat("Coco");
        NakedCat nakedCoco = coco.shave();
    }

    public static class NakedCat {
       /* public NakedCat() {
            super();
           
            This super() isn't needed becuase it is just reference an Object constructor.
            Nor is a no argument constructd needed in the class. It is allready implied and created by the complier. 
        } */
    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
            //super(); Samething here. 
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}

