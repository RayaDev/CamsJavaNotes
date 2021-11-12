/*
Enter a file name from the console.
Find the maximum byte in the file. Display it on the screen.
Close the IO stream.
 */
package Level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Task18_01 {
    public static void main(String[] args) throws Exception
    {
         //Create a FileInputStream object bound to «c:/data.txt».

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String fileName = userInput.readLine(); //Just for postarity..
        //FileInputStream inputStream = new FileInputStream("C:\\Users\\Cam\\Desktop\\CodeGym\\ReadWrite\\TaskInFile.txt");
        FileInputStream inputStream = new FileInputStream(fileName);
        long sum = 0;

        while(inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data > sum) {
                sum = data;
            }
        }
        inputStream.close();
        System.out.println(sum);

    }
    
}
