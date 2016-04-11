package uom.edu.se_assignment.LibrarySystem;

import java.util.Date;

public class Book {
	
	private String Title;
	private String Author;
	//TODO Genre should be changed to genre object
	private String Genre;
	private int PublicationYear;
	private int Edition;
	private User Loanee;
	private String LoanOutDate;
	
	Book(String t, String a, String g, int y, int e, User l, String d)
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
		// TODO setting
		//this.Title = Title;
	}
	
	public String getAuthor()
	{
		return this.Author;
	}
	
	public void setAuthor(String Author)
	{
		
	}
	
	public String getGenre()
	{
		return this.Genre;
	}
	
	public void setGenre(String genre)
	{
		
		
	}
	
	public int getPublicationYear()
	{
		return this.PublicationYear;
	}
	
	public void setPublicationYear(int year)
	{
		
	}
	
	public int getEdition()
	{
		return this.Edition;
		
	}
	
	public void setEdition(int edition)
	{
		
		
	}
	
	public User getLoanee()
	{
		return this.Loanee;
	}
	
	public void setLoanee(User loanee)
	{
		
		
	}
	
	public String getLoanOutDate()
	{
		return this.LoanOutDate;
		
	}
	
	public void setLoanOutDate(String LoanOutDate)
	{
		
		
	}
	
	
}
