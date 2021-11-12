/*
Create a Map<String, Date> and add ten entries that represent (last name, birth date) pairs.
Remove from the map all people born in the summer.
Hint: At CodeGym, summer lasts from June 1 to August 31.

 */
package Level8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author Cam
 */
public class SummerHolidays {

   public static HashMap<String, Date> createMap() throws ParseException 
   {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Revees", df.parse("MAY 5 1982"));
        map.put("Jolie", df.parse("FEBRUARY 1 1990"));
        map.put("Roberts", df.parse("MARCH 2 1983"));
        map.put("VanDame", df.parse("AUGUST 2 1999"));
        map.put("Pitt", df.parse("JANUARY 5 1997"));
        map.put("Cloonie", df.parse("DECEMBER 5 1995"));
        map.put("DelToro", df.parse("OCTOBER 9 1993"));
        map.put("Denzel", df.parse("NOVEMBER 8 1990"));
        map.put("Trucks", df.parse("MARCH 1 1988"));

        return map;//write your code here
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) 
    {
        
        Calendar c = Calendar.getInstance();
        
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
            while (iter.hasNext()) 
            {
                Map.Entry<String, Date> entry = iter.next();
                c.setTime(entry.getValue());
                if(c.get(Calendar.MONTH) == 5 || c.get(Calendar.MONTH) == 6|| c.get(Calendar.MONTH) == 7)
                {
                    iter.remove();
                }
            }
            
            
            /* Code Gym Solution
            while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();
            c.setTime(entry.getValue()); // add this
            if(c.get(Calendar.MONTH) == 5 || c.get(Calendar.MONTH) == 6|| c.get(Calendar.MONTH) == 7)
            {
                iter.remove();
            } */

        }
    

    public static void main(String[] args) throws Exception
    {
        
        HashMap<String, Date> map = new HashMap<>();
        
        map = createMap();
        
        removeAllSummerPeople(map);
    }
}
