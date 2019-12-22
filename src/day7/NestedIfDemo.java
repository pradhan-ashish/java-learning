package day7;

public class NestedIfDemo {

	public static void main(String[] args) {
		// Nested if demo
		int a =5;
		int b =7;
		int c = 8;
		
		if (a<b) {
			if (a<c) {
			System.out.println("a is the smallest one");
			}
			else {
				System.out.println("c is the smallest one");
			
			}
		}
		else {
			System.out.println("maybe b or c is the smallest one");
		}
			System.out.println("rest of the code");
	}

}
