package iterator.iterator;

public interface Iterator {

	void first(); // reset to first element
	
	String next(); // get next element
	
	Boolean IsDone(); // end of colletion check
	
	String currentItem(); // Retrieve Current item
}
