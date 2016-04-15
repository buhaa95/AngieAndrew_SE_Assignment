package uom.edu.se_assignment.LibrarySystem;

import org.junit.After;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class CatalogueTest {

	Catalogue catalogue;	
	List<Book> collection;
	
	Book myBook, myBook1;
	Genre genre;
	
	@Before
	public void startup()
	{
		collection = new ArrayList<Book>();	
		genre = new Genre("Fiction");
		
		myBook = new Book("Harry Potter and the Half Blood Prince", "J.K. Rowling", genre, 2008,1, null, null );
	    myBook1 = new Book("Lord of the Rings", "J.R.R Tolkien", genre, 2005, 1, null, null); 
		
	    // user is put to null, cause if the book is loaned out, then it won't be in the catalogue
	    // otherwise it would just be a whole library. Same goes for loaned out date
	    
		collection.add(myBook);
		collection.add(myBook1);
		
		catalogue = new Catalogue(collection);
	}
	
	@Test
	public void getAllBooksTest()
	{
		Assert.assertEquals(collection, catalogue.getAllBooks());
		
	}
	
	@Test
	public void searchByTitleTest() 
	{	
		Assert.assertEquals(collection.contains(myBook), catalogue.searchByTitle("Harry").contains(myBook));			
	}
	
	// If both the parameters in the above return true, then test is valid (contains will return boolean)
	
	@Test
	public void searchByGenreTest()
	{
		Assert.assertEquals(collection.contains(myBook1.getGenre()), catalogue.searchByGenre("Fiction").contains(myBook1));
	}
	
	@Test
	public void searchByYearTest()
	{
		Assert.assertEquals(collection.contains(myBook), catalogue.searchByYear(2008).contains(myBook));
	}
	
	@After
	public void teardown()
	{
		collection = null;
		
	}

}
