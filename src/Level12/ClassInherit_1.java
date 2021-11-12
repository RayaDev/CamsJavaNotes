/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level12;

/**
 *
 * @author Cam
 */
public class ClassInherit_1 extends ClassInherit{
    
    public static void main(String[] args) 
    {
        ClassInherit_1 test = new ClassInherit_1("Frank", 60);
        String name = test.getName();
        System.out.println(name);
        
    }

    public ClassInherit_1(String a, int b) {
        super (a, b); //Calls the suoerclass (parent) constructor.
        
    }
    
    
}
