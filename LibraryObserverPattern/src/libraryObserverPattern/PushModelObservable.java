package libraryObserverPattern;

public class PushModelObservable extends ModelBookAlarm{
	
	PushModelObservable(Library library) {
		super(library);
	}

	//Notify the new book returned by the PUSH philosophy
	@Override
	public void notifyBook(Book book) {
		this.returnBookToLibrary(book);
		
		if (book.isDamaged()) {
			this.setLastBookReturned(book);
			setChanged();
			notifyObservers(this.getLastBookReturned());
		}
		else {
			System.out.println("The book is in good state. No need to notify...");
		}
	}
	@Override
	public void notifyBook(String title) {
		notifyBook(new Book(title));
		
	}
	@Override
	public void notifyBook(String title, boolean state) {
		notifyBook(new Book(title, state));	
	}
	
	
	
	
}
