package uom.edu.se_assignment.LibrarySystem;

import java.util.List;

public class AndFilter extends FilterCriteria
{
	private FilterCriteria c1;
	private FilterCriteria c2;
	
	public AndFilter(FilterCriteria c1, FilterCriteria c2)
	{
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public List<Book> filterCriteria(List<Book> bookList, String keyword, String keyword2) 
	{
		//list returned from first filter
		List<Book> firstList = c1.filterCriteria(bookList, keyword);
		return c2.filterCriteria(firstList, keyword2);
	}
}
