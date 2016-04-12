package uom.edu.se_assignment.LibrarySystem;

import java.util.List;

public class Library 
{
	private List<Book> collection;
	private List<Book> booksOnLoan;
	private List<User> users;
	
	public Library(List<Book> collection, List<Book> booksOnLoan, List<User> users) 
	{
		this.collection = collection;
		this.booksOnLoan = booksOnLoan;
		this.users = users;
	}
	
	public List<Book> getCollection() 
	{
		return collection;
	}

	/*public void setCollection(List<Book> collection) 
	{
		
	}*/

	public List<Book> getBooksOnLoan() 
	{
		return booksOnLoan;
	}

	/*public void setBooksOnLoan(List<Book> booksOnLoan) 
	{
		
	}*/

	public List<User> getUsers() 
	{
		return users;
	}

	/*public void setUsers(List<User> users) 
	{
		
	}*/
	
	
}
