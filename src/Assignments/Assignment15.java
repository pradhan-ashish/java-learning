package Assignments;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		//15.	Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number between 0 to 128 :");
		int n = sc.nextInt();
		
		if (n>=0 && n<=128) {
			char c = (char)n;
			System.out.println("Corresponding ASCII code is: "+c);
			
		}
		else {
			System.out.println("the number you entered is not in range");
		}
	}

}
