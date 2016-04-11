package uom.edu.se_assignment.LibrarySystem;

/*import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;*/

import org.junit.*;

public class BookTest /*extends TestCase*/ {
	
	Book myBook;
	@Before 
	public void startup() 
	{
		myBook = new Book("Harry Potter and the Half Blood Prince", "J.K. Rowling", "Fiction", 2008,1, null, "21/12/2012" );
	}
	
	@org.junit.Test
	public void getTitleTest()
	{
		Assert.assertEquals("Harry Potter and the Half Blood Prince", myBook.getTitle());
	}
	
	@org.junit.Test
	public void getAuthorTest()
	{
		Assert.assertEquals("J.K. Rowling", myBook.getAuthor());
	}
	
	@org.junit.Test
	public void getYearTest()
	{
		Assert.assertEquals(2008, myBook.getYear());
	}
	
	@org.junit.Test
	public void getGenreTest()
	{
		Assert.assertEquals("Fiction", myBook.getGenre());
	}
	
	@org.junit.Test
	public void getEditionTest()
	{
		Assert.assertEquals(1, myBook.getEdition());
	}
	
	@org.junit.Test
	public void getUserTest()
	{
		Assert.assertEquals(null, myBook.getLoanee());
	}
	
	@org.junit.Test
	public void getLoanOutDateTest()
	{
		Assert.assertEquals("21/12/2012", myBook.getLoanOutDate());
	}
}
