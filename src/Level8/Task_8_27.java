/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level8;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

/*
Working with dates

*/

public class Task_8_27 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MMMM d yyyy")
                .toFormatter(Locale.ENGLISH);

        LocalDate localDate = LocalDate.parse(date, formatter);
//        System.out.println(localDate);

        int dayNumber = localDate.getDayOfYear();
//        System.out.println(dayNumber);
        if (dayNumber % 2 == 0){
            return false;
        }
        else return true;
    }
}



