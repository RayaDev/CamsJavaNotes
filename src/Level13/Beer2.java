/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13;

/**
 *
 * @author Cam
 */
public class Beer2 {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Alcoholic beverage";
            } else {
                return "Non-alcoholic beverage";
            }

        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }

    }
}
