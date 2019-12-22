package Assignments;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {
		// 21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 7:");
		int nthDay = sc.nextInt();
		
		switch (nthDay) {
		
		case 1:
			System.out.println("First day of the week is sunday.");
			break;
		case 2:
			System.out.println("Second day of the week is monday");
			break;
		case 3:
			System.out.println("Third day of the week is tuesday.");
			break;
		case 4:
			System.out.println("Fourth day of the week is wednesday");
			break;
		case 5:
			System.out.println("Fifth day of the week is thursday.");
			break;
		case 6:
			System.out.println("Sixth day of the week is friday");
			break;
		case 7:
			System.out.println("Seventh day of the week is saturday.");
			break;
		default:
			System.out.println("enter number from 1 to 7 you dumbass:");
		}

	}

}
