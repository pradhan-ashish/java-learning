package day4;

public class LiteralsDemo {

	public static void main(String[] args) {
		
		//1. Integer Literal: 34323514546
		byte b =118;
		short s = 32767;
		int iMax = 2147483647;
		long l = 2147483647;
		long l2 = 2147483648; // error because it understands it as integer and it is more than int max, 
		long l3 = 2147483648L; // explain it is long by typing L
		
		//2. Float literal 4.5 2.5 (double)
		double d = 4.5;
		float f = 4.5; // error because it sees 4.5 as double value
		float f1 = 4.5F; // let it know it is a float value
		
		// 3. Boolean literal
		boolean bl = true;
		boolean bl1 = false;
		
		// 4. Character literal
		char c1 = 'a';
		char c2 = '2';
		char c3 = '@';
		char c4 = 'a'; //error because it is more than one character
		
		char c5= '\u0001';
		
		// 5. String Literal
		String name = "Ram";
		String password = "sdf2342@$#$#  3434  , ";
		
		// Null Literal 
		String blank = null;
		String blank1 = "   ";
		
		LiteralsDemo l1;
		
		LiteralsDemo ll = new LiteralsDemo(); // new class name () . this is called object
		LiteralsDemo lk = null; // kunai class ko name bata variable banauda, tesma kei narakhne ho vane null rakhne.
		

	}

}
