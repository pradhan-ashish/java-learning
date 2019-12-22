package Assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// 13.	Write a program to print the number entered by user only if the number entered is negative.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int enteredNum =sc.nextInt();
		
		if (enteredNum <0) {
			System.out.println(enteredNum+" is the negative number so, the program prints it");
		}else {
			System.out.println("The number you entered is not negative so I won't display it");
		}
	}

}
