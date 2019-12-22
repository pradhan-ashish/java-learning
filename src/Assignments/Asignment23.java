package Assignments;

import java.util.Scanner;

public class Asignment23 {

	public static void main(String[] args) {
		// 23.	Write a Program to sum 1 to nth natural numbers.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number:");
		int number = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=number; i++) {
			sum= sum+i;;
		
	}
		System.out.println("The sum of all natural numbers till "+ number+" is "+sum);
}
}
