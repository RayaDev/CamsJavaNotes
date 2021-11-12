/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level3;

/**
 *
 * @author Cam
 */
public class Percentages {
    public static double addTenPercent(int i) 
    {
        double n = i *1.10;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }   
}
