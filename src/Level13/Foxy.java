/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13;

import java.awt.Color;

/**
 *
 * @author Cam
 */
public class Foxy {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() 
        {
            return "Fox";
        }
       
    }  
}
