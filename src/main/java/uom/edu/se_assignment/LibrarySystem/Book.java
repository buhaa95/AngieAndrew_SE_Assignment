package uom.edu.se_assignment.LibrarySystem;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Book implements Observable
{
	private int bookId;	
	private String Title;
	private String Author;
	private Genre Genre;
	private int PublicationYear;
	private int Edition;
	private User Loanee;
	private Date LoanOutDate;
	private boolean isOnLoan;
	
	private Queue<Observer> waitingList = new LinkedList<Observer>();

	Book(int id, String t, String a, Genre g, int y, int e, User l, Date d)
	{
		// validation for id
		bookId = id;
		Title = t;
		Author = a;
		Genre = g;
		PublicationYear = y;
		Edition = e;
		Loanee = l;
		LoanOutDate = d;
	}
	
	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		
		return this.Title;
	}
	
	public void setTitle(String Title)
	{
		this.Title = Title;
	}
	
	public String getAuthor()
	{
		return this.Author;
	}
	
	public void setAuthor(String Author)
	{
		this.Author = Author;
	}
	
	public Genre getGenre()
	{
		return this.Genre;
	}
	
	public void setGenre(Genre Genre)
	{
		this.Genre = Genre;
		
	}
	
	public int getPublicationYear()
	{
		return this.PublicationYear;
	}
	
	public void setPublicationYear(int year)
	{
		this.PublicationYear = year;
	}
	
	public int getEdition()
	{
		return this.Edition;
		
	}
	
	public void setEdition(int Edition)
	{
		this.Edition = Edition;
		
	}
	
	public User getLoanee()
	{
		return this.Loanee;
	}
	
	public void setLoanee(User Loanee)
	{
		this.Loanee = Loanee;
		
	}
	
	public Date getLoanOutDate()
	{
		return this.LoanOutDate;
		
	}
	
	public void setLoanOutDate(Date LoanOutDate)
	{
		this.LoanOutDate = LoanOutDate;
		
	}

	public boolean getIsOnLoan() 
	{
		return isOnLoan;
	}

	public void setOnLoan(boolean isOnLoan) 
	{
		this.isOnLoan = isOnLoan;
	}
	
	public Queue<Observer> getWaitingList() 
	{
		return waitingList;
	}
	
	public void addObserver(Observer o)
	{
		waitingList.add(o);
	}

	public void removeObserver(Observer o)
	{
		waitingList.poll();
	}
		
	public void notifyObserver(Observer o)
	{
		ArrayList <Observer> list = new ArrayList<Observer>(waitingList);
		o.update(list.indexOf(o) + 1);
	}	
}
