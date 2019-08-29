package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s1 = ap.nextString("type your name");
		String s2 = ap.nextString("type your name");
		String s3 = ap.nextString("type your name");
		String s4 = ap.nextString("type your name");

		System.out.println("Hi,  " + s1 + " how are you doing today");
		System.out.println("Hi,  " + s2 + " how are you doing today");
		System.out.println("Hi,  " + s3 + " how are you doing today" ) ;
		System.out.println("Hi,  " + s4 + " how are you doing today" ) ;



		//
		// Say hello to the names in s0 through s3.
		//

	}
}