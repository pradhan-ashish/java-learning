package Assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		//7.	Write a program that reads the radius and length of a cylinder and computes volume.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.println("Enter length:");
		double height = sc.nextDouble();
		
		double PI = Math.PI;
		
		double volume = PI*radius*radius*height;
		System.out.println("The volume of cylinder is "+volume+"sq ft.");
				

	}

}
