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
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_12 {
    
 public static void main(String[] args) {
        SiamCat coco = new SiamCat("Coco");
        NakedCat nakedCoco = coco.shave();
    }

    public static class NakedCat {
       /* public NakedCat() {
            super();
            This super() isn't needed becuase it is just reference an Object constructor.
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

