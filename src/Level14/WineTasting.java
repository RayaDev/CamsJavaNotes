/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level14;

/**
 *
 * @author Cam
 */
public class WineTasting {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getBubblyWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }
    
    public  abstract class Drink {
        public void taste()
        {
            System.out.println("Delicious");
        }
    }
    
    public static class Wine extends Drink {
        public String getCelebrationName()
        {
            String celebration = "Birthday";
            return celebration;
        }
    }
    
    public static class BubblyWine extends Wine {
        @Override
        public String getCelebrationName()
        {
            String celebration = "New Year's";
            return celebration; 
        }
    }
    
    public static Drink getDeliciousDrink() 
    {
        Drink drink = new Wine();
        return drink;
    }

    public static Wine getWine() 
    {
        Wine wine = new Wine();
        return wine;
    }

    public static Wine getBubblyWine() 
    {
        BubblyWine bubbles = new BubblyWine();
        return bubbles;
    }
    
    
}
