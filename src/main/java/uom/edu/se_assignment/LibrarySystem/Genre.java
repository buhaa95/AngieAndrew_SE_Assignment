package uom.edu.se_assignment.LibrarySystem;

public enum Genre 
{	
	COMEDY("Comedy"),
	DRAMA("Drama"),
	NON_FICTION("Non Fiction"),
	FICTION("Fiction"),
	NOVEL("Novel"),
	SATIRE("Satire"),
	TRAGEDY("Tragedy"),
	HORROR("Horro"), 
	BIOGRAPHY("Biography"),
	CLASSIC("Classic"),
	HISTORY("History"),
	SCIENCE("Science"),
	MYSTERY("Mystery");
	
	String text;
	
	Genre(String text)
	{
		this.text = text;
	}
	public String getGenreText()
	{
		return text;
	}
}
