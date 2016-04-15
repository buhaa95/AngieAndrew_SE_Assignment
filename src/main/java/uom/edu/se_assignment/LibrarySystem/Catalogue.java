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
		return null;
	}
	
	/**
	 * 
	 * @param word
	 * @return
	 */
	public List<Book> searchByTitle(String word)
	{
		List<Book> myList = new ArrayList<Book>();
	
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
		
		
		return null;
	}
	
	/**
	 * 
	 * @param year
	 * @return
	 */
	public List<Book> searchByYear(int year)
	{
		List<Book> myList = new ArrayList<Book>();
		
	
		return myList;
	}	
}
