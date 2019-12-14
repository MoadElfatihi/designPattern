package observer.pattern.demo;


import observer.pattern.observers.Observer;
import observer.pattern.subject.Subject;

/**
 *  we maintain a one to many relation between subject , when the subjet changed it notified the observers
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		Observer o = new Observer();
		
		Subject sub1 = new Subject();
		sub1.register(o);
		
		sub1.set_flag(1);
		sub1.set_flag(0);
		
		sub1.unregister(o);
		sub1.set_flag(1);
		
		
		
		
	}
}
