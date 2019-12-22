package day7;

import java.util.Scanner;

public class SwitchCaseDemo5 {

	public static void main(String[] args) {
		// java 7 dekhe string use garna pauchau

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: ");
		
		String selection =sc.next();
		
		switch(selection) {
		
		case "add":
			System.out.println("addition");
			break;
		case "sub":
			System.out.println("subtraction");
			break;
		case "div":
			System.out.println("division");
			break;
		case "mul":
			System.out.println("multiplication");
			break;
		default:
			System.out.println("wrong input");
			
			
			
		}
		System.out.println("Rest of the code");
	}
	}


