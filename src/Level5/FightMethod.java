/*
Implement the boolean fight(Cat anotherCat) method:
implement a mechanism for cats to fight based on their weight, age and strength.
You can decide for yourself how a cat's characteristics factor into combat.
The method should determine whether we (this) won the fight, i.e. return true if we won and false if not.

The following condition must be met:
if cat1.fight(cat2) returns true,
then cat2.fight(cat1) must return false
 */
package Level5;

/**
 *
 * @author Cam
 */
public class FightMethod {
    public int age;
    public int weight;
    public int strength;
    
    public FightMethod() { //Constructor? Doesn't make too much of a diffrence in this code.. 
        
    } 

    public boolean fight(FightMethod anotherCat) {
        if (this.strength > anotherCat.strength && this.weight >= anotherCat.weight ) {
            return true;
        }
        if (this.strength > anotherCat.strength && this.age <= anotherCat.age) {
            return true;
        }
        else {
           return false; }
    }

    public static void main(String[] args) {
        FightMethod cat1 = new FightMethod();
        FightMethod cat2 = new FightMethod();
        cat1.age = 3;
        cat1.weight = 20;
        cat1.strength= 10;
        
        cat2.age= 2;
        cat2.weight = 15;
        cat2.strength= 8;
        
        System.out.println(cat1.fight(cat2)); //How would you pass 2 objects into the method with out using "this"?)
        System.out.println(cat2.fight(cat1));
    }
}


