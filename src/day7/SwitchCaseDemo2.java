package day7;

import java.util.Scanner;

public class SwitchCaseDemo2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: ");
		
		int dayOfTheWeek =sc.nextInt();
		
		switch(dayOfTheWeek) {
		
		case 1:
		case 2:
			System.out.println("THIS IS WEEKEND, CHILL!!");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("It's a working day");
			break;
		case 7:
			System.out.println("It's friday, half day");
			break;
		default:
			System.out.println("wrong input");
			
			
			
		}
		System.out.println("Rest of the code");
	}
}
