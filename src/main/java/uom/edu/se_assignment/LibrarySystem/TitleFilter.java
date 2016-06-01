package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class TitleFilter implements FilterCriteria 
{
	public List<Book> filterCriteria(List<Book> bookList, String keyword) 
	{
		List<Book> titleBookList = new ArrayList<Book>();

		for (Book b : bookList) {
			if (b.getTitle().equalsIgnoreCase(keyword))
				titleBookList.add(b);
		}
		return titleBookList;
	}
	
	public List<Book> filterCriteria(List<Book> bookList, String keyword, String keyword2)
	{
		return null;
	}
}
