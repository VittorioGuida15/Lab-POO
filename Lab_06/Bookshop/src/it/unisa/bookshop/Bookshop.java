package it.unisa.bookshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bookshop {

    final private List<Book> bookshop;

    public Bookshop() {
        bookshop = new ArrayList<>();
    }

    public List<Book> findByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for(Book book : bookshop){
            if(author.equals(book.getAuthor()))
                books.add(book);
        }
        return books;
    }

    public List<Book> findByTitleContent(String titleContent) {
        List<Book> books = new ArrayList<>();
        for(Book book : bookshop){
            if(book.getTitle().toLowerCase().contains(titleContent))
                books.add(book);
        }
        return  books;
    }

    public List<Book> findMaxAvailable() {
        List<Book> books = new ArrayList<>();
        Comparator<Book> numberOfCopies = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getNumberOfCopies(), b2.getNumberOfCopies());
            }
        };
        this.bookshop.sort(Collections.reverseOrder(numberOfCopies));
        int maxCopies = bookshop.get(0).getNumberOfCopies();
        for(Book book : bookshop){
            if(book.getNumberOfCopies() == maxCopies)
                books.add(book);
        }
        return books;
    }

    public List<Book> findBelowAvailability(int threshold) {
        List<Book> books = new ArrayList<>();
        for(Book book : bookshop){
            if(book.getNumberOfCopies() < threshold && book.getNumberOfCopies() != 0)
                books.add(book);
        }
        return books;
    }

    public List<Book> getBookshop() {
        return bookshop;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while(in.hasNextLine()){
            String type = in.nextLine();
            String title = in.nextLine();
            String author = in.nextLine();
            String editor = in.nextLine();
            int numberOfCopies = Integer.parseInt(in.nextLine());
            if(type.equals("AudioBook")){
                int length = Integer.parseInt(in.nextLine());
                String format = in.nextLine();
                AudioBook audioBook = new AudioBook(title,author,editor, length, format);
                audioBook.setNumberOfCopies(numberOfCopies);
                this.bookshop.add(audioBook);
            }
            else {
                Book book = new Book(title,author, editor);
                book.setNumberOfCopies(numberOfCopies);
                this.bookshop.add(book);
            }


        }
    }
}
