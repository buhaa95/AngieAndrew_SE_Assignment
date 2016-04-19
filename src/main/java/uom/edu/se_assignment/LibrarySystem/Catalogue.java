package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Catalogue 
{
	private List<Book> collection;
	
	public Catalogue() {
		collection = new ArrayList<Book>();
	}
	
	public void addBook(Book b)
	{
		collection.add(b);
	}
	
	public List<Book> getAllBooks() 
	{
		List<Book> list = new ArrayList<Book>();
		list.addAll(collection);
		return list;
	}
	
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
		
		for(final Book b: collection)
		{
			if(b.getPublicationYear()==year)
			{
				myList.add(b);
			}
		}
		return myList;
	}	
}
