/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level9;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.*;

public class Task_9_28 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String sourceFileName = reader.readLine();
        String sourceFileName = "C:\\Users\\Cam\\Desktop\\CodeGymTasks\\Estar Conjugation _ Conjugate Estar in Spanish.html";
        
        //String destinationFileName = reader.readLine();
        String destinationFileName = "C:\\Users\\Cam\\Desktop\\CodeGymTasks\\testout2.txt";

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        BufferedInputStream buffReader = new BufferedInputStream(fileInputStream);
        
        int i = 0;
        int count = 0;
        
        while((i = buffReader.read())!= -1) //Still not sure how this line works.. 
        {
            char letter = (char)i; 
            fileOutputStream.write(letter);
            System.out.print(letter);
            
            count++;
                        
        }

        System.out.println("Bytes copied: " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }   
}

/* Codegym Solution

public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) 
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Bytes copied: " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
*/
