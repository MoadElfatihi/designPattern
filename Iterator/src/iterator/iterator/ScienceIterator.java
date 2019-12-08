package iterator.iterator;

import java.util.LinkedList;

public class ScienceIterator implements Iterator {
	
	private	LinkedList<String> subjects;
	
	private int position;
	
	public ScienceIterator(LinkedList<String> subjects) {
		this.subjects = subjects;
		this.position = 0;
	}

	@Override
	public void first() {
		position = 0;
	}

	@Override
	public String next() {
		return subjects.get(position++);
	}

	@Override
	public Boolean IsDone() {
		// TODO Auto-generated method stub
		return position >= subjects.size();
	}

	@Override
	public String currentItem() {
		// TODO Auto-generated method stub
		return subjects.get(position);
	}

}
