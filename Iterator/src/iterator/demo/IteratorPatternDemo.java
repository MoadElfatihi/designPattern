package iterator.demo;

import iterator.iterator.Iterator;
import iterator.iterator.ScienceIterator;
import iterator.subject.Arts;
import iterator.subject.ISubject;
import iterator.subject.Science;

/**
 * we use this pattern when we want to iterate through an aggregate object that aren't the same (like array and hashmap) 
 * and we don't want to know the nature of those agregate objects 
 * As a consequence , the client will use an iterator and acess element of aggregate object without knowing the type of the datastructure
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		ISubject sc_subject = new Science();
		ISubject ar_subject = new Arts();
		
		Iterator sc_iterator = sc_subject.createIterator();
		Iterator ar_iterator = ar_subject.createIterator();
		
		System.out.println("science subject");
		print(sc_iterator);
		
		System.out.println("arts subject");
		print(ar_iterator);
		
	}
	
	public static void print(Iterator iterator) {
		while(!iterator.IsDone()) {
			System.out.println(iterator.next());
		}
	}
}
