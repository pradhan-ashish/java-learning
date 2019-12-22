package Assignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// 17.	Write a program to calculate leap year.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		if ((year % 4 ==0) || (year % 400 ==0) && (year % 100 !=0)){
			System.out.println("this is leap year");
	
		}
		else {
			System.out.println("This is not a leap year");
		}
		

	}

}
