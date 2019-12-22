package Day2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner naya = new Scanner(System.in);
		System.out.println("What is your name? : ");
		String name = naya.next();
		System.out.println("What is your age ? : ");
		int age = naya.nextInt();
		
		System.out.println("The name of the person is "+name);
		System.out.println(name+" is "+age+" years old.");
		
		
	}

}
