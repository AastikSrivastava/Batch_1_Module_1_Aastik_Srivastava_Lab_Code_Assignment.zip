package Jdbc_Lab_Code_Book_Assignment2;

public class Book {
	private int isbn;
	private String book_name;
	private int book_authorId;
	private float cost;

	public Book()
	{
		
	}
	public Book(int isbn, String book_name, int book_authorId, float cost) {
		super();
		this.isbn = isbn;
		this.book_name = book_name;
		this.book_authorId = book_authorId;
		this.cost = cost;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_authorId() {
		return book_authorId;
	}
	public void setBook_authorId(int author_Id) {
		this.book_authorId = book_authorId;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_name=" + book_name + ", book_authorId=" +book_authorId + ", cost=" + cost + "]";
	}


}
