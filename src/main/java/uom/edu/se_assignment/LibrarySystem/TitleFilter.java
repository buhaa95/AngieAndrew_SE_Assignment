package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class TitleFilter extends FilterCriteria 
{
	@Override
	public List<Book> filterCriteria(List<Book> bookList, String keyword) 
	{
		List<Book> titleBookList = new ArrayList<Book>();
		String tempKeyword;
		tempKeyword = keyword.toUpperCase();
		String actualTitle;

		for (Book b : bookList) 
		{
			actualTitle = b.getTitle().toUpperCase();
			if (actualTitle.contains(tempKeyword))
				titleBookList.add(b);
		}
		return titleBookList;
	}
}
