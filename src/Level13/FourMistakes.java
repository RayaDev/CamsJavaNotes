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
public class FourMistakes {
public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    public static interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;
        
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
   
}
