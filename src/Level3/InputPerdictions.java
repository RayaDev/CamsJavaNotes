/*

 */
package Level3;

import java.io.*; //Easier and simple import line.

public class InputPerdictions {
     public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
                   
        String name = reader.readLine();
        String salary = reader.readLine();
        String time = reader.readLine();
        int salary1 = Integer.parseInt(salary);
        int time1 = Integer.parseInt(time);
        
        System.out.println(name + " will receive " + salary + " in "+ time + " years.");
        
    }
}
