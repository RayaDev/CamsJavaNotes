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
public class Task_9_25 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Task_9_25 room = new Task_9_25();
        room.A = 5;

        Task_9_25.D = 5;
    }

    public int getA() {
        return A;
    }    
}
