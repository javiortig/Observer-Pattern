package libraryObserverPattern;

import java.util.Random;

public class Book {
	private static final float GOOD_BOOK_PERCENTAGE = 0.4f;
	private static Random rnd = new Random();
	
	private boolean damaged; // True if the book is in bad state
	private String title;
	
	Book(){
		this.title = "Untitled";
		this.damaged = chooseRandomState();
	}
	Book(String title){
		this.title = title;
		this.damaged = chooseRandomState();
	}
	
	Book(String title, boolean state){
		this.title = title;
		this.damaged = state;
	}
	
	public boolean isDamaged() {
		return this.damaged;
	}
	public void setState(boolean state) {
		this.damaged = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	private boolean chooseRandomState() {
		//Randomly chooses the state of the book
		if(rnd.nextFloat() > GOOD_BOOK_PERCENTAGE)
			return true;
		else
			return false;	
	}
}
