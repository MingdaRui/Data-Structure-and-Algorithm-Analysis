package chapter1.implementingGenericComponentsUsingJava5Generics;

/*
 * Figure 1.11b Autoboxing and unboxing (Java 7, using diamond operator)
 * */

public interface BoxingDemo {

	public static void main( String[] args ) {
		
		GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
		// GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		
		m.write(5);
		int val = m.read();
		System.out.println( "Contents are: " + val );
		
	}
	
}
