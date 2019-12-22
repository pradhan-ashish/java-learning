package Assignments;

import java.util.Scanner;

public class Assignment10a {

	public static void main(String[] args) {
		// 10.	Write a Program for the following Mathematical Function. (10. A)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter u");
		double u = sc.nextDouble();
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter t");
		double t = sc.nextDouble();
		
		double s = u*t +0.5*a*Math.pow(t, 2);
		System.out.println("The value of S is calculated as :"+ s);
		
		
	}

}
