package uom.edu.se_assignment.LibrarySystem;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CatalogueTest {
	Catalogue catalogue;
	Book b, b1, b2, b3;
	
	@Before
	public void startup()
	{	
		catalogue = Catalogue.getInstance();
		
		/*Since now collection is static the books added in the previous suite will now
		 * follow in this suite. Therefore we do not need to create anymore instances of books
		 */
		
		//user arguments are set to null as it is beyond the purpose of this test suite to test user objects
		
		b = new Book(27,"Harry Potter and the Half Blood Prince", "J.K. Rowling", Genre.FICTION, 2008, 1, null, null);
	    b1 = new Book(48,"Lord of the Rings", "J.R.R Tolkien", Genre.FICTION, 2005, 1, null, null); 
	    b2 = new Book(50,"Java for dummies", "Barry Burd", Genre.SCIENCE, 2005, 1, null, null);
	    b3 = new Book(28,"Harry Potter and the Deathly Hallows", "J.K. Rowling", Genre.FICTION, 2010, 1, null, null);
	   	    
		Catalogue.addBook(b);
		Catalogue.addBook(b1);
		Catalogue.addBook(b2);
		Catalogue.addBook(b3);
	}
	
	@Test
	public void getAllBooksTest()
	{
		Assert.assertEquals(8, catalogue.getAllBooks().size());
		
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
		catalogue = null;
		//b = b1 = b2 = b3 = null;
	}

}
