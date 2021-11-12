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
public class Food_Menu {
    public static void main(String[] args) 
    {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
        
        //foodMethods(newFood);
      //  selectableMethods(newFood);
    }

    public static void foodMethods(Food food) 
    {
        food.onSelect();
        food.onEat();
    }

    public static void selectableMethods(Selectable selectable) 
    {
        selectable.onSelect();
        //selectable.onEat();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() 
        {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    } 
}
