package Assignments;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		//16.	Write a program to find the given number is even or odd.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: " );
		int enteredNum= sc.nextInt();
		
		if (enteredNum%2 ==0) {
			System.out.println("The number you entered is even.");
		}
		else {
			System.out.println("The number you entered is odd");
		}
		
		
	}

}
