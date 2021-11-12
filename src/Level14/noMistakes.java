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
public class noMistakes {
    public static void main(String[] args) {
        Object obj = new Jerry();

        Mouse_1 mouse = (Mouse_1) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse_1 mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse_1 {
    }

    static class GrayMouse extends Mouse_1 {
    }

    static class Jerry extends GrayMouse {
    }    
}
