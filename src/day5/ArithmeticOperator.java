package day5;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 1. Arithmetic Operators: + - * / %(modulus)
		
				System.out.println(7/3); //it gives quotient
				System.out.println(7%3);// it gives remainder
				
				int a = 4 + 5- 6 / 2 - 3 * 2 + 7 % 3;
				// precedence (* / %) priority high
				// associativity (left to right)
				
				System.out.println(a);
	}

}
