package iterator.subject;

import iterator.iterator.ArtsIterator;
import iterator.iterator.Iterator;

public class Arts implements ISubject {

	public String[] subjects;
	
	public Arts() {
		subjects = new String[2];
		subjects[0] = "arts 1";
		subjects[1] = "arts 2";
	}
	@Override
	public Iterator createIterator() {
		return new ArtsIterator(subjects);
	}

}
