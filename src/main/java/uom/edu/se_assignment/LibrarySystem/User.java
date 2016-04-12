package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User
{
	private int idNumber;
	private String FullName;
	private String Address;
	private String ContactNumber;
	private List<Book> listOfBurrowedBooks = new ArrayList<Book>();
	
	User(int id, String name, String address, String contact)
	{
		idNumber = id;
		FullName = name;
		Address = address;
		ContactNumber = contact;
	}

	public int getIdNumber() 
	{
		return 0;
	}

	public void setIdNumber(int idNumber) 
	{
		
	}

	public String getFullName() {
		return null;
	}

	public void setFullName(String fullName) 
	{
		
	}

	public String getAddress() 
	{
		return null;
	}

	public void setAddress(String address) 
	{
		
	}

	public String getContactNumber() 
	{
		return null;
	}

	public void setContactNumber(String contactNumber) 
	{
		
	}

}
