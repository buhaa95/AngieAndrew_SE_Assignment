package uom.edu.se_assignment.LibrarySystem;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatalogueTest {
	Catalogue catalogue;
	Book myBook, myBook1, myBook2, myBook3;
	
	@Before
	public void startup()
	{	
		catalogue = new Catalogue();
		
		// user is put to null, cause if the book is loaned out, then it won't be in the catalogue
	    // otherwise it would just be a whole library. Same goes for loaned out date
		myBook = new Book(27,"Harry Potter and the Half Blood Prince", "J.K. Rowling", Genre.FICTION, 2008, 1, null, null);
	    myBook1 = new Book(48,"Lord of the Rings", "J.R.R Tolkien", Genre.FICTION, 2005, 1, null, null); 
	    myBook2 = new Book(50,"Java for dummies", "Barry Burd", Genre.SCIENCE, 2005, 1, null, null);
	    myBook3 = new Book(28,"Harry Potter and the Deathly Hallows", "J.K. Rowling", Genre.FICTION, 2010, 1, null, null);
	   	    
		catalogue.addBook(myBook);
		catalogue.addBook(myBook1);
		catalogue.addBook(myBook2);
		catalogue.addBook(myBook3);
	}
	
	@Test
	public void getAllBooksTest()
	{
		Assert.assertEquals(4, catalogue.getAllBooks().size());
		
	}
	
	@Test
	public void searchByTitleTest() 
	{	
		Assert.assertEquals(2, catalogue.searchByTitle("Harry").size());			
	}
	
	@Test
	public void searchByGenreTest()
	{
		Assert.assertEquals(3, catalogue.searchByGenre(Genre.FICTION).size());
	}
	
	@Test
	public void searchByYearTest()
	{
		Assert.assertEquals(2, catalogue.searchByYear(2005).size());
	}
	
	@After
	public void teardown()
	{
		
	}

}
