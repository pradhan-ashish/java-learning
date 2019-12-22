package Assignments;

import java.util.Scanner;

public class Assignment10C {

	public static void main(String[] args) {
		//Quadratic eqn
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		double b = sc.nextDouble();
		System.out.println("Enter c");
		double c = sc.nextDouble();

		double x =(-b+ Math.sqrt(Math.pow(b, 2)-4*a*c))/2;
		System.out.println(x);
		
	}

}
