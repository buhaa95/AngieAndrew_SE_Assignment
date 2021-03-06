package uom.edu.se_assignment.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class GenreFilter extends FilterCriteria
{
	@Override
	public List<Book> filterCriteria(List<Book> bookList, String keyword)
	{
		Genre genre = Genre.valueOf(keyword.toUpperCase());
		List<Book> genreBookList = new ArrayList<Book>();

		for (Book b: bookList)
		{
			if(b.getGenre() == genre)
				genreBookList.add(b);
		}
		return genreBookList;
	}
}
