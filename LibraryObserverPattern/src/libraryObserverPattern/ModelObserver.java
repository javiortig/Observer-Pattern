package libraryObserverPattern;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings({ "deprecation" })
public abstract class ModelObserver implements Observer {
	protected String name; // Stock, Shopping, Admin...
	
	ModelObserver(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ModelObserver() {
		super();
	}
	

	abstract public void update(Observable observable, Object object);
}
