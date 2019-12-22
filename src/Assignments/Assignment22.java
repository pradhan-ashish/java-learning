package Assignments;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		// 22.	Write a program to print the table of given number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a = sc.nextInt();
		int x = 1;

		System.out.println("The table of "+ a+" is:");
		System.out.println("________________________");
		
		for (x=1; x<=10; x++) {
			System.out.println(a+" x "+ x +" = "+ (a*x));
		}
	}

}
