package Assignments;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		// 19.	Write a Program to accept three sides of triangle and display which kind of triangle is formed.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side: ");
		double firstSide= sc.nextDouble();
		System.out.println("Enter the second side: ");
		double secondSide= sc.nextDouble();
		System.out.println("Enter the third side: ");
		double thirdSide= sc.nextDouble();
		
		if((firstSide == secondSide) && (secondSide== thirdSide)) {
			System.out.println("The triangle is equilateral");
		}	
		
		else if ((firstSide==secondSide)  &&(secondSide !=thirdSide) 
				||(firstSide==thirdSide) && (firstSide != secondSide)
				||(secondSide== thirdSide) && (firstSide !=thirdSide)){
		System.out.println("The triangle is isosceles");
		
		}
		else {
			System.out.println("the triangle is scalene");
		}
		


	}

}
