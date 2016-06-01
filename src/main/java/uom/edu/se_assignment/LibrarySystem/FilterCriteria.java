package uom.edu.se_assignment.LibrarySystem;

import java.util.List;

public interface FilterCriteria 
{
	public List<Book> filterCriteria(List<Book> bookList, String keyword);
	public List<Book> filterCriteria(List<Book> bookList, String keyword, String keyword2);
}
