/*
Task: The program determines which family (last name) lives in the house with the specified number.
New task: The program should work with cities rather than house numbers:
 */
package Level8;

/**
 *
 * @author Cam
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_8_29 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Build directory
        Map<String, String> directory = new HashMap<>();       
        while(true)
        {
            String city = reader.readLine();
            
            
            if(city.isEmpty())
            {
                break;
            }
            
            String faimlyName = reader.readLine();
            
            directory.put(city, faimlyName);
            
        }
        
        //Search for faimly by city
        
        String searchCity = reader.readLine();
        
        for(Map.Entry<String, String> map : directory.entrySet())
        {
            if (map.getKey().equals(searchCity))
            {
                System.out.println(map.getValue());
            }
        }
        
        

      // List of addresses
      /*  List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familyName = addresses.get(houseNumber);
            System.out.println(familyName);
        } */
    }    
}
