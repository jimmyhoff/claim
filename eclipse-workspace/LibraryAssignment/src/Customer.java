import java.util.ArrayList;

public class Customer {
	public String name;
	public int custID; 
	public ArrayList<Book> custBookList = new ArrayList<>();
	
	public Customer(String nm, int customerID) {
		name = nm; 
		custID = customerID;
	}
}
