/*
Creating New Variables
 
*/
package Level2;

/**
 *
 * @author Cam
 */  
public class FaimlyRelations {
 
 public static void main(String[] args) {
        Man bro= new Man();
        Woman woman= new Woman();
        woman.husband = bro;
        bro.wife= woman;
        
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;     
    }
    
}

