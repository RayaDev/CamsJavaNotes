/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13;

import java.awt.Color;
import static java.awt.Color.BLUE;

/**
 *
 * @author Cam
 */
public class ComplieProgram {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

  
    }

    public static class BigFox extends Fox 
    {
          @Override
        public Color getColor() {
            return BLUE;
        }

    }
}
