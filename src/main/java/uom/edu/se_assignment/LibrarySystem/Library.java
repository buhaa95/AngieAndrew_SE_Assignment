package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library
{
	protected List<Book> booksOnLoan;
	private List<User> users;
	private Catalogue cat = Catalogue.getInstance();
	
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
		if(isValidUserId(u.getIdNumber())) 
			users.add(u);
		//else add nothing
	}
	
	
	public void addBook(Book b)
	{		
		Catalogue.addBook(b);
	}
	
	public void removeUser(User u)
	{
		if (users.contains(u))
		{
			users.remove(u);
		}
		//else nothing to remove
	}
	
	public void loanBookTo(Book b, User u)
	{
		if(b.getIsOnLoan() && canBurrow(u))
		{
			//adding to waiting list
			b.addObserver((Observer) u);
		}
		else if(!b.getIsOnLoan() && canBurrow(u))
		{
			Date date = new Date();
			
			b.setLoanee(u);
			b.setLoanOutDate(date);
			b.setOnLoan(true);
			u.addBook(b);
			booksOnLoan.add(b);
		}
		else throw new IllegalArgumentException("Loan unsuccessful. Book is either already on Loan, or "
				+ "User is not allowed to burrow any more books for now.");
	}
	
	//removed exceptions 
	public void returnBook (Book b)
	{
		if (b.getIsOnLoan() && isFromCollection(b)) 
		{
			User u = b.getLoanee();
			u.removeBook(b);
			booksOnLoan.remove(b);
			b.setLoanOutDate(null);
			b.setLoanee(null);
			b.setOnLoan(false);

			if (b.getWaitingList().size() > 0) 
			{
				loanBookTo(b, (User) b.getWaitingList().peek());
				b.removeObserver((Observer) u);
			}

			if (b.getWaitingList().size() > 0) 
			{
				ArrayList<Observer> list = new ArrayList<Observer>(b.getWaitingList());
				for (Observer o : list)
					b.notifyObserver(o);
			}
		}
	}
	
	
	//HELPER FUNCTIONS
	private boolean isFromCollection(Book b)
	{
		boolean flag = false;
		List<Book> list = cat.getAllBooks();
		for(Book book: list)
		{
			if(book.getBookId() == b.getBookId())
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	private boolean canBurrow(User u)
	{
		if (u.getListOfBurrowedBooks().size()>= 3) return false;
		
		List<Book> burrowedbook = new ArrayList<Book>();
		burrowedbook = u.getListOfBurrowedBooks();
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
	
	private boolean isValidUserId(int id)
	{
		for (final User u: users)
		{
			if(u.getIdNumber() == id) return false;
		}
		return true;
	}	
}
