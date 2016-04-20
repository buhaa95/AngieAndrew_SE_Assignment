package uom.edu.se_assignment.LibrarySystem;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	Library lib;
	
	Book b, b1, b2, b3, b4, b5, b6, b7, b8;
	User u,u1,u2,u3,u4,u5,u6,u7;
	Date date;
	
	@Before
	public void setup()
	{
		lib = new Library();
		
		// LoanOutDate and User are set to null upon creation. They will be changed accordingly in the test cases. 
		b = new Book(27,"Harry Potter and the Half Blood Prince", "J.K. Rowling", Genre.FICTION, 2008, 1, null, null);
	    b1 = new Book(48,"Lord of the Rings", "J.R.R Tolkien", Genre.FICTION, 2005, 1, null, null); 
	    b2 = new Book(50,"Java for dummies", "Barry Burd", Genre.SCIENCE, 2005, 1, null, null);
	    b3 = new Book(28,"Harry Potter and the Deathly Hallows", "J.K. Rowling", Genre.FICTION, 2010, 1, null, null);
	    b4 = new Book(50, "Great Expectations", "Charles Dickens", Genre.CLASSIC, 1997, 1, null, null);
	    b5 = new Book(845, "Soppy", "Philippa Rice", Genre.COMEDY, 2015,1, null, null);
	    b6 = new Book(98, "The Amityville Horror", "Jay Anson", Genre.HORROR, 2006, 1, null, null);
	    b7 = new Book(452, "Medical Museum", "Anthony William", Genre.SCIENCE, 2015, 1, null, null);
	    b8 = new Book(24, "Steve Jobs: The Exclusive Biography", "Walter Isaacson", Genre.BIOGRAPHY, 2011, 1, null, null);
	    

		u = new User(1234, "Mary Sammut", "Nadur", "123456789");
		u1 = new User(1, "John Smith", "Mosta", "00356 79007789");
		u2 = new User(15, "Ronald Briffa", "Kalkara", "0078 99856634");
		u3 = new User(22, "Kimberly Sultana", "Sliema", "006589775");
		u4 = new User(22, "Manuel Borg", "Mellieha", "45667442545"); // same ID
		u5 = new User(564, "Thea Attard", "Birkirkara", "4561257898");
		u6 = new User(8524, "Matthew Bartolo", "Zebbug", "0232156 06151");
		u7 = new User(2459, "Francis Camilleri", "Birgu", "45623 20356");
		

	}
	
	@Test
	public void addUserTestValid()
	{
		lib.addUser(u);
		lib.addUser(u1);
		lib.addUser(u2);
		lib.addUser(u3);
		lib.addUser(u5);
		lib.addUser(u6);
		lib.addUser(u7);
		
		Assert.assertEquals(7, lib.getUsers().size());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void addUserTestInValid() throws Exception
	{
		lib.addUser(u);
		lib.addUser(u1);
		lib.addUser(u2);
		lib.addUser(u3);
		lib.addUser(u4);
		lib.addUser(u5);
		lib.addUser(u6);
		lib.addUser(u7);
	}
	
	@Test
	public void addBookTestValid()
	{
		lib.addBook(b);
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b5);
		lib.addBook(b6);
		lib.addBook(b7);
		lib.addBook(b8);
		
		
		Assert.assertEquals(8, lib.collection.size());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void addBookTestInValid() throws Exception
	{
		lib.addBook(b);
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		lib.addBook(b5);
		lib.addBook(b6);
		lib.addBook(b7);
		lib.addBook(b8);
	}
	
	@Test
	public void removeUserValid()
	{
		lib.addUser(u);
		lib.addUser(u1);
		lib.addUser(u2);
		lib.addUser(u3);
		lib.addUser(u5);
		lib.addUser(u6);
		lib.addUser(u7);
		
		lib.removeUser(u);
		
		Assert.assertEquals(6, lib.getUsers().size());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void removeUserInValid()
	{
		lib.addUser(u);
		lib.addUser(u1);
		lib.addUser(u2);
		lib.addUser(u3);
		lib.addUser(u5);
		lib.addUser(u6);
		lib.addUser(u7);
		
		lib.removeUser(u4);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void loanBookToInValid1() 
	{
		// book already loaned out 
		
		lib.addBook(b1);
		lib.booksOnLoan.add(b1);
		
		lib.loanBookTo(b1,u1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void loanBookToInValid2() 
	{
		// user has already 3 books
		
		u2.addBook(b);
		u2.addBook(b1);
		u2.addBook(b5);
				
		lib.loanBookTo(b2,u2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void loanBookToInValid3() 
	{
		// book has exceeded 4 weeks
		date = new GregorianCalendar(2016,Calendar.JANUARY,11).getTime();
		b5.setLoanOutDate(date);
		u2.addBook(b5);
		
		lib.loanBookTo(b1,u2);
	}
	
	
	
	@Test
	public void getBooksOnLoan()
	{
		Assert.assertEquals(2, lib.getBooksOnLoan().size());
	}
	
	@Test
	public void getUsers()
	{
		lib.addUser(u);
		lib.addUser(u1);
		lib.addUser(u2);
		lib.addUser(u3);
		lib.addUser(u5);
		lib.addUser(u6);
		lib.addUser(u7);
		
		Assert.assertEquals(7, lib.getUsers().size());
	}
	
	
	
	@After
	public void teardown()
	{
	
	}

}
