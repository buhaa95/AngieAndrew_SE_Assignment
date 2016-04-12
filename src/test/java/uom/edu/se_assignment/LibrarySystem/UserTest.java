package uom.edu.se_assignment.LibrarySystem;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user;
	
	@Before
	public void startup()
	{
		user = new User(1, "John Smith", "Mosta", "00356 79007789");
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
	
	@After
	public void teardown()
	{
		user = null;
	}
}
