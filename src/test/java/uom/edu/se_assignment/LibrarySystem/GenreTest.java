package uom.edu.se_assignment.LibrarySystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenreTest {

	Genre myGenre;
	
	@Before 
	public void startup() 
	{
		myGenre = new Genre("Mystery");
	}
	
	@Test
	public void getGenreType()
	{
		Assert.assertEquals("Mystery", myGenre.getGenreType());
	}
	
	@Test
	public void setGenreType()
	{
		myGenre.setGenreType("Fiction");
		Assert.assertEquals("Fiction", myGenre.getGenreType());
	}
	
	@After
	public void teardown()
	{
		myGenre = null;
	}
	
	
	

}
