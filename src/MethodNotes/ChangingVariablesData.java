/*

 */
package MethodNotes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class ChangingVariablesData {
    public static void main(String[] args)
    {
        
        //With primative data you need to return the new variable
        String name = "Cam";
        changeName(name);
        System.out.println(name); //Does not re-write name. 
        
        
        //With data Structures you don't need to return a new variable. It can be modified by a void method. 
        int[] a = new int[1];
        a[0] = 1;
        changeArray(a);
        System.out.println(a[0]); 
        
        Set<String> names = new HashSet<>();
        names.add("Cam");
        changeSet(names);
        
        for(String n : names)
        {
            System.out.println(n);
        }
        
        
    }
    
    public static void changeName(String n)
    {
        n = "Lili";
    }
    
    public static void changeArray(int[] a)
    {
        a[0]=2;
    }
    
    public static void changeSet(Set<String> names)
    {
        names.add("Lili");
    }
    
}
