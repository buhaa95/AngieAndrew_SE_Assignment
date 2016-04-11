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
	public void setTitleTest()
	{
		myBook.setTitle("Lord of the Rings");
		Assert.assertEquals("Lord of the Rings", myBook.getTitle());
	}
	
	
	@org.junit.Test
	public void getAuthorTest()
	{
		Assert.assertEquals("J.K. Rowling", myBook.getAuthor());
	}
	
	@org.junit.Test
	public void setAuthorTest()
	{
		myBook.setAuthor("J.R.R Tolkien");
		Assert.assertEquals("J.R.R Tolkien", myBook.getAuthor());
	}
	
	
	
	@org.junit.Test
	public void getYearTest()
	{
		Assert.assertEquals(2008, myBook.getPublicationYear());
	}
	
	@org.junit.Test
	public void setPublicationYearTest()
	{
		myBook.setPublicationYear(2005);
		Assert.assertEquals(2005, myBook.getPublicationYear());
	}
	
	
	@org.junit.Test
	public void getGenreTest()
	{
		Assert.assertEquals("Fiction", myBook.getGenre());
	}
	
	@org.junit.Test
	public void setGenreTest()
	{
		myBook.setGenre("Mystery");
		Assert.assertEquals("Mystery", myBook.getGenre());
	}
	
	
	@org.junit.Test
	public void getEditionTest()
	{
		Assert.assertEquals(1, myBook.getEdition());
	}
	
	@org.junit.Test
	public void setEditionTest()
	{
		myBook.setEdition(2);
		Assert.assertEquals(2, myBook.getEdition());
	}
	
	
	@org.junit.Test
	public void getUserTest()
	{
		Assert.assertEquals(null, myBook.getLoanee());
	}
	
	@org.junit.Test
	public void setUserTest()
	{
		myBook.setLoanee(null);
		Assert.assertEquals(null, myBook.getLoanee());
	}
	
	
	@org.junit.Test
	public void getLoanOutDateTest()
	{
		Assert.assertEquals("21/12/2012", myBook.getLoanOutDate());
	}
	
	@org.junit.Test
	public void setLoanOutDateTest()
	{
		myBook.setLoanOutDate("24/12/2016");
		Assert.assertEquals("24/12/2016", myBook.getLoanOutDate());
	}
}
