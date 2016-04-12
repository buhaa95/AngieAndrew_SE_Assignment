package uom.edu.se_assignment.LibrarySystem;


public class Book {
	
	private String Title;
	private String Author;
	private Genre Genre;
	private int PublicationYear;
	private int Edition;
	private User Loanee;
	private String LoanOutDate;
	
	Book(String t, String a, Genre g, int y, int e, User l, String d)
	{
		Title = t;
		Author = a;
		Genre = g;
		PublicationYear = y;
		Edition = e;
		Loanee = l;
		LoanOutDate = d;
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
	
	public String getLoanOutDate()
	{
		return this.LoanOutDate;
		
	}
	
	public void setLoanOutDate(String LoanOutDate)
	{
		this.LoanOutDate = LoanOutDate;
		
	}
	
	
}
