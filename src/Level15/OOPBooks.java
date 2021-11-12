/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level15;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cam
 */
public class OOPBooks {
     public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book {
        String title;

        public MarkTwainBook(String bookTitle) {
            super("Mark Twain");
            this.title = bookTitle;
        }

        @Override
        public MarkTwainBook getBook() {
            return MarkTwainBook.this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static class AgathaChristieBook extends Book {
        String title;

        public AgathaChristieBook(String bookTitle) {
            super("Agatha Christie");
            this.title = bookTitle;
        }

        @Override
        public AgathaChristieBook getBook() {
            return AgathaChristieBook.this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            if (this instanceof MarkTwainBook) {
                output = markTwainOutput;
            }
            else if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
