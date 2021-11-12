/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_24 {
    //public int i = 6;
    static {
        init();
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    static {
        System.out.println("Static block");
    }

    public String name = "First name";

    public Task_15_24 () {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
    public int i = 6;
    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Task_15_24 s = new Task_15_24();
    }

    public static void printAllFields(Task_15_24 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
