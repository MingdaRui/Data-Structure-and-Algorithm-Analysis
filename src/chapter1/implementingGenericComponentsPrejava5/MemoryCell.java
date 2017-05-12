package chapter1.implementingGenericComponentsPrejava5;

// Figure 1.5 A generic MemoryCell class (pre-Java 5)
// MemoryCell class
// Object read()          --> Returns the stored value
// void write( Object x ) --> x is stored 

public class MemoryCell {

	// Private internal data representation
	private Object storedValue;
	
	// Public methods
	public Object read() {
		return storedValue;
	}
	
	public void write( Object x ) {
		storedValue = x;
	}
	
}
