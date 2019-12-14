package observer.pattern.subject;

import java.util.ArrayList;
import java.util.List;

import observer.pattern.observers.Observer;


public class Subject implements ISubject {

	List<Observer> observerList = new ArrayList<>();
	
	private int _flag;
	
	
	public int get_flag() {
		return _flag;
	}

	public void set_flag(int _flag) {
		this._flag = _flag;
		this.notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for(int i = 0; i < observerList.size(); i++)
			observerList.get(i).update();
	}

	@Override
	public void register(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observerList.remove(observer);
	}

}
