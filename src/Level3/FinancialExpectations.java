/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cam
 */
public class FinancialExpectations {
     public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int n1 = Integer.parseInt(n);
        System.out.println("I will earn $" + n1 + " per hour");
}
}
