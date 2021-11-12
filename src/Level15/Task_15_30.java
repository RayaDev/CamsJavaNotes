/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_30 {
    
    public static void main(String[] args)
    {
        
    }    
  
    abstract class DrinkMaker {
        abstract void getRightCup();
        abstract void addIngredients();
        abstract void pour();
        
        void makeDrink()
        {
            getRightCup();
            addIngredients();
            pour();
        }
    }
    
   public class LatteMaker extends DrinkMaker {

        @Override
        void getRightCup() {
           System.out.println("Grab a cup for latte");
        }

        @Override
        void addIngredients() {
           System.out.println("Fill with foamy milk");
        }

        @Override
        void pour() {
           System.out.println("Make coffee");
        }
        
    }
    
    class TeaMaker extends DrinkMaker {

        @Override
        void getRightCup() {
           System.out.println("Grab a cup for tea");
        }

        @Override
        void addIngredients() {
           System.out.println("Fill with boiling water");
        }

        @Override
        void pour() {
           System.out.println("Pour tea");
        }
        
    }
            
}
