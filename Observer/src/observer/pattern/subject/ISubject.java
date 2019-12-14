package observer.pattern.subject;

import observer.pattern.observers.Observer;

public interface ISubject {

	void notifyObservers();
	
	void register(Observer observer);
	
	void unregister(Observer observer);

	
}
