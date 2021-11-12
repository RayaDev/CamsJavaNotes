/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15;

import java.math.BigDecimal;

/**
 *
 * @author Cam
 */
public class Task_15_21 {
    public static void main(String[] args) {
        // Block 2.
        // Call for Objects
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // Block 3.
        // Call for Numbers
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // Block 4.
        // Call for Strings
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }   
    
public static class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Tree No. %d , Object method, parameter: %s", number, s.getClass().getSimpleName()));
    }
    
    public void info (String s) 
    {
        System.out.println(String.format("Tree No. %d , String method, parameter: %s", number, s.getClass().getSimpleName()));
    }
    
    public void info (Number s)
    {
        System.out.println(String.format("Tree No. %d , Number method, parameter: %s", number, s.getClass().getSimpleName()));
    }
    
   /* public void info (BigDecimal s)
    {
        System.out.println(String.format("Tree No. %d , Object method, parameter: %s", number, s.getClass().getSimpleName()));
    } */
}

}