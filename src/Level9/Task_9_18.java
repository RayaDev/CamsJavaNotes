/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level9;

/**
 *
 * @author Cam
 */
public class Task_9_18 {
    public static void main(String[] args) {
    }
    
    static class MyException extends Exception {
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends MyException3{
    }
}
