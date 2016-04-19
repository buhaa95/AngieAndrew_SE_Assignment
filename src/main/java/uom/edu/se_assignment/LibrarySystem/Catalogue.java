package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Catalogue 
{
	protected static List<Book> collection;
	
	public List<Book> getAllBooks() 
	{
		return collection;
	}
	
	public List<Book> searchByTitle(String word)
	{
		word = word.toUpperCase();
		List<Book> myList = new ArrayList<Book>();
		
		for(final Book b: Catalogue.collection)
		{
			if(b.getTitle().toUpperCase().contains(word))
			{
				myList.add(b);
			}
		}
		return myList;
	}
	
	public List<Book> searchByGenre(Genre genre)
	{
		List<Book> myList = new ArrayList<Book>();
		
		for(final Book b: Catalogue.collection)
		{
			if(b.getGenre()== genre)
			{
				myList.add(b);
			}
		}
		return myList;
	}
	
	public List<Book> searchByYear(int year)
	{
		List<Book> myList = new ArrayList<Book>();
		
		for(final Book b: Catalogue.collection)
		{
			if(b.getPublicationYear()==year)
			{
				myList.add(b);
			}
		}
		return myList;
	}	
}
