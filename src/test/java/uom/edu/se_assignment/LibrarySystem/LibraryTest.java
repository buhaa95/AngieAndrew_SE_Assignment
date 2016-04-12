package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	Library lib;
	List<Book> collection;
	List<Book> booksOnLoan;
	List<User> users;
	
	@Before
	public void setup()
	{
		collection = new ArrayList<Book>();
		Book myBook = new Book("Harry Potter and the Half Blood Prince", "J.K. Rowling", null, 2008,1, null, "21/12/2012" );
		Book myBook2 = new Book("Harry Potter and the Half Blood Prince2", "J.K. Rowling", null, 2007,1, null, "21/12/2013" );
		
		collection.add(myBook);
		collection.add(myBook2);
		
		booksOnLoan = new ArrayList<Book>();
		booksOnLoan.add(myBook);
		
		users = new ArrayList<User>();
		User user1 = new User(1234, "Mary", "Nadur", "123456789");
		
		users.add(user1);
		
		lib = new Library(collection, booksOnLoan, users);
	}

	@Test
	public void getCollectionTest()
	{
		Assert.assertEquals(collection, lib.getCollection());
	}
	
	/*@Test
	public void setCollection()
	{
		
	}*/
	
	
	@Test
	public void getBooksOnLoan()
	{
		Assert.assertEquals(booksOnLoan, lib.getBooksOnLoan());
	}
	
	@Test
	public void getUsers()
	{
		Assert.assertEquals(users, lib.getUsers());
	}
	
	@After
	public void teardown()
	{
		collection = null;
		booksOnLoan = null;
		users = null;
	}

}
