/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level18;

import static CamsUsefulMethods.printAll.printP;
import java.io.FileInputStream;

/**
 *
 * @author Cam
 */
public class Task18_02 {
  public static void main(String[] args) throws Exception
    {
        

        /*BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
          String fileName = userInput.readLine(); //Just for postarity..
          FileInputStream inputStream = new FileInputStream(fileName); */
        
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Cam\\Desktop\\CodeGym\\ReadWrite\\TaskInFile.txt");

        int min = inputStream.read();
        System.out.println(min);
        while(inputStream.available() > 0)
        {

            int data = inputStream.read();
            if (data < min) 
            {
                min = data;
                printP(min);
            }
        }
        inputStream.close();
        System.out.println(min);

    }   
}
