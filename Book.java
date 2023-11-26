
public class Book {
	
	private String title, author;
	private float price;
	private boolean isBorrowed = false;
	
	public Book(String t, String a, float p) {
		this.title = t;
		this.author = a;
		this.price = p;
	}
	
	public boolean getIsBorrowed() {
		return this.isBorrowed;
	}

	public void setIsBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
}
