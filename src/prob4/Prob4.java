package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = ReverserAndPrinter.reverse( "Hello World" );
		ReverserAndPrinter.printCharArray( c1 );
		System.out.println();
		char[] c2 = ReverserAndPrinter.reverse( "Java Programming!" );
		ReverserAndPrinter.printCharArray( c2 );
	}
}
