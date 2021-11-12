/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Cam
 */
public class ReadWriteBasics {
    public static void main(String[] args) throws Exception
    {
        //Create a stream to read bytes from a file
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        //Create a stream to write bytes to a file
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        while (inputStream.available() > 0) //as long as there are unread bytes
        {
            int data = inputStream.read(); // Read the next byte into the data variable
            outputStream.write(data); // and write it to the second stream
        }
        
        inputStream.close(); //Close both streams. We don't need them any more.
        outputStream.close();
    }   
}
