package uom.edu.se_assignment.LibrarySystem;

import java.util.List;

public class Library 
{
	protected static List<Book> booksOnLoan;
	protected static List<User> users;

	public List<Book> getBooksOnLoan() 
	{
		return booksOnLoan;
	}

	public List<User> getUsers() 
	{
		return users;
	}
	
	//no need for setters
	
	
}
