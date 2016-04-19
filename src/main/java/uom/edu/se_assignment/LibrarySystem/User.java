package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User
{
	private int idNumber;
	private String FullName;
	private String Address;
	private String ContactNumber;
	private List<Book> listOfBurrowedBooks = new ArrayList<Book>();
	
	User()
	{}
	
	User(int id, String name, String address, String contact)
	{
		//validation for id
		if(isValidId(id))
			idNumber = id;
		else throw new IllegalArgumentException("User with this ID already exists");
		
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
	
	
	//user actions
	public void borrowBook (Book b)
	{
		if(!isOnLoan(b) && this.canBurrow())
		{
			listOfBurrowedBooks.add(b);
			Library.booksOnLoan.add(b);
		}
		else throw new IllegalArgumentException("Loan unsuccessful. Book is either already on Loan, or "
				+ "User is not allowed to burrow any more books for now.");
	}
	
	public void returnBook (Book b)
	{
		if (listOfBurrowedBooks.contains(b) && Library.booksOnLoan.contains(b))
		{
			if (isFromCollection(b))
			{
				listOfBurrowedBooks.remove(b);
				Library.booksOnLoan.remove(b);
			}else throw new IllegalArgumentException("Book is not from this Libarary's collection");
		}else throw new IllegalArgumentException("User has not borrowed this book. Cannot return it.");
	}
	
	/********************
	 * Helper functions *
	 ********************/
	private boolean isValidId(int id)
	{
		List<User> libraryUsers =  Library.users;
		for (final User u: libraryUsers)
		{
			if(u.getIdNumber() == id) return false;
		}
		return true;
	}
	
	private boolean isOnLoan(Book b)
	{
		return Library.booksOnLoan.contains(b);
	}
	
	private boolean isFromCollection(Book b)
	{
		return Catalogue.collection.contains(b);
	}
	
	private boolean canBurrow()
	{
		if (listOfBurrowedBooks.size()>= 3) return false;
		
		Date today = new Date();
		for (final Book b : listOfBurrowedBooks) 
		{
			Date timeOfLoan = b.getLoanOutDate();
			int daysBetween = (int)( (today.getTime() - timeOfLoan.getTime()) / (1000 * 60 * 60 * 24));
			
			// 4 weeks = 28 days
			if (daysBetween > 28) return false;
		}
		return true;
	}
	

	

}
