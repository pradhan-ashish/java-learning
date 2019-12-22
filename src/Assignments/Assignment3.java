package Assignments;

import java.util.Scanner;

//3.	Write a program to find sum and average of two numbers input by User (using Scanner class).
public class Assignment3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		System.out.println("What is your age? :");
		int age = input.nextInt();
		System.out.println("What is your full name? : ");
		String name = input.nextLine();
		System.out.println("What is your GPA? : ");
		double gpa = input.nextDouble();
		
		
		
		float AverageTestScore = (num1 + num2)/2;
		int sum = num1 + num2;
		
		

		
		
		System.out.println("Student's Name : "+name);
		System.out.println("Age: "+age);
		System.out.println("GPA: "+gpa);
		
		System.out.println("The total score including these two scores "+num1+ " and "+num2+ " is "+sum+" points.");
		System.out.println("The average of all three test is: "+AverageTestScore);
		
}
}