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
public class ClassInherit { //Superclass (parent)
    
    String name;
    int age;
        
    public ClassInherit (String a, int b) 
    {
        this.name = a;
        this.age = b;
    }
       
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age; 
    }
}
