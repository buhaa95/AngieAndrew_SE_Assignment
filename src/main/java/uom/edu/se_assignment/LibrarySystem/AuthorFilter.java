package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class AuthorFilter extends FilterCriteria 
{
	@Override
	public List<Book> filterCriteria(List<Book> bookList, String keyword) 
	{
		List<Book> authorBookList = new ArrayList<Book>();
		String tempKeyword;
		tempKeyword = keyword.toUpperCase();
		String actualAuthorName;

		for (Book b : bookList) 
		{
			actualAuthorName = b.getAuthor().toUpperCase();
			if (actualAuthorName.contains(tempKeyword))
				authorBookList.add(b);
		}
		return authorBookList;
	}
}
