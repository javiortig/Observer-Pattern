package libraryObserverPattern;

import java.util.Observable;

@SuppressWarnings("deprecation")
public abstract class ModelBookAlarm extends Observable {
	protected Book lastBookReturned;
	Library library; // This class has a composition relationship with library,
					// Since both depend on each other
	
	//Constructor
	ModelBookAlarm(Library library){
		this.lastBookReturned = null;
		this.library = library;
	}
	
	public Book getLastBookReturned() {
		return lastBookReturned;
	}

	public void setLastBookReturned(Book lastBookReturned) {
		this.lastBookReturned = lastBookReturned;
	}
	
	
	public void returnBookToLibrary(Book book) {
		this.library.returnBook(book);
	}
	public void returnBookToLibrary(String title) {
		this.library.returnBook(title);
	}
	public void returnBookToLibrary(String title, boolean state) {
		this.library.returnBook(title, state);
	}
	
	abstract public void notifyBook(Book book);
	abstract public void notifyBook(String title);
	abstract public void notifyBook(String title, boolean state);

}
