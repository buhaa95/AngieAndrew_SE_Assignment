package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	Library lib;
	List<Book> booksOnLoan;
	List<User> users;
	Book myBook, myBook1, myBook2, myBook3;
	User u,u1,u2;
	
	@Before
	public void setup()
	{
		lib = new Library();
		booksOnLoan = new ArrayList<Book>();
		users = new ArrayList<User>(); 
		
		myBook = new Book(27,"Harry Potter and the Half Blood Prince", "J.K. Rowling", Genre.FICTION, 2008, 1, null, null);
	    myBook1 = new Book(48,"Lord of the Rings", "J.R.R Tolkien", Genre.FICTION, 2005, 1, null, null); 
	    myBook2 = new Book(50,"Java for dummies", "Barry Burd", Genre.SCIENCE, 2005, 1, null, null);
	    myBook3 = new Book(28,"Harry Potter and the Deathly Hallows", "J.K. Rowling", Genre.FICTION, 2010, 1, null, null);
	    
		booksOnLoan.add(myBook);
		booksOnLoan.add(myBook3);
		

		u = new User(1234, "Mary Sammut", "Nadur", "123456789");
		u1 = new User(1, "John Smith", "Mosta", "00356 79007789");
		u2 = new User(15, "Ronald Briffa", "Kalkara", "0078 99856634");
		
		users.add(u);
		users.add(u1);
		users.add(u2);
	}
	
	@Test
	public void getBooksOnLoan()
	{
		Assert.assertEquals(2, lib.getBooksOnLoan().size());
	}
	
	@Test
	public void getUsers()
	{
		Assert.assertEquals(3, lib.getUsers().size());
	}
	
	@After
	public void teardown()
	{
		booksOnLoan = null;
		users = null;
	}

}
