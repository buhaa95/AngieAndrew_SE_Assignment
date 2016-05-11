package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library /*implements Observer*/
{
	protected List<Book> booksOnLoan;
	private List<User> users;
	private Catalogue cat = Catalogue.getInstance();
	
	//private Observable observable = null;
	
	public Library()
	{
		booksOnLoan = new ArrayList<Book>();
		users = new ArrayList<User>();
	}
	
	/*public Library(Observable observable)
	{
		this.observable = observable;
	}*/

	public List<Book> getBooksOnLoan() 
	{
		return booksOnLoan;
	}

	public List<User> getUsers() 
	{
		return users;
	}
	
	/*public void update(Book b, User u){
		loanBookTo((Book)b.getWaitingList().poll(), u);
	}*/
	
	public void addUser(User u)
	{
		if(isValidUserId(u.getIdNumber())) 
			users.add(u);
		else throw new IllegalArgumentException("User with this ID already exists");
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
		}else throw new IllegalArgumentException("User not found!");
	}
	
	public void loanBookTo(Book b, User u)
	{
		if(!b.getIsOnLoan() && canBurrow(u))
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
	
	public void returnBook (Book b)
	{
		if (b.getIsOnLoan())
		{
			if (isFromCollection(b))
			{
				User u = b.getLoanee();
				u.removeBook(b);
				booksOnLoan.remove(b);
				b.setLoanOutDate(null);
				b.setLoanee(null);
				b.setOnLoan(false);
				
			}else throw new IllegalArgumentException("Book is not from this Libarary's collection");
		}else throw new IllegalArgumentException("User has not borrowed this book. Cannot return it.");
	}
	
	//HELPER FUNCTIONS
	private boolean isFromCollection(Book b)
	{
		List<Book> list = cat.getAllBooks();
		for(Book book: list)
		{
			if(book.getBookId() == b.getBookId())
				return true;
		}
		return false;
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
		if (users == null)
			return true;
		
		for (final User u: users)
		{
			if(u.getIdNumber() == id) return false;
		}
		return true;
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
