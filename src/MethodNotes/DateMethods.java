/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateMethods {
    
    public static void main(String[] args) throws IOException, ParseException 
    {
                              
       /* try {
                               
            DateParse();
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(DateMethods.class.getName()).log(Level.SEVERE, null, ex);
            } */
        
        //DateConvert();
        //Solution();
        DateToLong();
        
    }
    
    public static void DateParse() throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in the following format: yyyy-MM-dd");
        String date = sc.nextLine();
        
        
        //Converts a string to a Date object
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date date2 = simpleDateFormat.parse(date);
        
        System.out.println("Entered date:");
        System.out.println(date2);
        
        System.out.println("Todays date: ");
        Date date1 = new Date();
        System.out.println(date1);       
        
    }
    
    public static void DateConvert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in the following format: yyyy-MM-dd");
        String date = sc.nextLine();
        
        //Converts a string a to a simple dateformat. 
        SimpleDateFormat Convert = new SimpleDateFormat(date);
        String date1 = Convert.format(new Date());
        System.out.println(date1);
    }
    
     public static void Solution() throws IOException, ParseException
     {
        //write your code here
        System.out.println("Enter Date");
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String date =reader.readLine();
        
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date Converteddate =DateFormat.parse(date);
        DateFormat = new SimpleDateFormat("MMM dd, YYYY");
        System.out.println(DateFormat.format(Converteddate).toUpperCase());

    }
    
    public static void DateToLong()
    {
       /* Date d2 = new Date(2323223232L);
        System.out.println("Date represented is "+ d2 ); */
                       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in the following format: yyyy-MM-dd");
        String date = sc.nextLine();

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");       
        
        try 
        {
            Date d = f.parse(date);
            long time = d.getTime();
            System.out.println(time);
            
            Date d3 = new Date(time);
            System.out.println("Date represented is "+ d3 );
        } 
        catch (ParseException e) 
        {
            System.out.println(e);
        }       
        
    }
    
    public static void subtractingDates()
    {
        Date start = new Date();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        Date stop = new Date();
        
        Date diff = new Date(stop.getTime() - start.getTime());
        
        System.out.println(diff.getTime()); //Converts to mili seconds
    }
    
    public static void stringToDate() throws ParseException {  
    String sDate1="31/12/1998";  
    String sDate2 = "31-Dec-1998";  
    String sDate3 = "12 31, 1998";  
    String sDate4 = "Thu, Dec 31 1998";  
    String sDate5 = "Thu, Dec 31 1998 23:37:50";  
    String sDate6 = "31-Dec-1998 23:37:50";  
    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
    SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
    SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
    SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
    SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
    Date date1=formatter1.parse(sDate1);  
    Date date2=formatter2.parse(sDate2);  
    Date date3=formatter3.parse(sDate3);  
    Date date4=formatter4.parse(sDate4);  
    Date date5=formatter5.parse(sDate5);  
    Date date6=formatter6.parse(sDate6);  
    System.out.println(sDate1+"\t"+date1);  
    System.out.println(sDate2+"\t"+date2);  
    System.out.println(sDate3+"\t"+date3);  
    System.out.println(sDate4+"\t"+date4);  
    System.out.println(sDate5+"\t"+date5);  
    System.out.println(sDate6+"\t"+date6);  
}  
                 
}
