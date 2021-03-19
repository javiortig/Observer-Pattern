package libraryObserverPattern;

public class Test {
	public static void main(String[] args) {
		//Composition
		Library library = new Library();
		ModelBookAlarm model = new PushModelObservable(library);
		
		//Create the observers
		ModelObserver observerStock = new PushModelObserver("Stock");
		ModelObserver observerShopping = new PushModelObserver("Shopping");
		ModelObserver observerAdmin = new PushModelObserver("Admin");
		
		//add observers
		model.addObserver(observerAdmin);
		model.addObserver(observerShopping);
		model.addObserver(observerStock);
		
		//test with some books
		model.notifyBook("Don Quijote", false);
		System.out.println("");
		model.notifyBook("La bruja Mon", true);
		System.out.println("");
		model.notifyBook("Lazarillo de Tormes"); //This state will be random
		System.out.println("");
		
	}
}
