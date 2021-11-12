/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class CamsOOPBooks {
    
    
    public static void main(String[] args) 
    {
               
        String []books = {"Grapes","Testing1","Testing2"};
        String author = "Mark Twain";
        
        String []books1 = {"Harry Potter1","HP2","HP3"};
        String author1 = "JKR";
        
        booksByAuthor MarkTwain = new booksByAuthor(author, books);
        booksByAuthor JKR = new booksByAuthor(author1, books1);
        
        Set Library = new HashSet();
        Library.add(JKR);
        Library.add(MarkTwain); //Library is a set of objects now. Each one an author with a booklist. 
        
        libraryTools.printHashMap(libraryTools.createBookMap(MarkTwain));
        libraryTools.printLibrarySet(Library);
        
    }
    
public static class booksByAuthor {
    private String author;
    private String[]bookList;
        
    public booksByAuthor(String author, String[] bookList)
    {
        this.bookList = bookList;
        this.author = author;           
    }                     
}

public static class libraryTools {
    
    public static void printLibrarySet (Set<Object> set)
    {
        for (Object obj: set)
        {
            if (obj instanceof booksByAuthor)
            {
                String author = ((booksByAuthor) obj).author;
                System.out.println(author);
            }            
        }
    }
       
    public static void printHashMap(HashMap<String, String[]> map)
    {
         map.forEach((k, v) -> {
		System.out.println("Author: " + k + " Books: " + Arrays.toString(v));
	});                
    }
    
    public static HashMap<String, String[]> createBookMap(booksByAuthor author)
    {
            HashMap<String,String[]> bookMap = new HashMap<>();
            
            String key = author.author;
            String[] bookList = author.bookList;
            
            bookMap.put(key, bookList);
          
            
            return bookMap;
    }              
}    
    
}
