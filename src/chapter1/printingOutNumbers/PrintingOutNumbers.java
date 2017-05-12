package chapter1.printingOutNumbers;

/*
 * Figure 1.4 Recursive routine to print an integer
 * */

public class PrintingOutNumbers {

	public static void main( String[] args ) {
		
		new PrintingOutNumbers().printOut( 735 );
		
	}
	
	public void printOut( int n ) { /* Print nonnegative n */
		
		if( n >= 10 ) {
			printOut( n / 10 );
		}
		printDigit( n % 10 ); /* % is expensive */
		
	}
	
	public void printDigit( int n ) {
		
		System.out.print( n + " " );
		
	}
	
}
