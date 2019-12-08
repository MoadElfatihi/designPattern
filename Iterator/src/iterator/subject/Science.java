package iterator.subject;

import java.util.LinkedList;

import iterator.iterator.Iterator;
import iterator.iterator.ScienceIterator;

public class Science implements ISubject {
	
	
	private	LinkedList<String> subjects;
	
	
	public Science() {
		subjects = new LinkedList<String>();
		subjects.addLast("M 1");
		subjects.addLast("M 2");
		subjects.addLast("M 3");
	}


	@Override
	public Iterator createIterator() {
		
		return new ScienceIterator(subjects);
	}

}
