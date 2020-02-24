package Jdbc_Lab_Code_Book_Assignment2;

public class Author {

	private int authorId;
	private String first_name;
	private String middle_name;
	private String last_name;
	
	public Author(int authorId, String first_name, String middle_name, String last_name) {
		super();
		this.authorId = authorId;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
	}
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + "]";
	}
	
	
}
