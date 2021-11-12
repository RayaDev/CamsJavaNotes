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
public class SumOf3DigitNumber {
       public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum1 = number % 10;
        int sum2 = number/10;
        sum2 = sum2 % 10;
       // sum1 = sum1 * 10;
        int sum3 = number/100;
        System.out.println(sum3);
        System.out.println(sum2);
        System.out.println(sum1);
        
        int sum = sum1 + sum2 + sum3;
        return sum;
    }
}
