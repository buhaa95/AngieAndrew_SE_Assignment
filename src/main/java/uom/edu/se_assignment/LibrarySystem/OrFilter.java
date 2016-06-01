package uom.edu.se_assignment.LibrarySystem;

import java.util.List;

public class OrFilter implements FilterCriteria 
{
	private FilterCriteria c1;
	private FilterCriteria c2;
	
	public OrFilter(FilterCriteria c1, FilterCriteria c2)
	{
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public List<Book> filterCriteria(List<Book> bookList, String keyword)
	{
		return null;
	}
	
	public List<Book> filterCriteria(List<Book> bookList, String keyword, String keyword2) 
	{
		//list returned from first filter
		List<Book> firstList = c1.filterCriteria(bookList, keyword);
		List<Book> secondList = c2.filterCriteria(bookList, keyword2);
		
		for(Book b: secondList)
		{
			if(!firstList.contains(b))
				firstList.add(b);
		}
		
		return firstList;
	}

}
