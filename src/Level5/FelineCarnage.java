/*
Use the Cat class to create three cats.
Hold three pairwise battles between the cats.
You don't need to create the Cat class. For combat, use the boolean fight (Cat anotherCat) method.
Display the result of each battle on the screen on a new line.
 */
package Level5;

/**
 *
 * @author Cam
 */
public class FelineCarnage {
     public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield",10,30,15);
        Cat cat2 = new Cat("Norman", 8, 12, 7);
        Cat cat3 = new Cat("JimBo", 20,10,30);
        
         boolean fight1 = cat1.fight(cat2);
         System.out.println(fight1);
         boolean fight2 = cat3.fight(cat1);
         System.out.println(fight2);
         boolean fight3 = cat2.fight(cat3);
         System.out.println(fight3);
        
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) { //This is the constructorrrr
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
