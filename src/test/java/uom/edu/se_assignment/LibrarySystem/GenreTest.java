package uom.edu.se_assignment.LibrarySystem;

import org.junit.*;

public class GenreTest 
{
	Book myBook;
	
	@Before
	public void startup()
	{
		myBook = new Book(25,"Harry Potter and the Half Blood Prince", "J.K. Rowling", Genre.FICTION, 2008,1, null, null);
	}
	
	@Test
	public void getGenreTextTest()
	{
		Assert.assertEquals("Fiction", myBook.getGenre().getGenreText());
	}
	
	@After
	public void teadrown()
	{
		myBook = null;
	}
}
