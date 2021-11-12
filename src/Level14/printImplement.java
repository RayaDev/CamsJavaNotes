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
public class printImplement {
    public static void main(String[] args) 
    {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        
        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) 
    {
        if (object instanceof Rectangle)
        {
            ((Rectangle)object).draw();
        }
        
        if (object instanceof Circle)
        {
            ((Circle)object).move();
        }
        
    }

    
    
    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() 
        {
            System.out.println("Can be drawn");
        }

        @Override
        public void move() 
        {
            System.out.println("Can be moved");
        }

    } 
    
    
    
    static interface Drawable {
        void draw();
    } 
    
    static class Rectangle implements Drawable {
        @Override
        public void draw() 
        {
            System.out.println("Can be drawn");
        }

        public void move() 
        {
            System.out.println("Can be moved");
        }
    }
}
