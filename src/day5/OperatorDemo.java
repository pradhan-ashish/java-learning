package day5;

public class OperatorDemo {

	public static void main(String[] args) {
		// 1. Arithmetic Operators: + - * / %(modulus)
		
		System.out.println(7/3); //it gives quotient
		System.out.println(7%3);// it gives remainder
		
		int a = 4 + 5- 6 / 2 - 3 * 2 + 7 % 3;
		// precedence (* / %) priority high
		// associativity (left to right)
		
		System.out.println(a);
		
		// 2. Assignment operator: =, +=, -=, /=, *=, %=
		int b = 4 + 5- 6 / 2 - 3 * 2 + 7 % 3;
		
		int i =11;
		System.out.println(i);
		
		i = i+4; //	or (i += 4;)
		System.out.println(i);
		
		i += 4;// or (i = i+4;)
		System.out.println(i);
		
		// 3. Increment/ Decrement operator
		// ++ --
		// Post/ Pre Increment, a++, ++a
		// Post/ Pre Decrement, a--, --a
		
		int c = 5;
		// if you want to increase by just one
		c++;
		System.out.println(c);
		
		
	}


}
