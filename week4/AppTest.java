import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

public class AppTest {
    @Test 
    public void testLibrary1(){
        Library library = new Library("Kirjapaikka", "Here");
        library.addBook(null);
        Book expected = new Book("Book", "desc", Book.Genre.EPIC);
        library.addBook(expected);
        assertEquals(expected, library.getBookByIdx(0));
    }

    @Test 
    public void testLibrary2(){
        Library library = new Library("Kirjapaikka", "Here");
        Book expected = new Book("Book", "desc");
        library.addBook(expected);
        library.borrowBook(0);
        assertEquals(true, library.getBookByIdx(0).isBorrowed());
    }

    @Test 
    public void testLibrary3(){
        Library library = new Library("Kirjapaikka", "Here");
        Book expected = new Book("Book", "desc");
        library.addBook(expected);
        library.returnBook(library.borrowBook(0));
        assertEquals(false, library.getBookByIdx(0).isBorrowed());
    }

    @Test 
    public void testLibrary4(){
        Library library = new Library("Kirjapaikka", "Here");
        ArrayList<Book> books = new ArrayList<>();
        
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        books.add(library.getBookByIdx(0));
        books.add(library.getBookByIdx(1));
        books.add(library.getBookByIdx(2));
        books.add(library.getBookByIdx(3));
        books.add(library.getBookByIdx(4));

        assertEquals(books, library.getAllBooks());
        
    }
    
    @Test 
    public void testLibrary5(){
        Library library = new Library("Kirjapaikka", "Here");
        ArrayList<Book> books = new ArrayList<>();
        
        library.addBook( new Book("Book", "desc", Book.Genre.EPIC));
        library.addBook( new Book("Book", "desc", Book.Genre.EPIC));
        library.addBook( new Book("Book", "desc", Book.Genre.HORROR));
        library.addBook( new Book("Book", "desc", Book.Genre.FANTASY));
        library.addBook( new Book("Book", "desc", Book.Genre.FANTASY));
        books.add(library.getBookByIdx(0));
        books.add(library.getBookByIdx(1));


        assertEquals(books, library.getBooksByGenre(Book.Genre.EPIC));
        
    }

    @Test 
    public void testLibrary6(){
        Library library = new Library("Kirjapaikka", "Here");
        ArrayList<Book> books = new ArrayList<>();
        
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        library.addBook( new Book("Book", "desc"));
        books.add(library.getBookByIdx(0));
        books.add(library.getBookByIdx(1));
        library.borrowBook(2);
        library.borrowBook(3);
        library.borrowBook(4);

        assertEquals(books, library.getAvailableBooks());
        
    }

    @Test 
    public void testLibrary7(){
        Library library = new Library("Kirjapaikka", "Here");
        assertEquals("Kirjapaikka", library.getName());
    }

    @Test 
    public void testLibrary8(){
        Library library = new Library("Kirjapaikka", "Here");
        assertEquals("Here", library.getAddress());
    }

    @Test 
    public void testLibrary9(){
        Library library = new Library("Kirjapaikka", "Here");
        library.setOpen(true);
        assertEquals(true, library.isOpen());
    }

    @Test
    public void testBook(){
        Book book = new Book("Book", "desc");
        assertEquals("desc", book.getDescription());
    }


}