package Day2;

import java.util.Scanner;

public class AverageByUserInput {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first test score: ");
		int score1 = input.nextInt();
		System.out.println("Enter the second test score: ");
		int score2 = input.nextInt();
		System.out.println("Enter the third test score: ");
		int score3 =input.nextInt();
		int AverageTestScore = (score1 + score2+ score3)/3;
		
		System.out.println("The average of all three test is: "+AverageTestScore);
		
		
	}
}
