package Assignments;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		// 10.	Write a Program for the following Mathematical Function. (10. B)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		double b = sc.nextDouble();
		System.out.println("Enter c");
		double c = sc.nextDouble();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("The area is calculated as :"+ area);
		
		
		
	}

}
