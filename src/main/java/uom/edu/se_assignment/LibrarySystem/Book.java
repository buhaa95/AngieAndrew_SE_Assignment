package uom.edu.se_assignment.LibrarySystem;
import java.util.Date;
import java.util.List;

public class Book {
	private int bookId;	
	private String Title;
	private String Author;
	private Genre Genre;
	private int PublicationYear;
	private int Edition;
	private User Loanee;
	private Date LoanOutDate;
	
	Book(int id, String t, String a, Genre g, int y, int e, User l, Date d)
	{
		// validation for id
		if (isValidId(id))
			bookId = id;
		else
			throw new IllegalArgumentException("User with this ID already exists");
		
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

	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	
	//helper function
	private boolean isValidId(int id)
	{
		List<Book> catalogue =  Catalogue.collection;
		for (final Book b: catalogue)
		{
			if(b.getBookId() == id) return false;
		}
		return true;
	}
	
	
}
