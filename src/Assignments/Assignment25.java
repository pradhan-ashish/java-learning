package Assignments;

import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {
		// 25.	Write a program that prompts the user to enter the number of students and each student’s name and score.
		//Finally display the student with highest score.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		String name = null;
		int maxScore = 0;
		
		for (int i = 1; i <= numberOfStudents; i++) {
			System.out.println("Enter student name: ");
			String na = sc.next();
			System.out.println("Enter score: ");
			int score =sc.nextInt();
			
			if (score > maxScore) {
				maxScore =score;
				name = na;
				
			}
			
			
		}
		System.out.println(name+" has the highest score among all students.");
		System.out.println("And his score is "+maxScore);
		
	}

}
