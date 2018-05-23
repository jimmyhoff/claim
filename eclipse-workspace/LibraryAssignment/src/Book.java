
public class Book {
	public String title;
	public String author;
	public int isbn;
	public int numPages;
	public int checkedBy;
	
	public Book(String nm, String auth, int id, int numPg) {
		title = nm;
		author = auth;
		isbn = id;
		numPages = numPg;
		checkedBy = 0;
	}
	
	public void setAuthor(String auth) {
		author = auth;
	}
	
	public void setISBN(int id) {
		isbn = id;
	}
	
	public void setTitle(String name) {
		title = name;
	}
	
	public void setNumPages(int num) {
		numPages = num;
	}
}
