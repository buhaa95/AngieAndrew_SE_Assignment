package uom.edu.se_assignment.LibrarySystem;

public interface Observable {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver(Observer o);
}
