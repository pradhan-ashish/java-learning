package Assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// 6.	Write a program to find the perimeter of a circle, triangle, and rectangle.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double radius = sc.nextDouble();
		double perimeterC = 2*3.14159*radius;
		System.out.println("The perimeter of circle is "+perimeterC);
	}

}
