package Assignments;

import java.util.Scanner;

public class Assignment5 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		
		sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double radius= sc.nextDouble();
		 double areaCircle = 3.14159*radius*radius;
		System.out.println("The area of circle is "+areaCircle);
		System.out.println("    ");
		
		System.out.println("Enter the length of a rectangle:");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		double breadth = sc.nextDouble();
		 double areaRectangle = length*breadth;
		System.out.println("The area of rectangle is "+areaRectangle);
		System.out.println("    ");
		
		System.out.println("Enter the height of a triangle:");
		double height = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		double breadthT = sc.nextDouble();
		 double areaTriangle = 0.5*height*breadthT;
		System.out.println("The area of triangle is "+areaTriangle);
		
		
	}

}
