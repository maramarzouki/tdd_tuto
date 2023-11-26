import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	

	@Test
	public void addBookTest() {
		Library library = new Library();
		Book book = new Book("Atomic Habits", "James Clear", 30);
		library.addBook(book);
		assertEquals(1, library.getTotalBooks());
	}
	
	@Test 
	public void removeBookTest() {
		Library library = new Library();
		Book book = new Book("Atomic Habits", "James Clear", 30);
		library.addBook(book);
		library.removeBook(book);
		assertEquals(0, library.getTotalBooks());
	}

	@Test 
	public void borrowBookTest() {
		Library library = new Library();
		Book book = new Book("Atomic Habits", "James Clear", 30);
		library.addBook(book);
		Borrower borrower = new Borrower("B1", "Maram");
		library.borrowBook(book, borrower);
		
		assertTrue(book.getIsBorrowed());
	}
	
	@Test 
	public void returnBookTest() {
		Library library = new Library();
		Book book = new Book("Atomic Habits", "James Clear", 30);
		library.addBook(book);
		Borrower borrower = new Borrower("B1", "Maram");
		library.borrowBook(book, borrower);
		
		library.returnBook(book);
		
		assertFalse(book.getIsBorrowed());
	}
}
