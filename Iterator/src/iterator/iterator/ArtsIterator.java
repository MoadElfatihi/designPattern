package iterator.iterator;

public class ArtsIterator implements Iterator {

	public String[] subjects;
	
	private int position;
	
	public ArtsIterator(String[] subjects) {
		this.subjects = subjects;
		this.position = 0;
	}

	@Override
	public void first() {
		position = 0;
	}

	@Override
	public String next() {
		return subjects[position++];
	}

	@Override
	public Boolean IsDone() {
		return position >= subjects.length;
	}

	@Override
	public String currentItem() {
		return subjects[position];
	}

}
