package Assignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// 12.	Write a program to accept the roll, name, and nationality of the person and display those values in good format way.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:\t");
		String name = sc.nextLine();
		System.out.println("Enter roll:");
		int roll = sc.nextInt();
		
		
		System.out.println("Enter nationality:\t");
		String nationality = sc.next();
		
		
		System.out.println("==================");
		System.out.println("Roll is "+roll);
		System.out.println("Name is "+name);		
		System.out.println("Nationality is "+nationality);
	}

}
