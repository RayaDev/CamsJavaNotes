/*

Use a loop to write a countdown from 10 to 0. To create a delay, use Thread.sleep(100);
Wrap the sleep call in a try-catch block.

 */
package Level9;

/**
 *
 * @author Cam
 */
public class Task_9_20 {
    
    public static void main(String[] args) 
    {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
            Thread.sleep(100);
            }
            catch (Exception e)
            {
                
            }
        }
    }   
}
