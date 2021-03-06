package uom.edu.se_assignment.LibrarySystem;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest{
	
	Book myBook;
	Genre genre, newGenre;
	User u, u1,u2,u3;
	Date date, date2;
	
	@Before 
	public void startup() 
	{
		genre = Genre.FICTION;
		newGenre = Genre.MYSTERY;
		
		u = new User(1234, "Mary Sammut", "Nadur", "123456789");
		u1 = new User(1, "John Smith", "Mosta", "00356 79007789");
		u2 = new User(15, "Ronald Briffa", "Kalkara", "0078 99856634");
		u3 = new User(22, "Kimberly Sultana", "Sliema", "006589775");
		
		date = new GregorianCalendar(2016, Calendar.JANUARY, 21).getTime();
		date2 = new GregorianCalendar(2016, Calendar.FEBRUARY,17).getTime();
		
		myBook = new Book(25,"Harry Potter and the Half Blood Prince", "J.K. Rowling", genre, 2008,1, u, date );
	}
	
	@Test
	public void getIdTest()
	{
		Assert.assertEquals(25, myBook.getBookId());
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
		Assert.assertEquals(genre, myBook.getGenre());
	}
	
	@Test
	public void setGenreTest()
	{
		myBook.setGenre(newGenre);
		Assert.assertEquals(newGenre, myBook.getGenre());
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
		Assert.assertEquals(u, myBook.getLoanee());
	}
	
	@Test
	public void setUserTest()
	{
		myBook.setLoanee(u1);
		Assert.assertEquals(u1, myBook.getLoanee());
	}
	
	
	@Test
	public void getLoanOutDateTest()
	{
		Assert.assertEquals(date, myBook.getLoanOutDate());
	}
	
	@Test
	public void setLoanOutDateTest()
	{
		myBook.setLoanOutDate(date2);
		Assert.assertEquals(date2, myBook.getLoanOutDate());
	}
	
	@Test
	public void notifyObserverTest()
	{
		//assume myBook has a waiting list
		myBook.addObserver(u);
		myBook.addObserver(u1);
		myBook.addObserver(u2);
		myBook.addObserver(u3);
		
		myBook.notifyObserver(u);
		myBook.notifyObserver(u1);
		myBook.notifyObserver(u2);
		myBook.notifyObserver(u3);	
		
		Assert.assertEquals(1, u.getPosition());
		Assert.assertEquals(2, u1.getPosition());
		Assert.assertEquals(3, u2.getPosition());
		Assert.assertEquals(4, u3.getPosition());
	}
	
	@After
	public void teardown()
	{
		myBook = null;
		genre = newGenre = null;
		u = u1 = null;
		date = date2 = null;
	}
}
