package Assignments;

import java.util.Scanner;

public class Assignment4 {
// 4.	Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount in dollars: ");
		int principle = sc.nextInt();
		System.out.println("Enter the time period: ");
		int time = sc.nextInt();
		System.out.println("Enter the interest rate in percentage: ");
		double rate = sc.nextDouble();
		
		double interest = (principle* time* rate)/100;
		System.out.println("The simple interest is : "+interest);
		
		
	}

}
