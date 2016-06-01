package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class YearFilter extends FilterCriteria 
{
	@Override
	public List<Book> filterCriteria(List<Book> bookList, String keyword)
	{
		List<Book> yearBookList = new ArrayList<Book>();
		
		for (Book b:bookList)
		{
			if (b.getPublicationYear()==Integer.parseInt(keyword))
				yearBookList.add(b);
		}
		return yearBookList;
	}
}
