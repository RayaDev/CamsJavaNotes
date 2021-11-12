/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level6;

import java.util.Scanner;
public class AscendingOrder 
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter no. of elements you want in array:"); 
        n = 5;
        int a[] = new int[n];
        //System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println(a[i]);
        } 
        System.out.println(a[n - 1]);
    }
}
