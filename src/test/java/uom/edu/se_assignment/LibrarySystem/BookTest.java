package uom.edu.se_assignment.LibrarySystem;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest{
	
	Book myBook;
	@Before 
	public void startup() 
	{
		myBook = new Book("Harry Potter and the Half Blood Prince", "J.K. Rowling", "Fiction", 2008,1, null, "21/12/2012" );
	}
	
	@Test
	public void getTitleTest()
	{
		Assert.assertEquals("Harry Potter and the Half Blood Prince", myBook.getTitle());
	}
	
	@Test
	public void setTitleTest()
	{
		myBook.setTitle("Lord of the Rings");
		Assert.assertEquals("Lord of the Rings", myBook.getTitle());
	}
	
	
	@Test
	public void getAuthorTest()
	{
		Assert.assertEquals("J.K. Rowling", myBook.getAuthor());
	}
	
	@Test
	public void setAuthorTest()
	{
		myBook.setAuthor("J.R.R Tolkien");
		Assert.assertEquals("J.R.R Tolkien", myBook.getAuthor());
	}
	
	
	
	@Test
	public void getYearTest()
	{
		Assert.assertEquals(2008, myBook.getPublicationYear());
	}
	
	@Test
	public void setPublicationYearTest()
	{
		myBook.setPublicationYear(2005);
		Assert.assertEquals(2005, myBook.getPublicationYear());
	}
	
	
	@Test
	public void getGenreTest()
	{
		Assert.assertEquals("Fiction", myBook.getGenre());
	}
	
	@Test
	public void setGenreTest()
	{
		myBook.setGenre("Mystery");
		Assert.assertEquals("Mystery", myBook.getGenre());
	}
	
	
	@Test
	public void getEditionTest()
	{
		Assert.assertEquals(1, myBook.getEdition());
	}
	
	@Test
	public void setEditionTest()
	{
		myBook.setEdition(2);
		Assert.assertEquals(2, myBook.getEdition());
	}
	
	
	@Test
	public void getUserTest()
	{
		Assert.assertEquals(null, myBook.getLoanee());
	}
	
	@Test
	public void setUserTest()
	{
		myBook.setLoanee(null);
		Assert.assertEquals(null, myBook.getLoanee());
	}
	
	
	@Test
	public void getLoanOutDateTest()
	{
		Assert.assertEquals("21/12/2012", myBook.getLoanOutDate());
	}
	
	@Test
	public void setLoanOutDateTest()
	{
		myBook.setLoanOutDate("24/12/2016");
		Assert.assertEquals("24/12/2016", myBook.getLoanOutDate());
	}
	
	@After
	public void teardown()
	{
		myBook = null;
	}
}
