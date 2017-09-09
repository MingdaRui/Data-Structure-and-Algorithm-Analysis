package chapter1.implementingGenericComponentsUsingJava5Generics;

import java.util.Comparator;

public class CaseInsensitiveCompare implements Comparator<String> {

	@Override
	public int compare(String lhs, String rhs) {
		// TODO Auto-generated method stub
		return lhs.compareToIgnoreCase( rhs );
	}
	
//	public static void main( String[] args ) {
//		String[] arr = { "ZEBRA", "alligator", "crocodile" };
//		System.out.println( findMaxClass.findMax( arr, new CaseInsensitiveCompare() ) );
//	}
	
}


class TestProgram {
	public static void main( String[] args ) {
		String[] arr = { "ZEBRA", "alligator", "crocodile" };
		System.out.println( findMaxClass.findMax( arr, new CaseInsensitiveCompare() ) );
	}
}

class findMaxClass {
	
	// Generic findMax, with a function object.
		// Precondition: a.size() > 0.
		public static <AnyType> AnyType findMax( AnyType[] arr, Comparator<? super AnyType> cmp ) {
			
			int maxIndex = 0;
			
			for( int i = 1; i < arr.length; i++ ) {
				if( cmp.compare( arr[ i ], arr[ maxIndex ] ) > 0 ) {
					maxIndex = i;
				}
			}
			
			return arr[ maxIndex ];
			
		}
	
}


