package it.unisa.bookshop;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public class BookshopTest {

    @Test
    public void readLibraryTest() {
        Bookshop bookshop = new Bookshop();
        File file = Path.of("Test/").resolve("testData.txt").toFile();
        try{
            bookshop.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(7, bookshop.getBookshop().size());
    }

    @Test
    public void findByAuthorTest() {
        Bookshop bookshop = new Bookshop();
        File file = Path.of("Test/").resolve("testData.txt").toFile();
        try{
            bookshop.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Book> books = bookshop.findByAuthor("Giordano Paolo");
        Assert.assertEquals(2, books.size());
        Assert.assertEquals("Il corpo umano", books.get(0).getTitle());
        Assert.assertEquals("Il corpo umano", books.get(1).getTitle());
    }

    @Test
    public void findByTitleContentTest() {
        Bookshop bookshop = new Bookshop();
        File file = Path.of("Test/").resolve("testData.txt").toFile();
        try{
            bookshop.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Book> books = bookshop.findByTitleContent("sogni");
        Assert.assertEquals("Mo Yan", books.get(0).getAuthor());
    }

    @Test
    public void findMaxAvailabilityTest() {
        Bookshop bookshop = new Bookshop();
        File file = Path.of("Test/").resolve("testData.txt").toFile();
        try{
            bookshop.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Book> books = bookshop.findMaxAvailable();
        Assert.assertEquals("Il corpo umano", books.get(0).getTitle());
    }

    @Test
    public void findBelowAvailabilityTest() {
        Bookshop bookshop = new Bookshop();
        File file = Path.of("Test/").resolve("testData.txt").toFile();
        try{
            bookshop.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Book> books = bookshop.findBelowAvailability(21);
        Assert.assertEquals("Fai bei sogni" , books.get(1).getTitle());
        Assert.assertEquals("Sogni rossi" , books.get(0).getTitle());
    }

}