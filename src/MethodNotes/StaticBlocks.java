/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class StaticBlocks {
 
static int a;
static int b;
    
static 
{
    a = 5;
    b = 6;
}


public static void main(String[] args) 
{
    System.out.println(a);
}     

}

