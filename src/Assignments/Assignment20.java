package Assignments;

import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		// 20.	Write a program to create the equivalent of a four-function calculator. The program to enter two integer’s numbers and an operator. 
		//It then carries out the specified arithmetic operator operations: addition, subtraction,
		//multiplication or division of the two numbers. Finally, it displays the result.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number:");// pressed 1st number
		int a = sc.nextInt();
		System.out.println("Enter the operator: ");
		char operation =sc.next().charAt(0);// pressed operator
		
		System.out.println("Enter second number:");// pressed 2nd number
		int b = sc.nextInt();
		
		switch (operation) {
		
		case '+':
			System.out.println(a +" + "+b+" = "+(a+b));
			break;
		
		case '-':
			System.out.println(a +" - "+b+" = "+(a-b));
			break;
		
		case '*':
			System.out.println(a +" * "+b+" = "+(a*b));
			break;
		
		case '/':
			System.out.println(a +" / "+b+" = "+(a/b));
			break;
		
		default:
			System.out.println("Wrong input");
		}

	}

}
