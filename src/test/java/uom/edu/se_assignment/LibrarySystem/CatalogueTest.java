package uom.edu.se_assignment.LibrarySystem;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatalogueTest {
	Catalogue catalogue;
	Book b, b1, b2, b3, b4;
	GenreFilter genreFilter;
	YearFilter yearFilter;
	AuthorFilter authorFilter;
	TitleFilter titleFilter;
	
	@Before
	public void startup()
	{	
		catalogue = Catalogue.getInstance();		
		//user arguments are set to null as it is beyond the purpose of this test suite to test user objects
		
		b = new Book(1,"Harry Potter and the Chamber of Secrets", "J.K. Rowling", Genre.FICTION, 2000, 1, null, null);
	    b1 = new Book(2,"The Hunger Games", "Suzanne Collins", Genre.FICTION, 2010, 1, null, null); 
	    b2 = new Book(3,"Java for dummies", "Barry Burd", Genre.SCIENCE, 2005, 1, null, null);
	    b3 = new Book(4,"Catching Fire", "Suzanne Collins", Genre.FICTION, 2011, 1, null, null);
	    b4 = new Book(5,"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", Genre.FICTION, 2001, 1, null, null);
	    
	   	    
		Catalogue.addBook(b);
		Catalogue.addBook(b1);
		Catalogue.addBook(b2);
		Catalogue.addBook(b3);
		Catalogue.addBook(b4);
		
		genreFilter = new GenreFilter();
		yearFilter = new YearFilter();
		titleFilter = new TitleFilter();
		authorFilter = new AuthorFilter();
	}
	
	@Test
	public void getAllBooksTest()
	{
		Assert.assertEquals(5, catalogue.getAllBooks().size());
	}
	
	@Test
	public void searchByTitleTest() 
	{
		Assert.assertEquals(2, catalogue.searchForBooks(titleFilter, "Harry").size());			
	}
	
	@Test
	public void searchByGenreTest()
	{
		Assert.assertEquals(4, catalogue.searchForBooks(genreFilter, Genre.FICTION.getGenreText()).size());
	}
	
	@Test
	public void searchByYearTest()
	{
		Assert.assertEquals(1, catalogue.searchForBooks(yearFilter, "2005").size());
	}
	
	@Test
	public void searchByAuthorTest()
	{
		Assert.assertEquals(2, catalogue.searchForBooks(authorFilter, "Rowling").size());		
	}
	
	@After
	public void teardown()
	{
		catalogue = null;
		b = b1 = b2 = b3 = null;
		genreFilter = null;
		yearFilter = null;
		titleFilter = null;
		authorFilter = null;
	}

}
