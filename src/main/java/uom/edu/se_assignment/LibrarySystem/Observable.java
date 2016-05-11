package uom.edu.se_assignment.LibrarySystem;

public interface Observable {
	public void addObserver(Observer u);
	public void removeObserver(Observer u);
	public void notifyObserver();
}
