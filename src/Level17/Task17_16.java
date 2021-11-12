/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level17;

/**
 *
 * @author Cam
 */
public class Task17_16 {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {
        Double d = method3();
    }

    protected void method1(String param1) {
        Task17_16 solution = new Task17_16 ();
        solution.method0();
        //Solution solution = new Solution();
    }

    public void method2(int param1) {
        param1++;
    }

    synchronized double  method3() { //Modifies a shared resource, so needs to be synchronized
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private  synchronized void method4() { //Modifies a shared resource, so needs to be synchronized
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public  synchronized String method6(int param2) { //Modifies a shared resource, so needs to be synchronized
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }   
}
