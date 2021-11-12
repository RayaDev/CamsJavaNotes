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
public class IncorrectLines {
 public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        //final String NAME = "Submit";

       // public void onPress();

        //void onPress();

        @Override
        void onPress();

        //void onPress();

        String onPress(Object o);

       // String onPress(Object o);

      //  private String onPress(Object o);

    }   
}
