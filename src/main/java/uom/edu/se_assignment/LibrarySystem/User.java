package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer
{
	private int idNumber;
	private String FullName;
	private String Address;
	private String ContactNumber;
	private List<Book> listOfBurrowedBooks = new ArrayList<Book>();
	private int position; 
	
	User(int id, String name, String address, String contact)
	{
		//validation for id
		idNumber = id;		
		FullName = name;
		Address = address;
		ContactNumber = contact;
	}

	public int getIdNumber() 
	{
		return idNumber;
	}

	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) 
	{
		FullName = fullName;
	}

	public String getAddress() 
	{
		return Address;
	}

	public void setAddress(String address) 
	{
		Address = address;
	}

	public String getContactNumber() 
	{
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) 
	{
		ContactNumber = contactNumber;
	}

	public List<Book> getListOfBurrowedBooks()
	{
		return listOfBurrowedBooks;
	}
	
	public void addBook(Book b)
	{
		listOfBurrowedBooks.add(b);
	}
	
	public void removeBook(Book b)
	{
		listOfBurrowedBooks.remove(b);
	}

	//used to update each observer with their new position in the waiting list
	public void update(int pos) 
	{
		this.position = pos;
	}
	
	//method added for testing
	public int getPosition()
	{
		return position;
	}
}
