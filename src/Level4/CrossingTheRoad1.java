/*
 Pretty basic solution if you just know maths...
 */
package Level4;

import java.io.*;
public class CrossingTheRoad1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String s = reader.readLine();
        Double t = Double.parseDouble(s);
        System.out.println(t);
        lightcolor(t);
        
    }
    public static void lightcolor(double t){
       if((t%5.0 >= 0) && (t%5 < 3)) {
            System.out.println("green");
       }
        else 
            if (t % 5.0 >= 3 && t % 5 < 4) {
                System.out.println("yellow"); 
            }            
            else {
                System.out.println("red");
            }
        }
    }



