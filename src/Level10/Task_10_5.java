/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;


public class Task_10_5 {
 public static void main(String[] args) {
        int a = (byte) 44;
        int b = 300; //Max value of a byte is only 127.. This needs to be cast to something larger. An int! 
        short c = (short) (b - a);
        /*System.out.println(a);
        System.out.println(b);*/
        System.out.println(c);
    }    
}
