package j2ee1.corejava.exam1;

public class Book {
	private int bookId;
	private String bookCategory;
	private String bookName;
	private String authorName;
	
	
	public Book() {
		super();
	}
	
	public Book(int bookId, String bookCategory, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookCategory = bookCategory;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}
