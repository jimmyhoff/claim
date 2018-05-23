import java.util.*;
public class Library {
	public String address;
	public String name;
	public ArrayList<Book> bookList = new ArrayList<>();
	public ArrayList<Customer> custList = new ArrayList<>();
	
	
	public Library(String add, String nm) {
		address = add;
		name = nm;
	}
	
	public void setAddress(String add) {
		address = add;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void addBook(Book b) {
		bookList.add(b);
	}
	
	public void addCust(Customer c) {
		custList.add(c);
	}

	
	public static void main(String[] args) {
		//initialize scanner
		Scanner sInt = new Scanner(System.in);
		Scanner sString = new Scanner(System.in);
		
		//list of libraries
		List<Library> libList = new ArrayList<>();
		
		//switch loop
		boolean exit = false;
		int uniqueCID = 1;
		int index = 0;
		while(!exit) {
			System.out.println("Press 1 to add a library \nPress 2 to add a book to the current library \nPress 3 to toggle through libraries"
					+ "\nPress 4 to exit");
			int sw = sInt.nextInt();
			switch(sw) {
			case 1: 
				System.out.print("Enter the address of the library: ");
				String add = sString.nextLine();
				System.out.print("Enter the name of the library: ");
				String nm = sString.nextLine();
				Library l = new Library(add, nm);
				libList.add(l);
				break;
			case 2:
				System.out.print("Enter the name of the book: ");
				String bookName = sString.nextLine();
				System.out.print("Enter the author of the book: ");
				String auth = sString.nextLine();
				System.out.print("Enter the ISBN of the book: ");
				int id = sInt.nextInt();
				System.out.print("Enter the nunmber of pages: ");
				int numPg = sInt.nextInt();
				Book b = new Book(bookName, auth, id, numPg);
				libList.get(index).bookList.add(b);
				break;
			case 3:
				if (index != libList.size()-1) {
					index++;
				} else {
					index = 0;
				}
				System.out.println("Current library: "+libList.get(index).name);
				break;
			case 4: 
				System.out.println("Enter ISBN to search for: ");
				int isbnSearch = sInt.nextInt();
				for (int i = 0; i < libList.size(); i++) {
					for (int j = 0; j < libList.get(i).bookList.size(); j++) {
						if (libList.get(i).bookList.get(j).isbn == isbnSearch) {
							System.out.println("The book "+libList.get(i).bookList.get(j).title+" is located at "+libList.get(i).name);
						}
					}
				}
				
				
			case 5: 
				//add new customer to current libary
				System.out.println("Add customer to the current library: ");
				String cust = sString.nextLine();
				Customer c = new Customer(cust, uniqueCID);
				libList.get(index).custList.add(c);
				uniqueCID++;
				
				
			case 6: 
				//add book to customer
				System.out.println("Enter the customer's ID: ");
				int uid1 = sInt.nextInt();
				System.out.println("Enter the book ISBN you would like to add to the customer: ");
				int bISBN = sInt.nextInt();
				for (int i = 0; i < libList.size(); i++) {
					for (int j = 0; j < libList.get(i).bookList.size(); j++) {
						if (bISBN == libList.get(i).bookList.get(j).isbn) {
							libList.get(i).bookList.get(j).checkedBy = uid1;
							for (int k = 0; k < libList.get(i).custList.size(); k++) {
								if (uid1 == libList.get(i).custList.get(k).custID) {
									Book bk = new Book(libList.get(i).bookList.get(j).title, libList.get(i).bookList.get(j).author, libList.get(i).bookList.get(j).isbn, libList.get(i).bookList.get(j).numPages);
									libList.get(i).custList.get(k).custBookList.add(bk);
								}
							}
						}
					}
				}
				
				
				

			
			case 7:
				//see if customer is a member of a library
				System.out.println("Enter the ID of the customer: ");
				int uid = sInt.nextInt();
				for (int i = 0; i < libList.size(); i++) {
					for (int j = 0; j < libList.get(i).custList.size(); j++) {
						if (libList.get(i).custList.get(j).custID == uid) {
							//System.out.println()
						}
					}
				}
			case 8: 
				exit = true;
				break;
			}
		}
	}
}
