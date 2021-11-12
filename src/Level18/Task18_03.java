/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Task18_03 {
    public static void main(String[] args) throws Exception {

        //FileInputStream inputStream = new FileInputStream("C:\\Users\\Cam\\Desktop\\CodeGym\\ReadWrite\\TaskInFile.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(br.readLine());

        //Create a Set for unqiue bytes, and a List to compare them to.
        HashSet<Byte> byteSet = new HashSet<>();
        ArrayList<Byte> byteList = new ArrayList<>();

        byte b;
        int i;
        while (-1 != (i = inputStream.read())) {
            b = (byte) i;
            byteList.add(b);
            byteSet.add(b);
            // System.out.println(b);
        }
        
        br.close();
        inputStream.close();
        
        
        ArrayList<Byte> sortedByteSet = sortedByteSet(byteSet);

        //Add a Hash map has byte key, and occurrences value
        HashMap<Byte, Integer> byteMap = new HashMap<>();
        int count = 0;
        for (Byte B : sortedByteSet) {
            byteMap.put(B, count);
        }

        byteMap = countMaxBytes(byteMap, byteList);
        HashMap<Byte, Integer> maxBytes = findMaxBytes(byteMap);

        //printByteMap(byteMap);
       // System.out.println();
        printByteMap(maxBytes);

       // printSolution(maxBytes);


    }

    //Returns a count of all byte occruances 
    public static HashMap<Byte, Integer> countMaxBytes(HashMap<Byte, Integer> byteMap, ArrayList<Byte> byteList) {

        HashMap<Byte, Integer> ByteMap = new HashMap<>();

        for (HashMap.Entry<Byte, Integer> pair : byteMap.entrySet())
        {
            byte key = pair.getKey();
            int value = pair.getValue();

            for (Byte b : byteList)
            {
                if (key == b) {
                    value += 1;
                }
            }

            ByteMap.put(key, value);
        }

        return ByteMap;
    }

    //Returns all occurances that share the same max value.
    public static HashMap<Byte,Integer> findMaxBytes(HashMap<Byte, Integer> byteMap)
    {
        HashMap<Byte,Integer> maxByteMap = new HashMap<>();

        //Find max value
        Map.Entry<Byte, Integer> maxEntry = null;
        for(HashMap.Entry<Byte, Integer> pair: byteMap.entrySet())
        {
            if (maxEntry == null || pair.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = pair;
            }
        }

        maxByteMap.put(maxEntry.getKey(), maxEntry.getValue());
        //Double checks if any other entries also have the same key value.
        for(HashMap.Entry<Byte, Integer> pair: byteMap.entrySet())
        {
            if(pair.getValue() == maxEntry.getValue())
            {
                maxByteMap.put(pair.getKey(), pair.getValue());
            }
        }
        return maxByteMap;
    }

    public static ArrayList<Byte> sortedByteSet (HashSet<Byte> byteSet)
    {
        ArrayList<Byte> sortedByteSet = new ArrayList<>();

        for(Byte b : byteSet)
        {
            sortedByteSet.add(b);
        }

        Collections.sort(sortedByteSet);
        Collections.reverse(sortedByteSet);

        return sortedByteSet;
    }

    public static void printByteMap(HashMap<Byte, Integer> byteMap)
    {
        for (HashMap.Entry<Byte, Integer> pair : byteMap.entrySet())
        {

            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }
    }
}
