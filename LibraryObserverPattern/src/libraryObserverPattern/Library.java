package libraryObserverPattern;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	
	// Constructor
	Library(){
		this.books = new ArrayList<Book>();
	}
	
	/* A client returns the book to the library. If it's damaged, 
	 * the observable will trigger A book can be returned from the library 
	 * or directly from the ModelBookAlarm(Observable), 
	*/
	public void returnBook(Book book) {
		this.books.add(book);
	}
	
	public void returnBook(String title) {
		Book book = new Book(title); 
		this.returnBook(book);
	}
	public void returnBook(String title, boolean state) {
		Book book = new Book(title, state); 
		this.returnBook(book);
	}
	

}
