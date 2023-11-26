import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Library {
	
	private ArrayList<Book> books;
	private Map<Book, Borrower> borrowedBooks;
	
	public Library () {
		this.books = new ArrayList<>();
		this.borrowedBooks = new HashMap<>();
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public int getTotalBooks() {
		return books.size();
	}
	
	public void removeBook(Book b) {
		books.remove(b);
	}

	public void borrowBook(Book book, Borrower borrower) {
		if(!book.getIsBorrowed()) {
			borrowedBooks.put(book, borrower);
			book.setIsBorrowed(true);
		}
		
	}

	public void returnBook(Book book) {
		if(borrowedBooks.containsKey(book)) {
			borrowedBooks.remove(book);
			book.setIsBorrowed(false);
		}
		
	}

	

}
