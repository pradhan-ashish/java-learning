package day7;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: ");// if 1 is entered, choice = 1)
		
		int choice =sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("addition");
			break;
		case 2:
			System.out.println("subtraction");
			break;
		case 3:
			System.out.println("division");
			break;
		case 4:
			System.out.println("multiplication");
			break;
		default:
			System.out.println("wrong input");// yo default mathi vayo vane break raknu parcha natra tala ko division print garcha
			
			
			
		}
		System.out.println("Rest of the code");
	}

}
