package libraryObserverPattern;

import java.util.Observable;

public class PushModelObserver extends ModelObserver {
	public PushModelObserver(String name) {
		super(name);
	}

	@Override
	public void update(Observable observable, Object object) {
		System.out.println("(Push model):");
		System.out.println("/" + this.name + "/ has been notified there was a problem with "
				+ "the book '" + ((ModelBookAlarm) observable).getLastBookReturned().getTitle() + "'");
	}
}
