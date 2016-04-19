package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library 
{
	private List<Book> booksOnLoan;
	private List<User> users;
	private Catalogue c = new Catalogue();
	
	public Library()
	{
		booksOnLoan = new ArrayList<Book>();
		users = new ArrayList<User>();
	}

	public List<Book> getBooksOnLoan() 
	{
		return booksOnLoan;
	}

	public List<User> getUsers() 
	{
		return users;
	}
	
	public void addUser(User u)
	{
		if(u.isValidId(u.getIdNumber())) 
			users.add(u);
		else throw new IllegalArgumentException("User with this ID already exists");
	}
	
	
	public void addBook(Book b)
	{
		if (b.isValidId(b.getBookId()))
			c.addBook(b);
		else 
			throw new IllegalArgumentException("User with this ID already exists");
	}
	
	public void removeUser(User u)
	{
		if (users.contains(u))
		{
			users.remove(u);
		}else throw new IllegalArgumentException("User not found!");
	}
	
	public void loanBookTo(Book b, User u)
	{
		if(!isOnLoan(b) && canBurrow(u))
		{
			u.addBook(b);
			booksOnLoan.add(b);
		}
		else throw new IllegalArgumentException("Loan unsuccessful. Book is either already on Loan, or "
				+ "User is not allowed to burrow any more books for now.");
	}
	
	public void returnBook (Book b)
	{
		if (booksOnLoan.contains(b))
		{
			if (isFromCollection(b))
			{
				User u = b.getLoanee();
				u.removeBook(b);
				booksOnLoan.remove(b);
			}else throw new IllegalArgumentException("Book is not from this Libarary's collection");
		}else throw new IllegalArgumentException("User has not borrowed this book. Cannot return it.");
	}
	
	//HELPER FUNCTIONS
	
	private boolean isOnLoan(Book b)
	{
		return booksOnLoan.contains(b);
	}
	
	private boolean isFromCollection(Book b)
	{
		return c.getAllBooks().contains(b);
	}
	
	private boolean canBurrow(User u)
	{
		if (u.getListOfBurrowedBooks().size()>= 3) return false;
		
		List<Book> burrowedbook = new ArrayList<Book>();
		Date today = new Date();
		for (final Book b : burrowedbook)
		{
			Date timeOfLoan = b.getLoanOutDate();
			int daysBetween = (int)( (today.getTime() - timeOfLoan.getTime()) / (1000 * 60 * 60 * 24));
			
			// 4 weeks = 28 days
			if (daysBetween > 28) return false;
		}
		return true;
	}
	
}
