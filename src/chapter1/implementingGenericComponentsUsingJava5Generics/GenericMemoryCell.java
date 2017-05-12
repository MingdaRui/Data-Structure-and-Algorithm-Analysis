package chapter1.implementingGenericComponentsUsingJava5Generics;

/*
 * Figure 1.9 Generic implementation of the MemoryCell class
 * */

public class GenericMemoryCell<AnyType> {

	private AnyType storedValue;
	
	public AnyType read() {
		return storedValue;
	}

	public void write( AnyType x ) {
		storedValue = x;
	}
	
}
