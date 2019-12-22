package day7;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		// Else if demo
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test score: ");
		double score= sc.nextDouble();
		
		if (score>=90 && score<=100) {
			System.out.println("The letter grade is A");
		}
		else if(score>=80 && score<=100){
			System.out.println("The letter grade is B");
		}
		else if (score>=70 && score<=100) {
			System.out.println("The letter grade is C");
		}
		else if (score>=60 && score<=100) {
			System.out.println("The letter grade is D");
		}
		else {
			System.out.println("you fucked up");
		}
		System.out.println("rest of the code");
	}

}
