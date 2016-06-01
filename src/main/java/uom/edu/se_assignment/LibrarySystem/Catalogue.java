package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Catalogue 
{
	//created a static property referring to an instance of the null class
	public static Catalogue instance = null;
	private static List<Book> collection;
	
	//static method to provide access
	public static Catalogue getInstance()
	{
		if (instance == null)
			instance = new Catalogue();
		
		return instance;
	}
	
	//constructor changed to private so it cannot be called from another class
	private Catalogue() 
	{
		collection = new ArrayList<Book>();
	}
	
	public static void addBook(Book b)
	{
		if (isValidBookId(b.getBookId()))
			collection.add(b);
		else 
			return;
	}
	
	public List<Book> getAllBooks() 
	{
		return collection;
	}
	
	public List<Book> searchForBooks(FilterCriteria filter, String keyword)
	{
		return filter.filterCriteria(collection, keyword);
	}
	
	/* Following code is not required anymore
	public List<Book> searchByTitle(String word)
	{
		word = word.toUpperCase();
		List<Book> myList = new ArrayList<Book>();
		
		for(final Book b: collection)
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
		
		for(final Book b: collection)
		{
			if(b.getGenre().equals(genre))
			{
				myList.add(b);
			}
		}
		return myList;
	}
	
	public List<Book> searchByYear(int year)
	{
		List<Book> myList = new ArrayList<Book>();
		
		for(final Book b: collection)
		{
			if(b.getPublicationYear()==year)
			{
				myList.add(b);
			}
		}
		return myList;
	}	
	*/
	
	private static boolean isValidBookId(int id)
	{	
		for (final Book b: collection)
		{
			if(b.getBookId() == id) return false;
		}
		return true;
	}
}
