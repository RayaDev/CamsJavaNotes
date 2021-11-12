/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Interfaces {

  
public static void main (String[] args)
{
    
}

public interface RectangleMath
{   
    
    public int calcArea();
    public int calcPerimiter();
             
    
}

public class Rectangles implements RectangleMath
{
        
        @Override
        public int calcArea() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int calcPerimiter() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
}

}
