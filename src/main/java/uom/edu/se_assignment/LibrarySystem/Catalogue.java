package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Catalogue 
{
	private static List<Book> collection;
	
	public Catalogue(List<Book> collection)
	{
		Catalogue.collection = collection;
	
	}
	
	public List<Book> getAllBooks() 
	{
		return collection;
	}
	
	/**
	 * 
	 * @param word
	 * @return
	 */
	public List<Book> searchByTitle(String word)
	{
		word = word.toUpperCase();
		List<Book> myList = new ArrayList<Book>();
		
		for(Book b: Catalogue.collection)
		{
			if(b.getTitle().toUpperCase().contains(word))
			{
				myList.add(b);
			}
		}
		return myList;
	}
	
	/**
	 * 
	 * @param genre
	 * @return
	 */
	public List<Book> searchByGenre(String genre)
	{
		List<Book> myList = new ArrayList<Book>();
		Genre g = new Genre(genre);
		
		for(Book b: Catalogue.collection)
		{
			if(b.getGenre()==g)
			{
				myList.add(b);
			}
		}
		return myList;
	}
	
	/**
	 * 
	 * @param year
	 * @return
	 */
	public List<Book> searchByYear(int year)
	{
		List<Book> myList = new ArrayList<Book>();
		
		for(Book b: Catalogue.collection)
		{
			if(b.getPublicationYear()==year)
			{
				myList.add(b);
			}
		}
		return myList;
	}	
}
