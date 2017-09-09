package chapter1.implementingGenericComponentsPrejava5;

/*
 * Figure 1.7 An illustration of the Integer wrapper class
 * */

public class WrapperDemo {

	public static void main( String[] args ) {
		
		MemoryCell m = new MemoryCell();
		
		m.write( new Integer( 37 ) );
		Integer wrapperVal = (Integer) m.read();
		int val = wrapperVal.intValue();
		System.out.println( "Contents are: " + val );
		
	}
	
}
