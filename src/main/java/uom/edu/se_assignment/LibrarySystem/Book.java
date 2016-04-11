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
		
		return null;
	}
	
	public String getAuthor()
	{
		return null;
	}
	
	public String getGenre()
	{
		return null;
	}
	
	public int getYear()
	{
		return 0;
	}
	
	public int getEdition()
	{
		return 0;
		
	}
	
	public User getLoanee()
	{
		return null;
	}
	
	public String getLoanOutDate()
	{
		return null;
		
	}
	
	
}
