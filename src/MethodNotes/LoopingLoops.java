/*
Danggg sonnn. Inception loop
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class LoopingLoops {
     
    public static void main(String[] args) {  
        int x = 1;
        int y;   
        while(x<=10){  
        y = 1;
        while (y <= 10) {
             int z = x * y;
             System.out.print(z +" ");
             //System.out.println(y);
             y++;
            }
            System.out.println("");
            x++; 
        }
        
    }     
}    


