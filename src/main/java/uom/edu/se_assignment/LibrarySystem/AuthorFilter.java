package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class AuthorFilter implements FilterCriteria 
{
	public List<Book> filterCriteria(List<Book> bookList, String keyword) 
	{
		List<Book> authorBookList = new ArrayList<Book>();

		for (Book b : bookList) {
			if (b.getAuthor().equalsIgnoreCase(keyword))
				authorBookList.add(b);
		}
		return authorBookList;
	}
	
	public List<Book> filterCriteria(List<Book> bookList, String keyword, String keyword2)
	{
		return null;
	}
}
