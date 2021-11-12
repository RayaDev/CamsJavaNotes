/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;

/**
 *
 * @author Cam
 */
public class Task_10_9 {
     public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / e;
        System.out.println(d);
        System.out.println("_________");
        codeGym();
    }   
     
    public static void codeGym()
    {
          
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + (int) b /(int) c/(double) e;
        System.out.println(d);
    }
    
}
