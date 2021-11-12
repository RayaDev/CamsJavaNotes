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
public class Buggy {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static Object NEO = new User().initializeIdAndName(1, "Neo");
        public static Object TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        public User initializeIdAndName(long id, String name); 
       
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            
            this.id = id;
            this.name = name;
            return User.this;
            
        }
                
    }
 
}
