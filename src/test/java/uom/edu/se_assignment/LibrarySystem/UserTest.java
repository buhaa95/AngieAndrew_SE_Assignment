package uom.edu.se_assignment.LibrarySystem;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user;
	Book book;
	Date date;
	
	@Before
	public void startup()
	{
		user = new User(1, "John Smith", "Mosta", "00356 79007789"); 
		date = new Date();
		book = new Book(2, "Macbeth", "William Shakespear", Genre.TRAGEDY, 1600, 1, user, date);
	}
	
	@Test
	public void getIdNumberTest()
	{
		Assert.assertEquals(1, user.getIdNumber());
	}
	
	@Test
	public void setIdNumberTest()
	{
		user.setIdNumber(21);
		Assert.assertEquals(21, user.getIdNumber());
	}
	
	@Test
	public void getFullNameTest()
	{
		Assert.assertEquals("John Smith", user.getFullName());
	}
	
	@Test
	public void setFullNameTest()
	{
		user.setFullName("Tony Debono");
		Assert.assertEquals("Tony Debono", user.getFullName());
	}

	@Test
	public void getAddressTest()
	{
		Assert.assertEquals("Mosta", user.getAddress());
	}
	
	@Test
	public void setAddressTest()
	{
		user.setAddress("Zabbar");
		Assert.assertEquals("Zabbar", user.getAddress());
	}
	
	@Test
	public void getContactNumberTest()
	{
		Assert.assertEquals("00356 79007789", user.getContactNumber());
	}
	
	@Test
	public void setContactNumberTest()
	{
		user.setContactNumber("12345");
		Assert.assertEquals("12345", user.getContactNumber());
	}
	
	@Test 
	public void addBookTest()
	{
		user.addBook(book);
		Assert.assertEquals(1, user.getListOfBurrowedBooks().size());
	}
	
	@Test
	public void removeBookTest()
	{
		user.removeBook(book);
		Assert.assertEquals(0, user.getListOfBurrowedBooks().size());
	}
	
	@After
	public void teardown()
	{
		user = null;
	}
}
