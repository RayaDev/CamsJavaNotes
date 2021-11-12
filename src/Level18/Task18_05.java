/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Level18;

import static CamsUsefulMethods.printAll.printLM;
import static CamsUsefulMethods.printAll.printP;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Cam
 */
public class Task18_05 {
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Cam\\Desktop\\CodeGym\\ReadWrite\\TaskInFile.txt");
        
        byte b = 0;
        
        HashSet<Byte> byteSet = new HashSet<>();
        ArrayList<Byte> sortedBytes = new ArrayList<>();
       
        int i=0;    
        while((i=inputStream.read())!=-1)
        {    
            b = (byte) i;
            byteSet.add(b);
            //System.out.println(b); 
         
        }   
        
        for(Byte B : byteSet)
        {
            sortedBytes.add(B);
        }
        
        inputStream.close();   
        
        /*
        Collections.sort(sortedBytes);
        Collections.reverse(sortedBytes);
        */
        
        //Most condensed version of the code. 
        Collections.sort(sortedBytes, Collections.reverseOrder());
        
        printLM(sortedBytes);
        
        
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());

        Set<Integer> someSet = new TreeSet<>(); //Tree Sets are automatically sorted! 

        while(fis.available()>0) {
            someSet.add(fis.read());
        }

        for (Integer element :
                someSet) {
            System.out.print(element + " ");
        }




        br.close();
        fis.close();
         */    
                     
    }
    
}
